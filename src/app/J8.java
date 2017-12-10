package app;
import java.math.BigInteger;
public class J8 {
	public static void main(String[] args){
		String firstVariable = "Pierwsza";
		String secondVariable = " Druga";
		String thirdVariable = firstVariable + secondVariable;
		String fourthVariable = thirdVariable + " Trzecia Czwarta";
		System.out.println(thirdVariable.toUpperCase()+"\n"+fourthVariable.toLowerCase());
		System.out.println("Trzecia zmienna ma d³ugoœæ: " + thirdVariable.length());
		System.out.println("Drugi znak tzecie zmiennej to: " + thirdVariable.charAt(2)+" a pi¹ty znak: "+thirdVariable.charAt(5));
		System.out.println("Trzeci znak od koñca czwartej zmiennej: " + fourthVariable.charAt(fourthVariable.length()-3));
		System.out.println(fourthVariable.substring(0,15));
		
		BigInteger a = new BigInteger("123123123123123123123123123123");
		System.out.println(a);
	}
}
