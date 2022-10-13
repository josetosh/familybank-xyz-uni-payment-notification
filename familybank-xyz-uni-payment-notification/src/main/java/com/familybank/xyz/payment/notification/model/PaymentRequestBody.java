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
public class PaymentRequestBody {

    private String identifierType;
    private String identifier;
    private String debitAccount;
    private String amount;
    private String currency;
    private String mobileNo;
    private String address;
    private String transactionDate;
    private String narration;

    public PaymentRequestBody() {
    }

    public PaymentRequestBody(String identifierType, String identifier, String debitAccount, String amount, String currency, String mobileNo, String address, String transactionDate) {
        this.identifierType = identifierType;
        this.identifier = identifier;
        this.debitAccount = debitAccount;
        this.amount = amount;
        this.currency = currency;
        this.mobileNo = mobileNo;
        this.address = address;
        this.transactionDate = transactionDate;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
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
        //return "PaymentRequestBody{" + "identifierType=" + identifierType + ", identifier=" + identifier + ", debitAccount=" + debitAccount + ", amount=" + amount + ", currency=" + currency + ", mobileNo=" + mobileNo + ", address=" + address + ", transactionDate=" + transactionDate + '}';
        Gson gson = new Gson();
        String jsonStr = gson.toJson(this);
        return jsonStr;
    }

}
