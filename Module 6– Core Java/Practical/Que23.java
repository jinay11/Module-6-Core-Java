package PracticalAssignment;

import java.util.Scanner;

//  Implement string comparison using equals() and compareTo() methods.

public class Que23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();
		
		System.out.println("Enter String 3: ");
		String str3 = sc.nextLine();

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("str1 and str2 are EQUAL");
		} else {
			System.out.println("str1 and str2 is NOT EQUAL");
		}

		if (str1.equals(str3)) {
			System.out.println("str1 and str3 are EQUAL ");
		} else {
			System.out.println("str1 and str3 are NOT EQUAL");
		}
		
		//compareTo()
		System.out.println("str1.compateTo(str2) = "+str1.compareToIgnoreCase(str2));
		System.out.println("str2.compareTo(str3) = "+str2.compareToIgnoreCase(str3));
		System.out.println("str3.compareTo(str1) = " + str3.compareToIgnoreCase(str1));
	}
}