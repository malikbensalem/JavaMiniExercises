//this one 9/9
package main;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";

		for (char letter : input.toCharArray()) {
			for (int i = 0; i < 3; i++) {
				word += letter;
			}
		}
		return word;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		if (input.toLowerCase().contains("bert")) {
			if (input.toLowerCase().substring(input.indexOf("bert")+4).contains("bert")){
				String treb=input.substring(input.toLowerCase().indexOf("bert")+4,input.toLowerCase().indexOf("bert")+4);
				return new StringBuilder(input.substring(input.toLowerCase().indexOf("bert")+4,input.toLowerCase().lastIndexOf("bert"))).reverse().toString();
			}
		}return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int min = Math.min(a, b);
		min = Math.min(min, c);
		if ((min * 2 == a || min * 2 == b || min * 2 == c) && (min * 3 == a || min * 3 == b || min * 3 == c)) {
			return true;
		}
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		String asd;
		int mid = input.length() / 2;
		if (a != 1) {
			asd = input.substring(0, mid - a + 2);
			asd += input.substring(mid + a - 1);
		} else {
			asd = input.substring(0, mid);
			asd += input.substring(mid + 1);
		}
		return asd;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.length() >= 3) {
			if (input.substring(input.length() - 3).toLowerCase().equals("dev")) {
				return true;
			}
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int run = 0;
		int temp = 0;
		char let=' ';
		for (char letter : input.toCharArray()) {
			//System.out.println(let+" "+letter);
			if (letter == let) {
				temp += 1;
				if (run < temp) {
					run = temp;
				}
			} else {
				temp = 1;
				let = letter;
			}
		}
		if (run < temp) {
			run = temp;
		}
		//System.out.println(run);
		return run;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int ams=0;
		String[] asd=arg1.toLowerCase().split(" ");
		for (String word:asd) {
			
			if (word.equals("am")) {
				ams+=1;
			}
		}
		return ams;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5 return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		String fb="";
		if (arg1%3==0) {
			fb+="fizz";
		}
		if (arg1%5==0) {
			fb+="buzz";
		}
		return fb;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		int temp=0;
		int high=0;
		for (char num:arg1.toCharArray()){
			if (high<temp){
				high=temp;
			}
			
			if (num!=' '){
				temp+=num-48;
			}else{
				temp=0;
			}
		return high;
	}
}
