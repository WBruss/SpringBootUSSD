package com.tracom.software.ussd.models;

public class UssdReqBody {
    private String sessionId;
    private String phoneNumber;
    private String networkCode ;
    private String serviceCode ;
    private String text ;

    public UssdReqBody(String sessionId, String phoneNumber, String networkCode, String serviceCode, String text) {
        this.sessionId = sessionId;
        this.phoneNumber = phoneNumber;
        this.networkCode = networkCode;
        this.serviceCode = serviceCode;
        this.text = text;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNetworkCode() {
        return networkCode;
    }

    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return (
                "sessionId: " + sessionId + ", " +
                "phoneNumber: " + phoneNumber + ", " +
                "networkCode: " + networkCode + ", " +
                "serviceCode: " + serviceCode + ", " +
                "text: " + text
                );
    }
}
