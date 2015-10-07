package main;

public class PythagTheorem {

	static double sideA;
	static double sideB;
	static double hypotenuse;

	public static void main(String[] args) {

		System.out.println(getHypotenuse(3, 4));
		System.out.println(getSideA(10, 7));
		System.out.println(getSideB(15, 3));

	}

	public static double getSideA(double hypotenuse, double sideB) {

		return Math.sqrt(hypotenuse * hypotenuse - sideB * sideB);
	}

	public static double getSideB(double hypotenuse, double sideA) {

		return Math.sqrt(hypotenuse * hypotenuse - sideA * sideA);
	}

	public static double getHypotenuse(double sideB, double sideA) {

		return Math.sqrt(sideB * sideB + sideA * sideA);
	}

}
