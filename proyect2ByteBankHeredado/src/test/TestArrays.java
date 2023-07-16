package test;

public class TestArrays {
	public static void main(String[] args) {
		
		int[] edades=new int[5];
		edades[0]=1;
		System.out.println(edades[0]);
		int tamanoArray=edades.length;
		System.out.println("Imprimiendo el array ");
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}
}
