package Nagarro.Assignment1.io;

import java.util.List;

import Nagarro.Assignment1.model.Car;

public class Output {
	
	public static void listCarsPriceWithPremium(List<Car> carList) {

        System.out.println("Car\tPrice\t\tInsurance");
        carList.stream().forEach(car -> {
            System.out.println(car.getModel()+"\t"+car.getCostPrice()+"\t"+car.getInsurancePremium());
        });

    }

}
