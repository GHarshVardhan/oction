
package com.example.harsh.octiontestproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Auction {

    @SerializedName("user_name")
    @Expose
    private Object userName;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("profileImage")
    @Expose
    private Object profileImage;
    @SerializedName("userId")
    @Expose
    private Object userId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("productPrice")
    @Expose
    private String productPrice;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("productCurrency")
    @Expose
    private String productCurrency;
    @SerializedName("auctionId")
    @Expose
    private String auctionId;
    @SerializedName("startingPrice")
    @Expose
    private String startingPrice;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("unique_id")
    @Expose
    private String uniqueId;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("start_time_unix")
    @Expose
    private String startTimeUnix;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("end_time_unix")
    @Expose
    private String endTimeUnix;
    @SerializedName("minimumPrice")
    @Expose
    private String minimumPrice;
    @SerializedName("bidCount")
    @Expose
    private Integer bidCount;
    @SerializedName("auctionsHeldCount")
    @Expose
    private String auctionsHeldCount;
    @SerializedName("bidderCount")
    @Expose
    private Integer bidderCount;

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Object profileImage) {
        this.profileImage = profileImage;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTimeUnix() {
        return startTimeUnix;
    }

    public void setStartTimeUnix(String startTimeUnix) {
        this.startTimeUnix = startTimeUnix;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTimeUnix() {
        return endTimeUnix;
    }

    public void setEndTimeUnix(String endTimeUnix) {
        this.endTimeUnix = endTimeUnix;
    }

    public String getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public String getAuctionsHeldCount() {
        return auctionsHeldCount;
    }

    public void setAuctionsHeldCount(String auctionsHeldCount) {
        this.auctionsHeldCount = auctionsHeldCount;
    }

    public Integer getBidderCount() {
        return bidderCount;
    }

    public void setBidderCount(Integer bidderCount) {
        this.bidderCount = bidderCount;
    }

}
