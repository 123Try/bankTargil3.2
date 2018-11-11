import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GoldTest {
	Person p = new Person ("Ori","123456789");
	GoldAccount ga =new GoldAccount(200,p);
		
	@Test
	void test() {
	ga.withDraw(300);
	assertEquals(-100.0,ga.getBalance());
	}

}
