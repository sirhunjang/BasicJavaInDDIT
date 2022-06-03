package study;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("gawibawiboji");
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		if (input1.equals(input2)) {
				System.out.println("Draw");
		} else if (input1.equals("R") && input2.equals("S")) {
			System.out.println("Player1 Win");
		} else if (input1.equals("R") && input2.equals("P")) {
			System.out.println("Player1 lose");
		} else if (input1.equals("S") && input2.equals("R")) {
			System.out.println("player1 lose");
		} else if (input1.equals("S") && input2.equals("P")) {
				System.out.println("player1 Win");
		} else if (input1.equals("P") && input2.equals("S")) {
			System.out.println("player1 losw");
		} else if (input1.equals("P") && input2.equals("R")) {
			System.out.println("player1 win");
		} else if (input1.equals("sex")) {
			System.out.println("jaerin");
		}
	}
}