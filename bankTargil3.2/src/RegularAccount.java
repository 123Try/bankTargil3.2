import javafx.scene.Parent;

public class RegularAccount extends Account {

	public RegularAccount() {
	}

	public RegularAccount(double amount, Person customer) {
		super(amount, customer);
	}

	@Override
	public void withDraw(double amount) {
		
		try {
			if(this.getBalance()-amount<0) 
			{
				throw new Exception("Can Not Be in Minus");
			}
			else {
				this.balance=this.balance-amount;
			}		

		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public String toString() {
		super.toString();
		return "RegularAccount ["+super.toString()+"]";
	}



}
