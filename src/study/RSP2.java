package study;

import java.util.Random;
import java.util.Scanner;

public class RSP2 {
	public static void main(String[] args) {
		String[] rsp = { "R", "S", "P" };
		String[] rsp2 = { "S", "P", "R" };
		Random random = new Random();
//		System.out.println(rsp[random.nextInt(3)]);
//		System.out.println(rsp2[random.nextInt(3)]);
		Scanner scanner = new Scanner(System.in);
		String rspjr = rsp2[random.nextInt(3)];
		String rspck = rsp[random.nextInt(3)];
		System.out.println("rspjr :  " + rspjr);
		System.out.println("rspck :  " + rspck);
		if (rspjr.equals(rspck)) {
			System.out.println("draw");
		} else if (rspjr.equals("R") && rspck.equals("S")) {
			System.out.println("Player1 Win");
		} else if (rspjr.equals("R") && rspck.equals("P")) {
			System.out.println("Player1 lose");
		} else if (rspjr.equals("S") && rspck.equals("R")) {
			System.out.println("player1 lose");
		} else if (rspjr.equals("S") && rspck.equals("P")) {
				System.out.println("player1 Win");
		} else if (rspjr.equals("P") && rspck.equals("S")) {
			System.out.println("player1 losw");
		} else if (rspjr.equals("P") && rspck.equals("R")) {
			System.out.println("player1 Win");
		}
	}
	}
