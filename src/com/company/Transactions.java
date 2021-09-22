package com.company;

import java.util.*;

public class Transactions{

    private String typeOfPayment;

    public Transactions(){

    }
    public void verifyCardPin(){
        Scanner scan = new Scanner(System.in);

        Hashtable<Integer, Integer> cardInformation = new Hashtable<Integer, Integer>();
        cardInformation.put(1, 1234);
        cardInformation.put(2, 5678);
        cardInformation.put(3, 9012);

        boolean isPinVerified = false;

        try {
            for(int i = 0; i<=3; i++) {

                System.out.print("Enter card number: ");
                int cardNumber = scan.nextInt();
                System.out.print("Enter card pin: ");
                int pin = scan.nextInt();

                if (cardInformation.get(cardNumber) == pin) {
                    System.out.println("Valid Pin.");
                    break;
                } else {
                    System.out.println("Invalid Pin");
                    i++;
                }

            } //while ((!isPinVerified) && (counter < 3) && (loopBreak == 0));
        }catch(StackOverflowError e){
            System.out.println("An unexpected Error happened. Please try again later.");
        }
        //verifyCardPin(1,1234);
    }
    public void typeOfPayment(String payment){
        if (payment.equalsIgnoreCase("cash")){

        }
    }

    /*public static void main(String[] args){
        Login checkLogin = new Login();
        checkLogin.verifyLogin(1000,1010);

    }*/
}
