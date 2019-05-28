package com.one.clxj.pojo;

/**
 * 求助信息实体类
 */
public class Helpinfo {
    private Integer id; //编号

    private String name; //联系人姓名

    private Integer sex; //性别

    private Integer age; //年龄

    private String idcard; //身份证号

    private String phonenum; //联系电话

    private String email; //联系邮箱

    private String address; //住址或单位

    private Double income; //家庭年收入

    private Integer basicliving; //是否享受低保

    private Double applymoney; //拟申请求助金额

    private String fileurl; //上传文件

    private String applycontent; //困难概要

    private Integer applystatus; //审核状态

    private Integer applytype; //求助类型

    private String time; //求助时间

    private Reguser reguser; //求助人

    private String applymoneyusertime; //申请资金使用期限

    private String vouchname; //担保人姓名

    private String vouchidcard; //身份证号码

    private String vouchaddress; //地址

    private String vouchcompany; //工作单位

    private String vouchphonenum; //单位固定电话

    private String vouchmobile; //个人联系电话

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getBasicliving() {
        return basicliving;
    }

    public void setBasicliving(Integer basicliving) {
        this.basicliving = basicliving;
    }

    public Double getApplymoney() {
        return applymoney;
    }

    public void setApplymoney(Double applymoney) {
        this.applymoney = applymoney;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public String getApplycontent() {
        return applycontent;
    }

    public void setApplycontent(String applycontent) {
        this.applycontent = applycontent == null ? null : applycontent.trim();
    }

    public Integer getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(Integer applystatus) {
        this.applystatus = applystatus;
    }

    public Integer getApplytype() {
        return applytype;
    }

    public void setApplytype(Integer applytype) {
        this.applytype = applytype;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }


    public String getApplymoneyusertime() {
        return applymoneyusertime;
    }

    public void setApplymoneyusertime(String applymoneyusertime) {
        this.applymoneyusertime = applymoneyusertime == null ? null : applymoneyusertime.trim();
    }

    public String getVouchname() {
        return vouchname;
    }

    public void setVouchname(String vouchname) {
        this.vouchname = vouchname == null ? null : vouchname.trim();
    }

    public String getVouchidcard() {
        return vouchidcard;
    }

    public void setVouchidcard(String vouchidcard) {
        this.vouchidcard = vouchidcard == null ? null : vouchidcard.trim();
    }

    public String getVouchaddress() {
        return vouchaddress;
    }

    public void setVouchaddress(String vouchaddress) {
        this.vouchaddress = vouchaddress == null ? null : vouchaddress.trim();
    }

    public String getVouchcompany() {
        return vouchcompany;
    }

    public void setVouchcompany(String vouchcompany) {
        this.vouchcompany = vouchcompany == null ? null : vouchcompany.trim();
    }

    public String getVouchphonenum() {
        return vouchphonenum;
    }

    public void setVouchphonenum(String vouchphonenum) {
        this.vouchphonenum = vouchphonenum == null ? null : vouchphonenum.trim();
    }

    public String getVouchmobile() {
        return vouchmobile;
    }

    public void setVouchmobile(String vouchmobile) {
        this.vouchmobile = vouchmobile == null ? null : vouchmobile.trim();
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Helpinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", idcard='" + idcard + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", income=" + income +
                ", basicliving=" + basicliving +
                ", applymoney=" + applymoney +
                ", fileurl='" + fileurl + '\'' +
                ", applycontent='" + applycontent + '\'' +
                ", applystatus=" + applystatus +
                ", applytype=" + applytype +
                ", time='" + time + '\'' +
                ", reguser=" + reguser +
                ", applymoneyusertime='" + applymoneyusertime + '\'' +
                ", vouchname='" + vouchname + '\'' +
                ", vouchidcard='" + vouchidcard + '\'' +
                ", vouchaddress='" + vouchaddress + '\'' +
                ", vouchcompany='" + vouchcompany + '\'' +
                ", vouchphonenum='" + vouchphonenum + '\'' +
                ", vouchmobile='" + vouchmobile + '\'' +
                '}';
    }
}