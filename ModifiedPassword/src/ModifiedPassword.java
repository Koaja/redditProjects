import java.util.Scanner;

public class ModifiedPassword {
	public static void main(String[] args) {
		String password = "";
		int loginAttempts = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your password: ");
		password = input.nextLine();
		System.out.println("Password has been successfully saved.");

		while (true) {
			System.out.println("Enter password to login: ");
			String passwordAttempt = input.nextLine();
			System.out.println();
			if (passwordAttempt.equals(password)) {
				System.out.println("You dog you , you managed to remember your password and it only took you "
						+ loginAttempts + " attempts\n");
				System.out.println("You can now access Vatican's secret library");

				while (passwordAttempt.equals(password)) {
					System.out.println("1. View library");
					System.out.println("2. Change Password");
					System.out.println("3. Quit/n");
					System.out.println("So where to ?: ");

					String userChoice = input.nextLine();
					if (userChoice.equals("1")) {
						System.out.println("Rofl , like we'd actually show you this");
					}

					if (userChoice.equals("2")) {
						System.out.println("Enter new password: ");
						password = input.nextLine();
						System.out.println("Your new password has been saved");
						System.out.println("You will now be redirected to login.");
					}

					if (userChoice.equals("3")) {
						System.exit(0);
					}

				}
			} else {
				loginAttempts++;
				System.out.println("Incorrect Password");
				if (loginAttempts == 3) {
					System.out.println("Your account has been locked./n");
					break;
				}
			}
		}

	}
}
