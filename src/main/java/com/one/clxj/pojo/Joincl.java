package com.one.clxj.pojo;

/**
 * 丛林加盟实体类
 */
public class Joincl {
    private Integer id; //编号

    private String clname; //丛林名称

    private String permitno; //宗教场所许可证号

    private String address; //地址

    private String legalname; //法人代表名字

    private String legalphone; //法人代表手机号

    private String legalidcard; //法人代表身份证号

    private String contactsname; //联系人名字

    private String contactsmobile; //联系人固定电话

    private String contactsphone; //联系人手机

    private String postcode; //邮编

    private String message; //介绍

    private Reguser reguser; //用户编号

    private String jointime; //加入时间

    private Integer joinstatus; //审核状态

    private String fileurl; //合同上传路径

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname == null ? null : clname.trim();
    }

    public String getPermitno() {
        return permitno;
    }

    public void setPermitno(String permitno) {
        this.permitno = permitno == null ? null : permitno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname == null ? null : legalname.trim();
    }

    public String getLegalphone() {
        return legalphone;
    }

    public void setLegalphone(String legalphone) {
        this.legalphone = legalphone == null ? null : legalphone.trim();
    }

    public String getLegalidcard() {
        return legalidcard;
    }

    public void setLegalidcard(String legalidcard) {
        this.legalidcard = legalidcard == null ? null : legalidcard.trim();
    }

    public String getContactsname() {
        return contactsname;
    }

    public void setContactsname(String contactsname) {
        this.contactsname = contactsname == null ? null : contactsname.trim();
    }

    public String getContactsmobile() {
        return contactsmobile;
    }

    public void setContactsmobile(String contactsmobile) {
        this.contactsmobile = contactsmobile == null ? null : contactsmobile.trim();
    }

    public String getContactsphone() {
        return contactsphone;
    }

    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone == null ? null : contactsphone.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }


    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime == null ? null : jointime.trim();
    }

    public Integer getJoinstatus() {
        return joinstatus;
    }

    public void setJoinstatus(Integer joinstatus) {
        this.joinstatus = joinstatus;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Joincl{" +
                "id=" + id +
                ", clname='" + clname + '\'' +
                ", permitno='" + permitno + '\'' +
                ", address='" + address + '\'' +
                ", legalname='" + legalname + '\'' +
                ", legalphone='" + legalphone + '\'' +
                ", legalidcard='" + legalidcard + '\'' +
                ", contactsname='" + contactsname + '\'' +
                ", contactsmobile='" + contactsmobile + '\'' +
                ", contactsphone='" + contactsphone + '\'' +
                ", postcode='" + postcode + '\'' +
                ", message='" + message + '\'' +
                ", reguser=" + reguser +
                ", jointime='" + jointime + '\'' +
                ", joinstatus=" + joinstatus +
                ", fileurl='" + fileurl + '\'' +
                '}';
    }
}