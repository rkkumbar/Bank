package in.demo;

public class RechargeSim {
	
	void recharge(long creditcardNum, String expDate,int cvv) {
		System.out.println("recharge through credit card");
	}
	
	void recharge(String BankName,long accNum) {
		System.out.println("recharge through NetBanking ");
	}
	void recharge(long mobNum,int pass) {
		System.out.println("recharge done through UPI");
	}
	
	void recharge(String uname,int pass) {
		System.out.println("recharge done through wallets ");
	}
	
	public static void main(String[] args) {
		RechargeSim rs=new RechargeSim();
		rs.recharge(7894561230l, "07/05",789);
		rs.recharge("ICICI",1234567890l);
		rs.recharge(7894561230l, 7892);
		rs.recharge("Dinga", 1234);
	}
}
