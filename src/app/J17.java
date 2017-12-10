package app;


import java.math.BigInteger;
import java.util.*;

public class J17 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(4096,new Random()); //Autogenerowanie bigintegera
		BigInteger b = new BigInteger(4096,new Random());
		
		System.out.println("Wartoœæ liczby a: " + a);
		System.out.println("Wartoœæ liczby b: " +b);
		BigInteger suma = a.add(b);
		BigInteger subt = a.subtract(b);
		BigInteger mult = a.multiply(b);
		BigInteger divi = a.divide(b);
		System.out.println("Wynik sumy: " + suma);
		System.out.println("Wynik odejmowania: " + subt);
		System.out.println("Wynik mno¿enia: " + mult);
		System.out.println("Wynik dzielenia: " + divi);
		
	}
}
