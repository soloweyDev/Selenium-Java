
public class TestBank {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.name = "HSDC";
		b1.accountbalance = 10000;
		
		b1.interestgained(500);
		System.out.println("balance: " + b1.accountbalance);

		Members m = new Members();
		m.add = "1801 south avenue";
		m.name = "Jack";
		
		b1.mem = m;
		
		System.out.println(b1.mem.add);
		System.out.println(b1.mem.name);
		
		Bank b2 = new Bank();
		b2.name = "Barclays";
		b2.accountbalance = 20000;
		b2.mem = new Members();
		
		b2.mem.add = "12 road street";
		b2.mem.name = "Cory";
		
		System.out.println(b2.mem.add);
		System.out.println(b2.mem.name);
		
		b2.getBalance();
		
		Members m2 = b2.getBalance();
		m2.deposit();
		m2.withdrawl();
		
		b2.getBalance().deposit();
		b2.getBalance().withdrawl();
	}

}
