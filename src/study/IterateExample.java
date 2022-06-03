package study;

import java.util.Random;

public class IterateExample {

	public static void main(String[] args) {
		String[] r1 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String[] r2 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String[] r3 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String[] r4 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String[] r5 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		String[] r6 = { "1", "2", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
		Random random = new Random(); 
        
		int rdNum1 = random.nextInt(19);
		int rdNum2 = random.nextInt(19);
		int rdNum3 = random.nextInt(19);
		int rdNum4 = random.nextInt(19);
		int rdNum5 = random.nextInt(19);
		int rdNum6 = random.nextInt(19);

		System.out.println(r1[rdNum1]);
		System.out.println(r2[rdNum2]);
		System.out.println(r3[rdNum3]);
		System.out.println(r4[rdNum4]);
		System.out.println(r5[rdNum5]);
		System.out.println(r6[rdNum6]);
		}
}	



