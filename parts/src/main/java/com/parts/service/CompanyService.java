package com.parts.service;

import com.parts.dao.CompanyDao;
import com.parts.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dmarco
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    public Company getCompanyById(Long id){
        return companyDao.getCompanyById(id);
    }

    public List<Company> listCompany(){
        return companyDao.listCompany();
    }

}
