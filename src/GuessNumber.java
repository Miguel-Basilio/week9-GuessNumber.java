import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

Scanner in = new Scanner (System.in);

RandomNumber = myRandomNumber = new RandomNumber();

int computer = myRandomNumber.GetNumber_Between_and_10();
int userNumber;

System.out.println("Guess My Number!");
userNumber = in.nextInt();

if (userNumber > computer);
System.out.println("Wrong! Your number is too big!");

if (userNumber<computer);
System.out.print("Wrong!! Your Number is Too Small");

if (userNumber == computer);
System.out.println("Yes!! You Are Right!");

System.out.println("\n\nThe correct Number is");
System.out.println(computer);

	}

}
