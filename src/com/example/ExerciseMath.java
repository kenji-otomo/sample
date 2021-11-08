package com.example;

public class ExerciseMath {
	
	public static int factorial(int n) {
		
		
		if (n <= 0) {
			throw new IllegalArgumentException("渡された値が正しくありません");
		}
		
		int result = kaijo(n);
		
		return result;
	}

	private static int kaijo(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
				result *= i;
		}
		
		return result;
	}

}
