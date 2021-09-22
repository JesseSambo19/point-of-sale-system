package com.company;

public class Login {
    private boolean login = false;


    boolean verifyLogin(int employeeID, int pin) {

        if ((pin == 1010)&&(employeeID==1000)){
            this.login = true;
        }

        else if ((pin == 1010)&&(employeeID!=1000)){
            this.login = false;
            System.out.println("Invalid Login, Wrong ID entered.");
        }
        else if ((pin != 1010)&&(employeeID==1000)){
            this.login = false;
            System.out.println("Invalid Login, Wrong pin entered.");
        }
        else {
            System.out.println("Invalid Login.");
        }

        return this.login;
    }
}
