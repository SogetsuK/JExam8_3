package com.pso1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMain {

	public static void main(String[] args) {
		boolean b = true;
		int i = 0;
		String j = null;
		Scanner s = new Scanner(System.in);
		while(b) {
			try {
				System.out.print("番号入力：");
				i =s.nextInt();
				break;
			}catch(InputMismatchException e) {
				s.next();
				System.out.println("数値を入力してください。");
			}
		}
		System.out.print("名前入力：");
		j = s.next();
		System.out.println("番号は「" + i + "」、名前は「" + j + "」さんですね。");
		s.close();
	}
}

