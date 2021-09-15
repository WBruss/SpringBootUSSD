package com.tracom.software.ussd.controller;

import com.tracom.software.ussd.models.UssdReqBody;
import com.tracom.software.ussd.service.UssdVerifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UssdVerifyController {

    Logger logger = LoggerFactory.getLogger(UssdVerifyController.class);

    @Autowired
    UssdVerifyService ussdVerifyService;

    @GetMapping("/")
    public String get(){
        return "Gotten";
    }

    @PostMapping(path = "/ussd", consumes = "application/x-www-form-urlencoded")
    public String ussdVerification(UssdReqBody ussdRequest){
        logger.info("USSD_REQUEST: " + ussdRequest.toString());
        return ussdVerifyService.handleUSSDMenu(ussdRequest);

    }
}
