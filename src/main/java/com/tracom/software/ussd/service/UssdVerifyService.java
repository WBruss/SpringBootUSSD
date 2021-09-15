package com.tracom.software.ussd.service;

import com.tracom.software.ussd.models.UssdReqBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UssdVerifyService {

    static Logger logger = LoggerFactory.getLogger(UssdVerifyService.class);

    public String handleUSSD(UssdReqBody ussdReqBody){
        StringBuilder response = new StringBuilder("");

        if(ussdReqBody.getText().isEmpty()){
            response.append("CON Enter Your Phone Number");
        }
        else if(!ussdReqBody.getText().isEmpty() && !ussdReqBody.getText().contains("*")){
            response.append("CON Enter Code");
        }

        return response.toString();
    }

    public String handleUSSDMenu(UssdReqBody ussdReqBody){
        StringBuilder response = new StringBuilder("");

        if(ussdReqBody.getText().isEmpty()){
            response.append("CON 1: Phone \n2:Code \n3:Account");
        }
        else if(!ussdReqBody.getText().isEmpty() && ussdReqBody.getText().equals("1") ){
            response.append("CON Enter Phone number");
        }
        else if(!ussdReqBody.getText().isEmpty() && ussdReqBody.getText().startsWith("1*") ){
            String[] requestArray = ussdReqBody.getText().split("\\*");

            response.append("END Phone Entered \n" + requestArray[1]);
        }

        else if(!ussdReqBody.getText().isEmpty() && ussdReqBody.getText().equals("2") ){
                    response.append("CON Enter Code");
                }
        else if(!ussdReqBody.getText().isEmpty() && ussdReqBody.getText().equals("3") ){
                    response.append("CON Enter Account");
                }


        return response.toString();
    }
}
