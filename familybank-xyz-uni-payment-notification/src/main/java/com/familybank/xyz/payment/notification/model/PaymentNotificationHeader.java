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
public class PaymentNotificationHeader {
    
    private String requestId;
    private String timeStamp;
    private String channelCode;
    private String serviceId;
    private String paymentMode;
    private String billerId;

    public PaymentNotificationHeader() {
    }

    
    public PaymentNotificationHeader(String requestId, String timeStamp, String channelCode, String serviceId, String paymentMode, String billerId) {
        this.requestId = requestId;
        this.timeStamp = timeStamp;
        this.channelCode = channelCode;
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
        //return "PaymentNotificationHeader{" + "requestId=" + requestId + ", timeStamp=" + timeStamp + ", channelCode=" + channelCode + ", serviceId=" + serviceId + ", paymentMode=" + paymentMode + ", billerId=" + billerId + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }
    
    
    
    
    
    
    
}
