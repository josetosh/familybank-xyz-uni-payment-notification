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
public class PaymentRequest {
    
    private PaymentRequestHeader paymentRequestHeader;
    private PaymentRequestBody paymentRequestBody;

    public PaymentRequest() {
    }

    public PaymentRequest(PaymentRequestHeader paymentRequestHeader, PaymentRequestBody paymentRequestBody) {
        this.paymentRequestHeader = paymentRequestHeader;
        this.paymentRequestBody = paymentRequestBody;
    }

    public PaymentRequestHeader getPaymentRequestHeader() {
        return paymentRequestHeader;
    }

    public void setPaymentRequestHeader(PaymentRequestHeader paymentRequestHeader) {
        this.paymentRequestHeader = paymentRequestHeader;
    }

    public PaymentRequestBody getPaymentRequestBody() {
        return paymentRequestBody;
    }

    public void setPaymentRequestBody(PaymentRequestBody paymentRequestBody) {
        this.paymentRequestBody = paymentRequestBody;
    }

    @Override
    public String toString() {
        //return "PaymentRequest{" + "requestHeaders=" + requestHeaders + ", requestBody=" + requestBody + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }
    
    
}
