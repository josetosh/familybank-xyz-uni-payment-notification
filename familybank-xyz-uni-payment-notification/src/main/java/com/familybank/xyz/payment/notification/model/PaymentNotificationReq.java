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
public class PaymentNotificationReq {
    
    private PaymentNotificationHeader paymentNotificationHeader;
    private PaymentNotificationBody paymentNotificationBody;

    public PaymentNotificationReq() {
    }

    public PaymentNotificationReq(PaymentNotificationHeader paymentNotificationHeader, PaymentNotificationBody paymentNotificationBody) {
        this.paymentNotificationHeader = paymentNotificationHeader;
        this.paymentNotificationBody = paymentNotificationBody;
    }

    public PaymentNotificationHeader getPaymentNotificationHeader() {
        return paymentNotificationHeader;
    }

    public void setPaymentNotificationHeader(PaymentNotificationHeader paymentNotificationHeader) {
        this.paymentNotificationHeader = paymentNotificationHeader;
    }

    public PaymentNotificationBody getPaymentNotificationBody() {
        return paymentNotificationBody;
    }

    public void setPaymentNotificationBody(PaymentNotificationBody paymentNotificationBody) {
        this.paymentNotificationBody = paymentNotificationBody;
    }
    
    

    

    @Override
    public String toString() {
        //return "PaymentNotificationReq{" + "responseHeader=" + responseHeader + ", responseBody=" + responseBody + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }
    
    
    
}
