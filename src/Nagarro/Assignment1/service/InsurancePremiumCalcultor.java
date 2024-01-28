package Nagarro.Assignment1.service;

import Nagarro.Assignment1.model.Car;


public class InsurancePremiumCalcultor implements InsurancePremiumCalculator{
	
	public void calculateInsurancePremium(Car car) {

		
	car.setInsurancePremium((car.getCostPrice()*car.getCarType().getCostPercentage())/100);
	car.setInsurancePremium(car.getInsurancePremium()+((car.getInsurancePremium()*car.getInsuranceType().getInsPercentage())/100));

		
	}
}
