package com.cloud.ribbon.pojo;

import java.util.Date;

public class UserBean {
    private Long fId;

    private String fUserPassword;

    private String fUserRelname;

    private String fUserNick;

    private String fUserHead;

    private Integer fUserSex;

    private Integer fUserAge;

    private Date fUserBirthday;

    private String fUserEmail;

    private String fUserPhone;

    private Integer fUserMarriage;

    private Integer fUserEducation;

    private Integer fUserIndustries;

    private Integer fUserType;

    private Integer fUserStatus;

    private Date fCreateTime;

    private Date fLastLogin;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfUserPassword() {
        return fUserPassword;
    }

    public void setfUserPassword(String fUserPassword) {
        this.fUserPassword = fUserPassword == null ? null : fUserPassword.trim();
    }

    public String getfUserRelname() {
        return fUserRelname;
    }

    public void setfUserRelname(String fUserRelname) {
        this.fUserRelname = fUserRelname == null ? null : fUserRelname.trim();
    }

    public String getfUserNick() {
        return fUserNick;
    }

    public void setfUserNick(String fUserNick) {
        this.fUserNick = fUserNick == null ? null : fUserNick.trim();
    }

    public String getfUserHead() {
        return fUserHead;
    }

    public void setfUserHead(String fUserHead) {
        this.fUserHead = fUserHead == null ? null : fUserHead.trim();
    }

    public Integer getfUserSex() {
        return fUserSex;
    }

    public void setfUserSex(Integer fUserSex) {
        this.fUserSex = fUserSex;
    }

    public Integer getfUserAge() {
        return fUserAge;
    }

    public void setfUserAge(Integer fUserAge) {
        this.fUserAge = fUserAge;
    }

    public Date getfUserBirthday() {
        return fUserBirthday;
    }

    public void setfUserBirthday(Date fUserBirthday) {
        this.fUserBirthday = fUserBirthday;
    }

    public String getfUserEmail() {
        return fUserEmail;
    }

    public void setfUserEmail(String fUserEmail) {
        this.fUserEmail = fUserEmail == null ? null : fUserEmail.trim();
    }

    public String getfUserPhone() {
        return fUserPhone;
    }

    public void setfUserPhone(String fUserPhone) {
        this.fUserPhone = fUserPhone == null ? null : fUserPhone.trim();
    }

    public Integer getfUserMarriage() {
        return fUserMarriage;
    }

    public void setfUserMarriage(Integer fUserMarriage) {
        this.fUserMarriage = fUserMarriage;
    }

    public Integer getfUserEducation() {
        return fUserEducation;
    }

    public void setfUserEducation(Integer fUserEducation) {
        this.fUserEducation = fUserEducation;
    }

    public Integer getfUserIndustries() {
        return fUserIndustries;
    }

    public void setfUserIndustries(Integer fUserIndustries) {
        this.fUserIndustries = fUserIndustries;
    }

    public Integer getfUserType() {
        return fUserType;
    }

    public void setfUserType(Integer fUserType) {
        this.fUserType = fUserType;
    }

    public Integer getfUserStatus() {
        return fUserStatus;
    }

    public void setfUserStatus(Integer fUserStatus) {
        this.fUserStatus = fUserStatus;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public Date getfLastLogin() {
        return fLastLogin;
    }

    public void setfLastLogin(Date fLastLogin) {
        this.fLastLogin = fLastLogin;
    }
}