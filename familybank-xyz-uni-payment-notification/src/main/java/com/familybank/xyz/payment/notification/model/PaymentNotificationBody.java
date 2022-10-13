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
public class PaymentNotificationBody {

    private String statusCode;
    private String statusDesc;
    private String refNo;
    private String identifier;
    private String amount;
    private String currency;
    private String mobileNo;
    private String address;
    private String transactionDate;
    private String narration;

    public PaymentNotificationBody() {
    }

    public PaymentNotificationBody(String statusCode, String statusDesc, String refNo, String identifier, String amount, String currency, String mobileNo, String address, String transactionDate, String narration) {
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.refNo = refNo;
        this.identifier = identifier;
        this.amount = amount;
        this.currency = currency;
        this.mobileNo = mobileNo;
        this.address = address;
        this.transactionDate = transactionDate;
        this.narration = narration;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    @Override
    public String toString() {
        //return "PaymentNotificationBody{" + "statusCode=" + statusCode + ", statusDesc=" + statusDesc + ", refNo=" + refNo + ", identifier=" + identifier + ", amount=" + amount + ", currency=" + currency + ", mobileNo=" + mobileNo + ", address=" + address + ", transactionDate=" + transactionDate + ", narration=" + narration + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }

}
