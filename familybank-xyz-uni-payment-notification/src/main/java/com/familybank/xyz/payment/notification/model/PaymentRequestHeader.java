/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.familybank.xyz.payment.notification.model;

import com.google.gson.Gson;

/**
 *
 * @author KEN16849
 */
public class PaymentRequestHeader {

    private String requestId;
    private String userName;
    private String password;
    private String timeStamp;
    private String channelCode;
    private String serviceMode;
    private String serviceId;
    private String paymentMode;
    private String billerId;

    public PaymentRequestHeader() {
    }

    public PaymentRequestHeader(String requestId, String userName, String password, String timeStamp, String channelCode, String serviceMode, String serviceId, String paymentMode, String billerId) {
        this.requestId = requestId;
        this.userName = userName;
        this.password = password;
        this.timeStamp = timeStamp;
        this.channelCode = channelCode;
        this.serviceMode = serviceMode;
        this.serviceId = serviceId;
        this.paymentMode = paymentMode;
        this.billerId = billerId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    @Override
    public String toString() {
        //return "PaymentRequestHeader{" + "requestId=" + requestId + ", userName=" + userName + ", password=" + password + ", timeStamp=" + timeStamp + ", channelCode=" + channelCode + ", serviceMode=" + serviceMode + ", serviceId=" + serviceId + ", paymentMode=" + paymentMode + ", billerId=" + billerId + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }

}
