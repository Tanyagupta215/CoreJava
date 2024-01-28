package Nagarro.Assignment1.mainapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Nagarro.Assignment1.io.Input;
import Nagarro.Assignment1.io.Output;
import Nagarro.Assignment1.model.Car;
import Nagarro.Assignment1.service.InsurancePremiumCalcultor;

public class Main {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        
		 List<Car> carList = new ArrayList<>();
		 InsurancePremiumCalcultor ipc = new InsurancePremiumCalcultor();
	        
		 char choice = 'n';
	        
	        do {
	        	Car car= Input.getCarDetailsFromUser(sc);
	           
	        	
	        if(car != null)
	        	
	        {	
	        	ipc.calculateInsurancePremium(car);
	        	carList.add(car);
	        
	        }
	            
	        	System.out.println("Do you want enter another car details (y/n) : ");
	            
	            choice = sc.next().charAt(0);
	        
	        } while (choice=='y');
	       
	        
	        Output.listCarsPriceWithPremium(carList);
	}

}
