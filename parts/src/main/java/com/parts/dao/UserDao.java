package com.parts.dao;

import com.parts.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Dmarco
 */
@Mapper
public interface UserDao {

    /**
     * 查询id
     * @param id
     * @return
     */
    @Select("select u.*,a.auth_name,a.auth_type from user u left join user_auth a on u.aid=a.id where u.id=#{id} ")
    public User getUserById(@Param("id") Long id);

    /**
     * 查询user列表
     * @return
     */
    @Select("select u.*,a.auth_name,a.auth_type from user u left join user_auth a on u.aid=a.id")
    public List<User> listUser();

}
