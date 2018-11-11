
public class testBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("elad","123456789");
		RegularAccount ra = new RegularAccount(10.0,p);
		GoldAccount ga = new GoldAccount(10,p);
		System.out.println(ra);
		System.out.println(ga);
		ra.deposit(5);
		ga.deposit(5);
		System.out.println(ra);
		System.out.println(ga);
		ra.withDraw(20);
		ga.withDraw(20);
		System.out.println(ra);
		System.out.println(ga);
		System.out.println(ga);

		
	}
}


