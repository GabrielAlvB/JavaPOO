package com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre= "Gabriel";
		nombre=nombre.replace("a", "o");
		nombre=nombre.toUpperCase();
		char letra=nombre.charAt(0);
		//nombre.charAt(1);
		//nombre.indexOf("a");
		System.out.println(nombre);
		System.out.println(letra);
	
	}
}
