package com.cloud.ribbon.pojo;

import java.util.Date;

public class BlogPicture {
    private Long fId;

    private String fBlogId;

    private String fPictureUrl;

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

    public String getfBlogId() {
        return fBlogId;
    }

    public void setfBlogId(String fBlogId) {
        this.fBlogId = fBlogId == null ? null : fBlogId.trim();
    }

    public String getfPictureUrl() {
        return fPictureUrl;
    }

    public void setfPictureUrl(String fPictureUrl) {
        this.fPictureUrl = fPictureUrl == null ? null : fPictureUrl.trim();
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