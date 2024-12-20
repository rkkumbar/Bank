package in.demo;

public class Airtel {
	void recharge(long creditcard,String expDate, int cvv) {
		System.out.println("recharging through credit card");
	}
	
	void recharge(long mobNum,int pass){
		System.out.println("recharging through UPI payment");
	} 
	
	void recharge(int pass,long accNum){
		System.out.println("recharging through Net payment");
	} 	
	void recharge(String BankName, long accNum){
		System.out.println("recharging through Net payment");
	} 	
	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.recharge(1234,1234567890l);
		a.recharge(1234567890l,1234);
		a.recharge(456874457894l, 123454);
		
	}
}
