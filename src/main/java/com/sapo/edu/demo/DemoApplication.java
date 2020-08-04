package com.sapo.edu.demo;

import com.sun.source.tree.TryTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.StringUtils;


import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	 static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		TestCase();
	}
	public static void TestCase()
	{
			while (true) {
				Menu();
				int n = -1;
				try {
					System.out.println("please inter your choice");
					 n =   Integer.parseInt(sc.nextLine());
				} catch (Exception e)
				{
					System.out.println("Data type error , Input number! @@");
				}
				switch (n) {
					case 1:
						//Check that a character exists in a string
						sc.nextLine();
						System.out.println("Check that a character exists in a string ");
						Containsany();
						break;
					case 2:

						System.out.println("Check a string that exists in another string ");
						containsIgnoreCase();
						break;
					case 3:
						countMatches();
						break;
					case 4:
						Appent();
						break;
					case 5:
						First_character_uppercas ();
						break;
					case 6:
						Conver_Uppercase ();
						break;
					case 7:
						First_character_lowercase ();
						break;
					case 8:
						Reverse_chain();
						break;
					case 0:
						System.out.println("Exit!");
						break;

				}


			}
	}

	private static void Reverse_chain() {
		System.out.println("Please Enter the String ? ");String string_reverse = sc.nextLine();
		String reverse_chain = StringUtils.reverse(string_reverse);
		String strinnew = String.format("The string after reversing is %s",reverse_chain);
		System.out.println(strinnew);
		System.out.println("----------------------");
	}

	private static void Conver_Uppercase () {
		System.out.println("Please Enter the String ? ");String strin_Uppercase = sc.nextLine();
		String Uppercase_dString = StringUtils.swapCase(strin_Uppercase);

		System.out.println(Uppercase_dString);
		System.out.println("----------------------");
	}

	private static void  First_character_lowercase () {
		System.out.println("Please Enter the String ? ");String string_lowercase = sc.nextLine();
		String lowercase_String = StringUtils.capitalize(string_lowercase);

		System.out.println(lowercase_String);
		System.out.println("----------------------");
	}


	public static  void First_character_uppercas ()
	{
		System.out.println("Please Enter the String ? ");String string = sc.nextLine();
		String uncapitalizedString = StringUtils.uncapitalize(string);

		System.out.println(uncapitalizedString);
		System.out.println("----------------------");
	}



	public static void Appent()
	{
		System.out.println("Please Enter the String ? ");String stringappen = sc.nextLine();
		System.out.println("Please Enter the String AppentSuffix ? "); String stringsuffix = sc.nextLine();
		System.out.println("Please Enter the String AppentFrefix ? "); String stringfrefix = sc.nextLine();

		String StringSuffix = StringUtils.appendIfMissing(stringappen,stringsuffix);
		String StringFerfix = StringUtils.prependIfMissing(stringappen,stringfrefix);

		System.out.println(" We have the last string ");
		System.out.println(StringFerfix);
		System.out.println(StringSuffix);
		System.out.println("----------------------");
	}




	public static void Menu()
	{
		System.out.println("1.Check that a character exists in a string");
		System.out.println("2.Check a string that exists in another string");
		System.out.println("3.Returns how many characters appear in the parent string ");
		System.out.println("4.AppendIfMissing and prependIfMissing methods ");
		System.out.println("5.Converts the first character to uppercase");
		System.out.println("6.Convert all letters to uppercase");
		System.out.println("7.Converts the first character to Lowercase");
		System.out.println("8.Reverse chain");
	}

	public static  void containsIgnoreCase()
	{

		System.out.println("Please enter the string ?");
		String string =  sc.nextLine();
		System.out.println("Please enter the character you want to check ");
		String charactercheck = sc.nextLine();
		boolean container = StringUtils.containsIgnoreCase(string,charactercheck);
		if(container == true)
		{
			System.out.println("Exists");
		}
		else {
			System.out.println(" Not Exists");
		}
		System.out.println("----------------------");
	}


	public static  void Containsany()
	{
		System.out.println("Please enter the string ?");
		String string =  sc.nextLine();
		System.out.println("Please enter the character you want to check ");
		String charactercheck = sc.nextLine();

		boolean container = StringUtils.containsAny(string,charactercheck);
		if(container == true)
		{
			System.out.println("Exists");
		}
		else {
			System.out.println(" Not Exists");
		}
		System.out.println("----------------------");

	}
	public static  void countMatches()
	{
			System.out.println("Please enter the string ?");
			String string =  sc.nextLine();
			System.out.println("Please enter the character you want to check ");
			String charactercheck = sc.nextLine();

			int number = StringUtils.countMatches(string,charactercheck);
			String string2 = String.format("Character %s appears  in %s %d time",charactercheck,string,number);
			System.out.println(string2);
		System.out.println("----------------------");
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What your name?");
		String name=null;
		if (scanner.hasNext()) {
			name = scanner.nextLine();
		}
		System.out.println("Hello "+ name);
	}
}
