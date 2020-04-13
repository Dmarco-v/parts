package com.parts.dao;

import com.parts.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Dmarco
 */
@Mapper
public interface CompanyDao {

    /**
     * 查询id
     * @param id
     * @return
     */
    @Select("select * from company where id=#{id}")
    public Company getCompanyById(@Param("id") Long id);

    /**
     * 查询企业列表
     * @return
     */
    @Select("select * from company")
    public List<Company> listCompany();
}
