package com.yeruru;

import java.util.Scanner;

/**
 * @author 이예림
 * @since 2023-12-02
 * @category 대소문자 바꾸기
 *
 */
public class BJ_2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				System.out.print((char) ('a' + ch - 'A'));
			} else {
				System.out.print((char) ('A' + ch - 'a'));
			}
		}

	}
}
