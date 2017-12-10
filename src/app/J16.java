package app;
import java.util.*;
public class J16 {

	public static void main(String[] args) {
		Random gen = new Random();
		int x = gen.nextInt();
		int y = gen.nextInt();
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		boolean result = x > y;
		System.out.println("X wiêkszê od Y "+result);
		result = x * 2 > y;
		System.out.println("X pomno¿one przez 2 wiêkszê od Y " + result);
		result = x+3>y && x-2<y;
		System.out.println("y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2 " + result);
		if( x * y % 2 == 0 ) System.out.println("true");
		else System.out.println("false");
		result = x * y % 2 == 0;
		System.out.println("iloczyn liczb x i y jest parzysty " + result);
		
	}

}
