import java.util.Scanner;

public class RomanNumeral {

 public static String getRomanNumeral(int number) {
  String[] romanNumerals = {
   "M",
   "CM",
   "D",
   "CD",
   "C",
   "XC",
   "L",
   "XL",
   "X",
   "IX",
   "V",
   "IV",
   "I"
  };
  int[] romanNumeralNumbers = {
   1000,
   900,
   500,
   400,
   100,
   90,
   50,
   40,
   10,
   9,
   5,
   4,
   1
  };
  String finalRomanNum = "";

  for (int i = 0; i < romanNumeralNumbers.length; i++) {
   int currentNum = number / romanNumeralNumbers[i];
   if (currentNum == 0) {
    continue;
   }

   for (int j = 0; j < currentNum; j++) {
    finalRomanNum += romanNumerals[i];
   }

   number %= romanNumeralNumbers[i];
  }
  return finalRomanNum;
 }

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer to find Roman Numeral :: ");
  int number = input.nextInt();
  if (number <= 0) {
   System.out.println("You have entered an invalid number. Please enter number greater than 0");
  } else {
   System.out.println("The Roman Numeral for entered number - " + number + " is " + getRomanNumeral(number));
  }

 }
}