package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 车辆信息实体类
 */
public class Carinfo {
    @Id
    private Integer id; //编号

    private Clxjmain clxjmains; //丛林闲居名称

    private String cartitle; //车名

    private String carouselImg; //图片

    private Long price; //价格

    private String licence; //车牌号

    private Adminuser adminuser; //添加人

    private Integer checkstatus; //审核状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getCartitle() {
        return cartitle;
    }

    public void setCartitle(String cartitle) {
        this.cartitle = cartitle == null ? null : cartitle.trim();
    }

    public String getCarouselImg() {
        return carouselImg;
    }

    public void setCarouselImg(String carouselImg) {
        this.carouselImg = carouselImg == null ? null : carouselImg.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    public Clxjmain getClxjmains() {
        return clxjmains;
    }

    public void setClxjmains(Clxjmain clxjmains) {
        this.clxjmains = clxjmains;
    }

    public Adminuser getAdminuser() {
        return adminuser;
    }

    public void setAdminuser(Adminuser adminuser) {
        this.adminuser = adminuser;
    }

    public Integer getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    @Override
    public String toString() {
        return "Carinfo{" +
                "id=" + id +
                ", clxjmains=" + clxjmains +
                ", cartitle='" + cartitle + '\'' +
                ", carouselImg='" + carouselImg + '\'' +
                ", price=" + price +
                ", licence='" + licence + '\'' +
                ", adminuser=" + adminuser +
                ", checkstatus=" + checkstatus +
                '}';
    }
}