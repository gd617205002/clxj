package com.one.clxj.pojo;

public class Carinfo {
    private Integer id;

    private Integer clxjmainId;

    private String cartitle;

    private String carouselImg;

    private Long price;

    private String licence;

    private Integer joinid;

    private Integer checkstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClxjmainId() {
        return clxjmainId;
    }

    public void setClxjmainId(Integer clxjmainId) {
        this.clxjmainId = clxjmainId;
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

    public Integer getJoinid() {
        return joinid;
    }

    public void setJoinid(Integer joinid) {
        this.joinid = joinid;
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
                ", clxjmainId=" + clxjmainId +
                ", cartitle='" + cartitle + '\'' +
                ", carouselImg='" + carouselImg + '\'' +
                ", price=" + price +
                ", licence='" + licence + '\'' +
                ", joinid=" + joinid +
                ", checkstatus=" + checkstatus +
                '}';
    }
}