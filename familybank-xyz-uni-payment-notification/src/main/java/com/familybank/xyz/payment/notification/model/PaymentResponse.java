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
public class PaymentResponse {

    private String statusCode;
    private String statusDesc;
    private String refNo;
    private String identifier;

    public PaymentResponse() {
    }

    public PaymentResponse(String statusCode, String statusDesc, String refNo, String identifier) {
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.refNo = refNo;
        this.identifier = identifier;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        //return "PaymentResponse{" + "statusCode=" + statusCode + ", statusDesc=" + statusDesc + ", refNo=" + refNo + ", identifier=" + identifier + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }

}
