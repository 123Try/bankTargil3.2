
public class GoldAccount extends Account {



	public GoldAccount() {
		// TODO Auto-generated constructor stub
	}

	public GoldAccount(double amount, Person customer) {
		super(amount, customer);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		return "GoldAccount ["+super.toString()+"]";
	}
}
