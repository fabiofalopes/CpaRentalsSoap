//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;
import java.util.stream.Collectors;

import javax.jws.WebService;

import Server.RentalsServerIntf;

@WebService(targetNamespace = "http://default_package/", portName = "CpaRentalsSoapUtilityPort", serviceName = "CpaRentalsSoapUtilityService")
public class CpaRentalsSoapUtility {

	/*

	 	Change methods:
		 	- getIpAddress -> initConnection
		 	- getReservation -> makeReservation
		 	- change in RentalsServerInf.java -> cancelaReserva() take idReserva now
            - verifyDateFormat()
            - change getAvailableSombrinhas() -> Takes horario, data, idPraia
            - change makeReservation()
	*/

	private boolean flagInitConnection = false;
    private final String CONECTION_ERROR = "Erro de connecção com o RMI Server. Está a correr?";
    // private final String FILE_ERROR = "File error";
    private final String USER_NOT_LOGED_IN = "Erro: Utilizador não auteticado";
    private final String REMOTE_SERVER = "/RentalsServer";
    private final String USERS_FILE_NAME = "credentials.csv";
    private final String RESERVATIONS_FILE_NAME = "reservations.csv";
    private final String FILE_DIV = ";";
    private String rentalsServerURL;
    private RentalsServerIntf rentalsServerIntf;
    private ArrayList<User> users;
    private String usersFilePath;
    private String reservationsFilePath;

	public String initConnection(String ip_address) throws MalformedURLException, RemoteException, NotBoundException {
        // old name getIpAddress()
        // Entry method for SOAP Web Service Consumer
    	
    	if (!flagInitConnection) {
    		usersFilePath = verifyFileExistence(USERS_FILE_NAME); // Verifica se ficherio users existe se sim devolve absolute path
            reservationsFilePath = verifyFileExistence(RESERVATIONS_FILE_NAME); // Verifica se ficherio reservas existe se sim devolve absolute path

            System.out.println(usersFilePath);
            System.out.println(reservationsFilePath);
            
            //try (Scanner scanner = new Scanner(System.in)) {
            //    System.out.print("Enter the RMI Server IP address: ");
            //    String ip_address = scanner.nextLine();
            this.rentalsServerURL = "rmi://" + ip_address + REMOTE_SERVER;
            //}
            this.rentalsServerIntf = (RentalsServerIntf) Naming.lookup(rentalsServerURL);

            this.users = new ArrayList<User>();
            //initAuth("credentials.csv","reservations.csv");
            loadUsers();
            
            this.flagInitConnection = true;
            
            return "1";
    	}
    	
        return "0";
        
    }

	public String testRMI(int idUser) throws MalformedURLException, RemoteException, NotBoundException {
        try {
            if (userExists(idUser)) {
                String result = rentalsServerIntf.testRMI();
                return result;
            }
            else {
                return USER_NOT_LOGED_IN;
            }

        }catch (Exception e){
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }

    }

	public String getAvailableSombrinhas(int idUser, int horario , String data, String idPraia) throws MalformedURLException, RemoteException, NotBoundException{
        try {
            if (userExists(idUser)) {
                return rentalsServerIntf.listaSombrinhasDisponiveis(horario,data,idPraia);
            }
            else {
                return USER_NOT_LOGED_IN;
            }

        }catch (Exception e){
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }

    }

	public String makeReservation(int idUser, int horario, String data, String idPraia, int id_sombrinha) {
        // old method name getReservation(...)
        try {
            if (!verifyDateFormat(data)){
                return "Erro: Data mal formatada. Formato: yyyy-mm-dd";
            }
            if (horario < 8 || horario > 20){
                return "Erro: Horário inválido. Horário de funcionamento: 8h - 20h";
            }
            if (!idPraia.equals("A") && !idPraia.equals("B") && !idPraia.equals("C")){
                return "Erro: Praia inválida. Praias disponíveis: A, B, C";
            }
            if (userExists(idUser)) {
                // Passa reserva para backend
            	int idReserva = rentalsServerIntf.reservaSombrinha(horario,data,idPraia,id_sombrinha);
            	// Grava reserva no frontend
                addReservation(idUser,idReserva);
                return String.valueOf(idReserva);
            }
            else {
                return USER_NOT_LOGED_IN;
            }
        }catch (Exception e) {
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }
    }

	public String cancelReserva(int idUser, int idReserva) {
        try {
            if (userExists(idUser)) {
            	// Remove reserva do csv do frontend
            	// TODO - Change with userId
            	cancelReservation(idReserva);
            	// Envia para cancelar no backend
                int idReservaCancelada = rentalsServerIntf.cancelaReserva(idReserva);
                return String.valueOf(idReservaCancelada);
            }
            else {
                return USER_NOT_LOGED_IN;
            }
        }catch (Exception e) {
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }

    }

	public String getReservasTable(int idUser) {
        try {
            if (userExists(idUser)) {
                String table = rentalsServerIntf.getReservasTable();
                return table;
            }
            else {
                return USER_NOT_LOGED_IN;
            }
        }catch(Exception e) {
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }
    }

    private boolean verifyDateFormat(String date){
        // Format yyyy-mm-dd
        String[] parts = date.split("-");
        if (parts.length == 3){
            return parts[0].length() == 4 &&
                    parts[1].length() == 2 &&
                    parts[2].length() == 2;
        }
        return false;
    }

	public String getDailyOcupationTable(int idUser, String data, String idPraia) {
    	try {
            if (userExists(idUser)) {
                String tabelaOcupacaoDia = rentalsServerIntf.getTabelaOcupacaoDia(data, idPraia);
                return tabelaOcupacaoDia;
            }
            else {
                return USER_NOT_LOGED_IN;
            }
        }catch(Exception e) {
            System.out.println("Exception: " + e);
            return CONECTION_ERROR;
        }
    }
    
    // ---
    // Authentication methods
    // ---

    /*
    private String verifyFileExistence(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                    return file.getAbsolutePath(); // Cria ficheiro, devolve absolute path
                } else {
                    System.out.println("File already exists.");
                    return file.getAbsolutePath(); // Encontra ficheiro devolve alboslute path
                }
            } catch (IOException e) {
                System.out.println(FILE_ERROR);
                e.printStackTrace();
            }
        }
        if (file.exists()) {
        	return file.getAbsolutePath();
        }
        return "-1";
    }
    */
    
    private String verifyFileExistence(String fileName) {
	    // Use the correct file separator for the operating system
	    String fileSeparator = System.getProperty("file.separator");

	    // Get the user's home directory
	    String homeDirectory = System.getProperty("user.home");

	    // Specify the base directory within the home directory
	    String baseDirectory = homeDirectory + fileSeparator + "BeachBrela" + fileSeparator + "Frontend";

	    String filePath = baseDirectory + fileSeparator + fileName;
	    File file = new File(filePath);

	    File directory = new File(baseDirectory);

	    // Check if the directory exists, create it if not
	    if (!directory.exists()) {
	        if (directory.mkdirs()) {
	            System.out.println("Directory created: " + directory.getAbsolutePath());
	        } else {
	            System.out.println("Failed to create directory: " + directory.getAbsolutePath());
	            return "-1";
	        }
	    }

	    // Check if the file exists, create it if not
	    if (!file.exists()) {
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getAbsolutePath());
	                return file.getAbsolutePath(); // File created, return absolute path
	            } else {
	                System.out.println("File already exists: " + file.getAbsolutePath());
	                return file.getAbsolutePath(); // File exists, return absolute path
	            }
	        } catch (IOException e) {
	            System.out.println("Error creating file: " + file.getAbsolutePath());
	            e.printStackTrace();
	            return "-1"; // Return -1 if an error occurs
	        }
	    } else {
	        System.out.println("File already exists: " + file.getAbsolutePath());
	        return file.getAbsolutePath();
	    }
	}


    //private void initAuth(String usersFilePath, String reservationsFilePath) {
    //    this.usersFilePath = usersFilePath;
    //    this.reservationsFilePath = reservationsFilePath;
    //    loadUsers();
    //}

    private void loadUsers() {
        this.users = new ArrayList<>();
        String filename = usersFilePath;
        File file = new File(filename);
        if (file.exists()) {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                StringBuilder sb = new StringBuilder();
                int current;
                while ((current = fis.read()) != -1) {
                    sb.append((char) current);
                }
                String result = sb.toString();
                String[] lines = result.split("\n");
                for (String line : lines) {
                    String[] parts = line.split(FILE_DIV);
                    if (parts.length == 3) {
                        int userId = Integer.parseInt(parts[0].trim());
                        String username = parts[1].trim();
                        String password = parts[2].trim();
                        // Load user with constructor that takes ID
                        this.users.add(new User(userId, username, password));
                    }
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        }
    }

    private void saveUsers() {
        String filename = usersFilePath;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (User user : users) {
                writer.write(user.getUserId() + FILE_DIV + user.getUsername() + FILE_DIV + user.getPassword());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean userExists(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return true; // User with the given ID already exists
            }
        }
        return false; // User does not exist
    }

	/*

	 	Authentication methods for SOAP Consumer

	*/

	public int login(String username, String password) {
        if (users != null) {
            for (User user : users) {
                if (user.getUsername().equals(username) &&
                        user.getPassword().equals(password))
                {
                    // Login successful
                    return user.getUserId();
                }
            }
        }
        // Login failed
        return -1;
    }

	public int registerUser(String username, String password) {
        if (users != null) {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    return -1; // User with the same username already exists
                }
            }
        }
        // Create user with constructor that takes care of ID
        User newUser = new User(username, password);
        users.add(newUser);
        saveUsers();
        return newUser.getUserId();
    }

    /*
     */



    // -----------------------------
    // -----------------------------
    // -----------------------------
    // -----------------------------
    // -----------------------------

 
    public String getReservationById(int userId) {
    	// Method to get reservations by reservation ID 
        // Exemplo: 
        // getReservationById(1) = 19
        // getReservationById(5) = 21:22
    	List<Integer> reservationIds = new ArrayList<>();
        try {
            if (reservationsFilePath == null) {
                System.out.println("reservationsFilePath is null");
                return "Error: reservationsFilePath is null";
            }
            List<String> reservationLines = Files.readAllLines(Paths.get(reservationsFilePath));
            for (String line : reservationLines) {
                String[] reservationDetails = line.split(FILE_DIV);
                int storedUserId = Integer.parseInt(reservationDetails[0].trim());
                if (storedUserId == userId) {
                    int storedReservationId = Integer.parseInt(reservationDetails[1].trim());
                    reservationIds.add(storedReservationId);
                }
            }
            if (reservationIds.isEmpty()) {
                return "No reservations found for user";
            } else {
                return reservationIds.stream().map(String::valueOf).collect(Collectors.joining(":"));
            }
        } catch (IOException e) {
            System.err.println("Error reading reservations file: " + e.getMessage());
            return "Error reading reservations file";
        }
    }

	public String getReservationsByUserId(int userId) {
    	// Method to get reservations for a specific user by user ID
        /* Exemplo: extrai todas as linhas do csv correspondentes ao utilizador e devolve numa string separada por \n
        getReservationsByUserId(1) = 
        							1;19
        getReservationsByUserId(5) = 
        							5;21
        							5;22
        							*/
    	try {
            if (reservationsFilePath == null) {
                System.out.println("reservationsFilePath is null");
                return "Error: reservationsFilePath is null";
            }

            List<String> reservationLines = Files.readAllLines(Paths.get(reservationsFilePath));
            List<String> userReservations = reservationLines.stream().filter(line -> {
                String[] parts = line.split(FILE_DIV);
                return parts.length == 2 && Integer.parseInt(parts[0].trim()) == userId;
            }).collect(Collectors.toList());

            if (userReservations.isEmpty()) {
                return "No reservations found for user";
            } else {
                return String.join("\n", userReservations);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading reservations file";
        }
    }

    // Method to add a new reservation
	public String addReservation(int userId, int reservationId) {
        try {
            // Check if the reservation already exists
            if (reservationExists(reservationId)) {
                return "Reservation with ID " + reservationId + " already exists";
            }

            // Add the reservation to the CSV file
            String reservationLine = userId + FILE_DIV + reservationId;
            Files.write(Paths.get(reservationsFilePath), Collections.singletonList(reservationLine),
                    StandardOpenOption.APPEND);

            return "Reservation added successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error adding reservation";
        }
    }

    
	public String cancelReservation(int reservationId) {
		// Method to cancel a reservation
        try {
        	// TODO - Change with userId (+ 1 argumento user id )
            // Check if the reservation exists
            if (!reservationExists(reservationId)) {
                return "Reservation with ID " + reservationId + " does not exist";
            }

            // Remove the reservation from the CSV file
            List<String> reservationLines = Files.readAllLines(Paths.get(reservationsFilePath));
            List<String> updatedLines = reservationLines.stream().filter(line -> {
                String[] parts = line.split(FILE_DIV);
                return Integer.parseInt(parts[1].trim()) != reservationId; // Filter out the canceled reservation
            }).collect(Collectors.toList());

            Files.write(Paths.get(reservationsFilePath), updatedLines);

            return "Reservation canceled successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error canceling reservation";
        }
    }

    // Helper method to check if a reservation exists by ID
    private boolean reservationExists(int reservationId) {
        try {
            List<String> reservationLines = Files.readAllLines(Paths.get(reservationsFilePath));
            for (String line : reservationLines) {
                String[] parts = line.split(FILE_DIV);
                if (parts.length == 2 && Integer.parseInt(parts[1].trim()) == reservationId) {
                    return true; // Reservation with the given ID already exists
                }
            }
            return false; // Reservation does not exist
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}

