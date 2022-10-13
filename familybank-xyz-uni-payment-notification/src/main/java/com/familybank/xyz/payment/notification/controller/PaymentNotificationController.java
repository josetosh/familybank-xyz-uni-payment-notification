/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.familybank.xyz.payment.notification.controller;

import com.familybank.xyz.payment.notification.model.PaymentRequest;
import com.familybank.xyz.payment.notification.model.PaymentNotificationReq;
import com.familybank.xyz.payment.notification.service.PaymentNotificationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KEN16849
 */
@RestController
@RequestMapping("/api/v1/familybank/notification")
public class PaymentNotificationController {
    
    private static Logger logger = LogManager.getLogger(PaymentNotificationController.class);
    
    @Autowired
    PaymentNotificationService paymentNotificationService;
    
    @PostMapping("/pay")
    public ResponseEntity<String> receivePayment(@RequestBody PaymentRequest notificationRequest ){
        
        PaymentNotificationReq nr = new PaymentNotificationReq();
        
        logger.info("Notification Request : {}",notificationRequest.toString());
        
        return new ResponseEntity<>(nr.toString(), HttpStatus.OK);
    }
}
