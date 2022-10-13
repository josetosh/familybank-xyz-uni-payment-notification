/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.familybank.xyz.payment.notification.service;

import com.familybank.xyz.payment.notification.repository.PaymentNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KEN16849
 */
@Service
public class PaymentNotificationService {
    
    @Autowired
    PaymentNotificationRepository paymentNotificationRepository;
}
