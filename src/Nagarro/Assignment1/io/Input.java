package Nagarro.Assignment1.io;
import java.util.*;

import Nagarro.Assignment1.enums.Cartype;
import Nagarro.Assignment1.enums.InsuranceType;
import Nagarro.Assignment1.model.Car;

public class Input {

	public static Car getCarDetailsFromUser(Scanner sc)
    {
        System.out.println("Enter car details (for example: SX4-Sedan-Premium-1000000 ) :");
        String carDetailsInput = sc.next();
        validateInput(carDetailsInput);
        Car car = parseCarFromCarDetailsInput(carDetailsInput);
        return car;

}

	private static Car parseCarFromCarDetailsInput(String carDetailsInput) 
	{
	        Car car = new Car();
	        String[] carDetailsArray = carDetailsInput.split(Car.getDelimeter());
	        car.setModel(carDetailsArray[0]);
	        try
	        {
	        	car.setCarType(Cartype.valueOf(carDetailsArray[1]));
	        	car.setInsuranceType(InsuranceType.valueOf(carDetailsArray[2]));
	        }
	        catch(IllegalArgumentException e)
	        {
	        	System.out.println("Error Occured :Wrong format");
	        	return null;
	        
	        }
	        
	        car.setCostPrice(Double.valueOf(carDetailsArray[3]));
	        
	      return car;
		
		
	}

	private static void validateInput(String carDetailsInput) {

	        if(carDetailsInput.split(Car.getDelimeter()).length!=4) {
	            throw new RuntimeException("Please enter all information");
	            
	        }
	}
	
	
}