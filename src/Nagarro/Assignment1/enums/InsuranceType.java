package Nagarro.Assignment1.enums;

public enum InsuranceType {
	
	Basic(0),
	Premium(20);
	
	private int InsPercentage;
	public int getInsPercentage()
	{
		return InsPercentage;
	}
	
	InsuranceType(int InsPercentage) 
	{
		this.InsPercentage = InsPercentage;
	
	}

}
