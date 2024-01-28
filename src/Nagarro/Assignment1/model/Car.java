package Nagarro.Assignment1.model;

import Nagarro.Assignment1.constants.Constants;
import Nagarro.Assignment1.enums.Cartype;
import Nagarro.Assignment1.enums.InsuranceType;

public class Car{
	
	 //private static String DELIMETER;

	    private String model;

	    private Cartype carType;

	    private InsuranceType insuranceType;

	    private Double costPrice;

	   private Double insurancePremium;
	   
	   
	   
	   

	    public static String getDelimeter() {
		return Constants.DELIMETER;
	
	    }

		public String getModel() {
			return model;
		}

		public InsuranceType getInsuranceType() {
			return insuranceType;
		}

		public void setInsuranceType(InsuranceType insuranceType) {
			this.insuranceType = insuranceType;
		}

		public Cartype getCarType() {
			return carType;
		}

		public void setCarType(Cartype carType) {
			this.carType = carType;
		}

		public Double getCostPrice() {
			return costPrice;
		}

		public void setCostPrice(Double costPrice) {
			this.costPrice = costPrice;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Double getInsurancePremium() {
			return insurancePremium;
		}

		public void setInsurancePremium(Double insurancePremium) {
			this.insurancePremium = insurancePremium;
		}

}