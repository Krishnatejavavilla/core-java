package simpleinterest;
import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float si,p,t,r;
		Scanner scannerobj=new Scanner(System.in);
		System.out.println("enter the principle amount");
		p=scannerobj.nextFloat();
		System.out.println("enter the time period");
		t=scannerobj.nextFloat();
		System.out.println("rate of interest");
		r=scannerobj.nextFloat();
		si=(p*t*r)/100;
		System.out.println("simple intrest is:" +si);

	}

}
