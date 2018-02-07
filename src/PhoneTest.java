import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Phone phone = new Phone("Apple", "IPhoneX", 2017, 800);
Phone phone2 = new Phone("Android", "Galaxy S5", 2016, 200);
Phone phone3 = new Phone("Apple", "IPhone7", 2016, 600);

System.out.println(phone.Brand + " " + phone.PhoneName + " " + phone.YearReleased);
System.out.println(phone2.Brand + " " + phone2.PhoneName + " " + phone2.YearReleased);
System.out.println(phone3.Brand + " " + phone3.PhoneName + " " + phone3.YearReleased);

Scanner scan = new Scanner (System.in);
System.out.println("What phone would you like?");
	}

}
