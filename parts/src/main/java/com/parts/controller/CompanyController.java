package com.parts.controller;

import com.parts.model.Company;
import com.parts.result.Result;
import com.parts.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Dmarco
 */
@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/get")
    @ResponseBody
    public Result<Company> getCompanyById(@RequestParam("id") Long id){
        return Result.success(companyService.getCompanyById(id));
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result<List<Company>> listCompany(){
        return Result.success(companyService.listCompany());
    }


}
