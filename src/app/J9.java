package app;

public class J9 {

	public static void main(String[] args) {
		String firstVariable = "Pierwsza";
		String secondVariable = " Druga";
		String thirdVariable = firstVariable + secondVariable;
		String fourthVariable = thirdVariable + " Trzecia Czwarta";
		System.out.println(thirdVariable.toUpperCase()+"\n"+fourthVariable.toLowerCase());
		System.out.println("Trzecia zmienna ma d³ugoœæ: " + thirdVariable.length());
		System.out.println("Drugi znak tzecie zmiennej to: " + thirdVariable.charAt(2)+" a pi¹ty znak: "+thirdVariable.charAt(5));
		System.out.println("Trzeci znak od koñca czwartej zmiennej: " + fourthVariable.charAt(fourthVariable.length()-3));
		System.out.println(fourthVariable.substring(0,15));
		String doTrim = "            Ala ma kota     ";
		System.out.println(doTrim);
		System.out.println(doTrim.trim());
		System.out.println(doTrim.replaceAll(" ", ""));
		System.out.println(doTrim.length());
		System.out.println(doTrim.toUpperCase());
		System.out.println(doTrim.toLowerCase());
		StringBuffer buffDoTrim = new StringBuffer(doTrim);
		buffDoTrim.replace(0, doTrim.length()-5, "Koniec");
		System.out.println(buffDoTrim);
	}

}
