package com.gelopfalcon.lambda_expressions_example;

public class Test {
	public static void main(String[] args) {
		UseTodo useTodo = new UseTodo();
		System.out.println("Bienvenido!");
		
		Todo todo = parameter -> parameter + " from lambda";
		String result = useTodo.add("Message ", todo);
		
		System.out.println(result);
	}
}
