package com.familybank.xyz.payment.notification;

import com.familybank.xyz.payment.notification.model.PaymentNotificationBody;
import com.familybank.xyz.payment.notification.model.PaymentNotificationHeader;
import com.familybank.xyz.payment.notification.model.PaymentRequest;
import com.familybank.xyz.payment.notification.model.PaymentNotificationReq;
import com.familybank.xyz.payment.notification.model.PaymentResponse;
import com.familybank.xyz.payment.notification.model.Response;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RequestMapping("/payment")
public class FamilybankXyzUniPaymentNotificationApplication {

    private static Logger logger = LogManager.getLogger(FamilybankXyzUniPaymentNotificationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FamilybankXyzUniPaymentNotificationApplication.class, args);
    }

    @PostMapping("/receivePayment")
    public PaymentResponse receivePaymentFromChannel(@RequestBody PaymentRequest paymentRequest) {

        PaymentNotificationReq pnr = new PaymentNotificationReq();
        PaymentResponse pr = new PaymentResponse();

        logger.info("Notification Request : {}", paymentRequest.toString());

        System.out.println("Verifying Student RegNo : ");
        //System.out.println(verifyStudentRegNo(notificationRequest.getRequestBody().getIdentifier()));
        ResponseEntity<Response> r = verifyStudentRegNo(paymentRequest.getPaymentRequestBody().getIdentifier());
        if ("0".equals(r.getBody().getStatusCode())) {
            System.out.println("Student Exists");
            //Go ahead and process the payment in CBS (Core Banking System) and send notification to XYZ University biller
            PaymentNotificationHeader pnh = new PaymentNotificationHeader();
            pnh.setRequestId(paymentRequest.getPaymentRequestHeader().getRequestId());
            pnh.setTimeStamp(paymentRequest.getPaymentRequestHeader().getTimeStamp());
            pnh.setChannelCode(paymentRequest.getPaymentRequestHeader().getChannelCode());
            pnh.setPaymentMode(paymentRequest.getPaymentRequestHeader().getPaymentMode());

            PaymentNotificationBody pnb = new PaymentNotificationBody();
            pnb.setStatusCode("0");
            pnb.setStatusDesc("Success");
            Random random = new Random();
            pnb.setRefNo(String.valueOf(random.nextLong()));//Txn reference from CBS....generated internally
            pnb.setAmount(paymentRequest.getPaymentRequestBody().getAmount());
            pnb.setCurrency(paymentRequest.getPaymentRequestBody().getCurrency());
            pnb.setMobileNo(paymentRequest.getPaymentRequestBody().getMobileNo());
            pnb.setAddress(paymentRequest.getPaymentRequestBody().getAddress());
            pnb.setTransactionDate(paymentRequest.getPaymentRequestBody().getTransactionDate());
            pnb.setNarration(paymentRequest.getPaymentRequestBody().getNarration());

            pnr.setPaymentNotificationHeader(pnh);
            pnr.setPaymentNotificationBody(pnb);
            //Send SMS to customer/student

            //Sending Payment Notification Request To XYZ University notification endpoint
            RestTemplate restTemplate = new RestTemplate();
            String XYZUniNotificationUrl = "/home/payment";
            //Save the notification in the database
            ResponseEntity<String> notificationResponse = restTemplate.getForEntity(XYZUniNotificationUrl, String.class);
            System.out.println("Res From XYZ Uni Endpoint : "+notificationResponse);
            
        } else {
            System.out.println("Student Doesn't Exist");
            pr.setStatusCode("1");
            pr.setStatusDesc("Student with Registration No: " + paymentRequest.getPaymentRequestBody().getIdentifier() + " doesn't Exist");
            //Send SMS to customer/student
        }

        return pr;
    }

    public ResponseEntity<Response> verifyStudentRegNo(String regNo) {

        RestTemplate restTemplate = new RestTemplate();
        String XYZUniValidateStudentRegNoUrl = "http://127.0.0.1:7071/validate/regNo";
        ResponseEntity<Response> response
                = restTemplate.getForEntity(XYZUniValidateStudentRegNoUrl + "/" + regNo + "", Response.class);

        System.out.println("RES : " + response.toString());

        return response;
        //return null;
    }

    public String sendPaymentNotification() {

        return null;
    }

}
