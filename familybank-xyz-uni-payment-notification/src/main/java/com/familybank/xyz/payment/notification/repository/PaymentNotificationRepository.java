/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.familybank.xyz.payment.notification.repository;

import com.familybank.xyz.payment.notification.entities.PaymentNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KEN16849
 */
@Repository
public interface PaymentNotificationRepository extends JpaRepository<PaymentNotification, Long>{
    
}
