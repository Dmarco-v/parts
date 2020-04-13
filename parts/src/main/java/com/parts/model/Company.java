package com.parts.model;

/**
 * @author Dmarco
 */
public class Company {
    private Long id;
    private String companyName;
    private String companyAddress;
    private Long companyFollowerId;
    private String companyDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Long getCompanyFollowerId() {
        return companyFollowerId;
    }

    public void setCompanyFollowerId(Long companyFollowerId) {
        this.companyFollowerId = companyFollowerId;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }
}
