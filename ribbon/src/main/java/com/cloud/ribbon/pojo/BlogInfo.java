package com.cloud.ribbon.pojo;

import java.util.Date;

public class BlogInfo {
    private Long fId;

    private String fCode;

    private String fTitle;

    private String fType;

    private String fAuther;

    private Long fIsPrivate;

    private Long fGreatCount;

    private Integer fStatus;

    private Long fSort;

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

    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle == null ? null : fTitle.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public String getfAuther() {
        return fAuther;
    }

    public void setfAuther(String fAuther) {
        this.fAuther = fAuther == null ? null : fAuther.trim();
    }

    public Long getfIsPrivate() {
        return fIsPrivate;
    }

    public void setfIsPrivate(Long fIsPrivate) {
        this.fIsPrivate = fIsPrivate;
    }

    public Long getfGreatCount() {
        return fGreatCount;
    }

    public void setfGreatCount(Long fGreatCount) {
        this.fGreatCount = fGreatCount;
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    public Long getfSort() {
        return fSort;
    }

    public void setfSort(Long fSort) {
        this.fSort = fSort;
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