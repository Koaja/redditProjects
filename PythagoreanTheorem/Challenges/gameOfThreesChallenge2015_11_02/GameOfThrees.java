package gameOfThreesChallenge2015_11_02;

public class GameOfThrees {

	public static void main(String[] args) {

		int inputNumber = 31337357;

		while (inputNumber != 1) {
			if (inputNumber % 3 == 0) {
				inputNumber = inputNumber / 3;
				System.out.println(inputNumber);
			} else if (inputNumber % 3 == 1) {
				inputNumber -= 1;
				inputNumber = inputNumber / 3;
				System.out.println(inputNumber);

			} else if (inputNumber % 3 == 2) {
				inputNumber += 1;
				inputNumber = inputNumber / 3;
				System.out.println(inputNumber);
			}
		}
	}
}
