/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hrish
 */
public class Payment {
    
    private String paymentType;
    private String userName;
    private int cardHolderName;
    private int cardNumber;
    private int cardExpiryMonth;
    private int cardExpiryYear;
    private int cardCVV;
           

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(int cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(int cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public int getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(int cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }
}
