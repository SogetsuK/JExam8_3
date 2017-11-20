package com.pso1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMain {

	public static void main(String[] args) {
		boolean b = true;
		int i = 0;
		String j = null;
		while(b) {
			try {
				System.out.print("番号入力：");
				i = new Scanner(System.in).nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("数値を入力してください。");
				continue;
			}
		}
		System.out.print("名前入力：");
		j = new Scanner(System.in).next();
		System.out.println("番号は「" + i + "」、名前は「" + j + "」さんですね。");
	}
}

