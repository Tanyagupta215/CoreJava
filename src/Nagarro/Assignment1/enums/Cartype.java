package Nagarro.Assignment1.enums;

public enum Cartype {
	
	HatchBack(5),
	SUV(10),
	Sedan(8);
	
	private int CostPercentage;
	
	public int getCostPercentage()
	{
		return CostPercentage;
	}
	Cartype(int CostPercentage)
	{
		this.CostPercentage = CostPercentage;
	}

}
