package com.cloud.ribbon.pojo;

import java.util.Date;

public class BlogType {
    private Long fId;

    private String fCode;

    private String fName;

    private String fValue;

    private String fRemark;

    private Long fCreateUser;

    private Date fCreateDate;

    private Date fUpdateDate;

    private Long fVersion;

    private Long fIsDelete;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode == null ? null : fCode.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfValue() {
        return fValue;
    }

    public void setfValue(String fValue) {
        this.fValue = fValue == null ? null : fValue.trim();
    }

    public String getfRemark() {
        return fRemark;
    }

    public void setfRemark(String fRemark) {
        this.fRemark = fRemark == null ? null : fRemark.trim();
    }

    public Long getfCreateUser() {
        return fCreateUser;
    }

    public void setfCreateUser(Long fCreateUser) {
        this.fCreateUser = fCreateUser;
    }

    public Date getfCreateDate() {
        return fCreateDate;
    }

    public void setfCreateDate(Date fCreateDate) {
        this.fCreateDate = fCreateDate;
    }

    public Date getfUpdateDate() {
        return fUpdateDate;
    }

    public void setfUpdateDate(Date fUpdateDate) {
        this.fUpdateDate = fUpdateDate;
    }

    public Long getfVersion() {
        return fVersion;
    }

    public void setfVersion(Long fVersion) {
        this.fVersion = fVersion;
    }

    public Long getfIsDelete() {
        return fIsDelete;
    }

    public void setfIsDelete(Long fIsDelete) {
        this.fIsDelete = fIsDelete;
    }
}