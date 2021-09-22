package com.company;

public class Main {

    public static void main(String[] args) {
	Employee employee1 = new Employee();
	employee1.setName("Alex Mapfumo");
	employee1.setEmployeeID(1000);
	employee1.setPin(1010);
	employee1.setEmail("amapfumo@gmail.com");
	employee1.setPhoneNumber(932110832);

	Transactions transactions = new Transactions();
	transactions.verifyCardPin();
	//employee1.verifyLogin(1000, 1010);

    }
}
