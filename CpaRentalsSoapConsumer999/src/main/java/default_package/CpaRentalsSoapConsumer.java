package default_package;

import java.rmi.RemoteException;
import java.util.*;

import javax.jws.WebParam;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CpaRentalsSoapConsumer {

	private static void clearConsole() {
		System.out.print("\n-------\n\n"); // \n \n \n \n
	}

	// private static final String SERVICE_ADDRESS_PREFIX =
	// "http://%s:8080/CpaSoapUtilityTests/services/CpaSoapUtilityTestsPort";
	private static final String SERVICE_ADDRESS_PREFIX = "http://%s:8080/CpaRentalsSoapUtility999/services/CpaRentalsSoapUtilityPort";

	private static void printMenuHeader(String header) {
		System.out.println("===== BeachBrela Reservation System =====");
		System.out.println("            ---  " + header + "  ---");
	}

	private static void printServerMenu() {
		clearConsole();
		printMenuHeader("Server Menu");
		System.out.println("1. Connect to Server");
		System.out.println("2. Exit");
		System.out.println("Enter your choice: ");
	}

	private static void printAuthMenu() {
		clearConsole();
		printMenuHeader("Login Menu");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.println("Please enter your choice (1-3): ");
	}

	private static void printUserMenu() {
		clearConsole();
		printMenuHeader("User Menu");
		System.out.println("1. Fazer Reserva");
		System.out.println("2. Verificar Sombrinhas Disponiveis");
		System.out.println("3. Verificar Reservas");
		System.out.println("4. Cancelar Reservas");
		System.out.println("5. LogOut");
		System.out.println("Please enter your choice (1-5): ");
	}

	private static int getValidReservationTime(Scanner scanner) {
		while (true) {
			try {
				String input = getUserInput("Enter the reservation time (8-20): \nExample: 14 ", scanner);
				int horario = Integer.parseInt(input);

				// Check if the input is within the valid range
				if (horario >= 8 && horario <= 20) {
					return horario;
				} else {
					System.out.println("Invalid input. Please enter a time between 8 and 20.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		}
	}

	private static String getValidBeachID(Scanner scanner) {
		while (true) {
			String input = getUserInput("Enter the beach ID (A, B, or C): \nExample: A", scanner);
			input = input.toUpperCase(); // Convert to uppercase

			// Check if the input is a valid beach ID
			if (input.equals("A") || input.equals("B") || input.equals("C")) {
				return input;
			} else {
				System.out.println("Invalid beach ID. Please enter A, B, or C.");
			}
		}
	}

	private static void handleReservarMenu(JaxWsProxyFactoryBean factory, Object client, Scanner scanner, int userId)
			throws NotBoundException_Exception, MalformedURLException_Exception {
		clearConsole();
		printMenuHeader("Reserva Menu");
		System.out.println("1. Fazer Reserva");
		System.out.println("2. Voltar");
		System.out.println("Please enter your choice (1-2): ");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// Handle Fazer Reserva
			System.out.println("Enter the details for the reservation:");

			// Get user input for other details if needed
			int horario = getValidReservationTime(scanner);
			String data = getUserInput("Enter the reservation date: \nExample: 2024-12-12 ", scanner);
			String idPraia = getValidBeachID(scanner);

			idPraia.toUpperCase();
			System.out.println("Sombrinhas disponiveis");
			System.out.println(((CpaRentalsSoapUtility) client).getAvailableSombrinhas(userId, horario, data, idPraia));

			int idSombrinha = Integer.parseInt(getUserInput("Enter the umbrella ID: \nExample: 2", scanner));

			String reservaSuccess = ((CpaRentalsSoapUtility) client).makeReservation(userId, horario, data, idPraia, idSombrinha);
			if (!reservaSuccess.equals("-1")) {
				System.out.println("Reservation successful! Reservation ID: " + reservaSuccess);
			} else {
				System.out.println("Reservation failed. Please try again.");
			}
			break;
		case 2:
			// Voltar (Go back to the User Menu)
			break;
		default:
			System.out.println("Invalid choice. Please enter 1 or 2.");
			break;
		}
	}

	private static String getUserInput(String prompt, Scanner scanner) {
		System.out.println(prompt);
		return scanner.next();
	}

	private static void cancelReserva(JaxWsProxyFactoryBean factory, Object client, Scanner scanner, int userId,
			String username, String password) {
		System.out.println("Cancelar Reserva selected.");

		// Additional input or logic for cancellation if needed
		// Assuming userChoice is the reservation ID to cancel

		String reservations = ((CpaRentalsSoapUtility) client).getReservationById(userId);
		System.out.println("Reservas do utilizador com ID:" + userId + "\n	" + reservations + "\n");

		int inputIdReserva = Integer.parseInt(getUserInput("Enter reservation ID:", scanner));

		String cancelSuccess = ((CpaRentalsSoapUtility) client).cancelReserva(userId, inputIdReserva);
		if (cancelSuccess != "-1") {
			System.out.println("Reservation canceled successfully!");
		} else {
			System.out.println("Cancellation failed. Please try again.");
		}
	}

	private static void handleLogin(JaxWsProxyFactoryBean factory, Object client, Scanner scanner) {
		System.out.println("Login selected.");
		String username = getUserInput("Enter username: ", scanner);
		String password = getUserInput("Enter password: ", scanner);

		int userId = ((CpaRentalsSoapUtility) client).login(username, password);
		if (userId != -1) {
			System.out.println("Login successful!");

			boolean loggedIn = true;
			while (loggedIn) {
				printUserMenu();
				int userChoice = scanner.nextInt();

				switch (userChoice) {
				case 1:
					try {
						// HANDLE RESERVA
						handleReservarMenu(factory, client, scanner, userId);
					} catch (NotBoundException_Exception e) {
						e.printStackTrace();
					} catch (MalformedURLException_Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					// Handle Verificar Sombrinhas Disponiveis
					try {
						//int horario = Integer.parseInt(getUserInput("Enter the reservation time: \nExample: 14 ", scanner));
						String data = getUserInput("Enter the reservation date: \nExample: 2024-12-12 ", scanner);
						String idPraia = getUserInput("Enter the beach ID: \nExample: A", scanner);

						System.out.println(((CpaRentalsSoapUtility) client).getAvailableSombrinhas(userId, 0, data, idPraia));
						System.out.println(((CpaRentalsSoapUtility) client).getDailyOcupationTable(userId, data, idPraia));
					} catch (NotBoundException_Exception e) {
						e.printStackTrace();
					} catch (MalformedURLException_Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					// Handle Verificar Reservas
					String reservations = ((CpaRentalsSoapUtility) client).getReservationById(userId);
					if (reservations.equals("No reservations found for user") || 
						reservations.equals("Error reading reservations file")) 
					{
						System.out.println(reservations);
					} 
					else {
						System.out.println("Reservations for user " + userId + ": " + reservations);

						String reservasTable = ((CpaRentalsSoapUtility) client).getReservasTable(userId);
						System.out.println(reservasTable);
					}
					break;
				case 4:
					// Handle Cancelar Reservas
					cancelReserva(factory, client, scanner, userId, username, password);
					break;
				case 5:
					System.out.println("Logging out...");
					loggedIn = false;
					break;
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 5.");
					break;
				}
			}
		} else {
			System.out.println("Login failed. Please try again.");
		}
	}

	private static void handleRegister(JaxWsProxyFactoryBean factory, Object client, Scanner scanner) {
		System.out.println("Register selected.");
		String username = getUserInput("Enter username: ", scanner);
		String password = getUserInput("Enter password: ", scanner);

		int registerSuccess = ((CpaRentalsSoapUtility) client).registerUser(username, password);
		if (registerSuccess != -1) {
			System.out.println("Registration successful!");
		} else {
			System.out.println("Registration failed. Please try again.");
		}
	}

	public static void main(String[] args)
			throws NotBoundException_Exception, MalformedURLException_Exception, RemoteException {

		Scanner scanner = new Scanner(System.in);
		String ip;
		int choice;

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		boolean serverChoice = false;

		while (!serverChoice) {
			printServerMenu();
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				boolean invalid_ip = true;
				while (invalid_ip) {
					System.out.println("Connect to server.");
					ip = getUserInput("Enter server: IP or Hostname", scanner);
					try {
						factory.setAddress(String.format(SERVICE_ADDRESS_PREFIX, ip));
						invalid_ip = false;
					}catch (Exception e) {
					    // If an exception is thrown, print an error message and do not set serverChoice to true
					    System.out.println("Invalid IP address. Please try again.");
					}
				}
				serverChoice = true;
				break;
			case 2:
				System.out.println("Exiting...");
				serverChoice = true;
				return;
			default:
				System.out.println("Invalid choice. Please enter 1 or 2.");
				break;
			}
		}

		// Connect
		factory.setServiceClass(CpaRentalsSoapUtility.class);
		Object client = factory.create(); // Object client

		// Call method for inserting RMI Server IP address
		// Now pass Ip address as a parameter
        String ip_address = getUserInput("Enter the RMI Server IP address: ", scanner);
        
        System.out.println("\nip_address = " + ip_address);
        
		String init = ((CpaRentalsSoapUtility) client).initConnection(ip_address);

		/*
		 * if (init != "1") { System.out.println("initConnection falhou"); return; }
		 */
		try {
			boolean running = true;
			while (running) {
				printAuthMenu();
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					handleLogin(factory, client, scanner);
					break;
				case 2:
					handleRegister(factory, client, scanner);
					break;
				case 3:
					System.out.println("Exiting...");
					running = false;
					break;
				default:
					System.out.println("Invalid choice. Please enter 1, 2, or 3.");
					break;
				}
			}

			/*
			 * Scanner scanner = new Scanner(System.in); int userId = -1; String username,
			 * password;
			 * 
			 * JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			 * 
			 * // Use the URL defined in the soap address portion of the WSDL
			 * //factory.setAddress(
			 * "http://localhost:8080/CpaSoapUtilityTests/services/CpaSoapUtilityTestsPort")
			 * ; factory.setAddress(
			 * "http://localhost:8080/CpaSoapUtilityFinal/services/CpaSoapUtilityFinalPort")
			 * ;
			 * 
			 * 
			 * // Utilize the class which was auto-generated by Apache CXF wsdl2java
			 * factory.setServiceClass(CpaSoapUtilityFinal.class);
			 * 
			 * Object client = factory.create();
			 * 
			 * try { // Call the Web Service to perform an operation
			 * 
			 * // Call method for inserting RMI Server IP address String init =
			 * ((CpaSoapUtilityFinal)client).getIpAddress();
			 * 
			 * boolean running = true; while (running) { System.out.println("User Menu");
			 * System.out.println("1. Login"); System.out.println("2. Register");
			 * System.out.println("3. Exit");
			 * System.out.print("Please enter your choice (1-3): ");
			 * 
			 * int choice = scanner.nextInt();
			 * 
			 * switch (choice) { case 1: // Call your login method here
			 * System.out.println("Login selected."); //System.out.println();
			 * 
			 * System.out.println("Enter username: "); username = scanner.next();
			 * 
			 * System.out.println("Enter password: "); password = scanner.next();
			 * 
			 * //scanner.close();
			 * 
			 * // Assuming the login method requires a username and password int
			 * loginSuccess = ((CpaSoapUtilityFinal)client).login(username, password);
			 * 
			 * if (loginSuccess != -1) { System.out.println("Login successful!"); // Proceed
			 * with logged-in user actions } else {
			 * System.out.println("Login failed. Please try again."); } break; case 2: //
			 * Call your register method here System.out.println("Register selected.");
			 * 
			 * System.out.println("Enter username: "); username = scanner.next();
			 * 
			 * System.out.println("Enter password: "); password = scanner.next();
			 * 
			 * // Assuming the login method requires a username and password int
			 * registerSucess = ((CpaSoapUtilityFinal)client).registerUser(username,
			 * password);
			 * 
			 * if (registerSucess != -1) { System.out.println("Registed successful!"); //
			 * Proceed with logged-in user actions } else {
			 * System.out.println("Register failed. Please try again."); }
			 * 
			 * break; case 3: System.out.println("Exiting..."); running = false; break;
			 * default: System.out.println("Invalid choice. Please enter 1, 2, or 3.");
			 * break; } }
			 * 
			 * String testeResponse = ((CpaSoapUtilityFinal)client).testRMI(userId);
			 * System.out.println(testeResponse);
			 * 
			 * 
			 * String response = ((CpaSoapUtilityFinal)client).getAvailableSombrinhas();
			 * System.out.println(response);
			 * 
			 * //----- String data = "2024-12-23"; int hora = 9; String idPraia = "A"; int
			 * idSombra = 12; String reserva_responce =
			 * ((CpaSoapUtilityFinal)client).getReserva(hora,data,idPraia,idSombra);
			 * System.out.println(reserva_responce);
			 * 
			 * String tabela = ((CpaSoapUtilityFinal)client).getReservasTable();
			 * System.out.println(tabela);
			 */

		} catch (SecurityException e) {

			e.printStackTrace();

		} catch (IllegalArgumentException e) {

			e.printStackTrace();

		}
	}

}
