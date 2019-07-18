package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DetailsNotFoundException;
import com.cg.frs.exceptions.OwnerDoesNotExistsException;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {

	// object of bean class flat registration
	static FlatRegistrationDTO flat1 = new FlatRegistrationDTO();
	static FlatRegistrationDTO flat = new FlatRegistrationDTO();

	// object of scanner class to take input from user
	static Scanner sc = new Scanner(System.in);
	// object of service interface

	static IFlatRegistrationService service = new FlatRegistrationServiceImpl();

	public static void main(String[] args) {

		String cont = "yes";
		do {
			switch (menu()) {
			case "1":

				int ownerId = 0;
				// to ask owner id as input from the user from predefined owner ids

				System.out.println("Enter Owner IDS Are:-[1,2,3]");
				System.out.println("Please Enter your Owner Id from the Above List: ");
				ownerId = sc.nextInt();
				flat.setOwnerId(ownerId);
				ArrayList<Integer> ids = new ArrayList<>();

				try {

					// to check whether the owner id entered by user is present or not

					ids = service.getAllOwnerIds();
					while (!ids.contains(ownerId)) {
						System.out.println("Owner id does not Exists");
						System.out.println("Please Enter your Owner Id from the Above List: ");
						ownerId = sc.nextInt();
					}
					// if the owner id is present then further inputs and operation

					System.out.println("Select Flat Type(1-1BHk , 2-2BHK)");
					int choice = sc.nextInt();

					// to check whether the choice of flat is entered correctly or not

					while (!(choice <= 2)) {
						if (choice == 1) {
							flat.setType("1BHK");
						} else if (choice == 2) {
							flat.setType("2BHK");
						} else {
							System.out.println("Invalid choice");
							System.out.println("Select Flat Type(1-1BHk , 2-2BHK)");
							choice = sc.nextInt();
						}
						// if the choice of flat is entered correctly further inputs and operations
					}

					// to take area as input form user
					System.out.println("Enter Flat Area in sq .ft");
					int area = sc.nextInt();
					flat.setFlatArea(area);

					// to take rent amount as input

					System.out.println("Enter desired Rent Amount");
					int rentAmount = sc.nextInt();

					// to take deposit amount as input from user

					System.out.println("Enter desired Deposit Amount");
					int depositAmount = sc.nextInt();

					// to check rent amount is less than deposit amount
					while(!(rentAmount<=depositAmount))
					{
						System.out.println("Rent amount cannot be greater than deposit amount");
						System.out.println("Enter desired Rent Amount");
						rentAmount = sc.nextInt();
						System.out.println("Enter desired Deposit Amount");
						depositAmount = sc.nextInt();
						
					}
					

					// generating registration id using Math.random()
					int registeratonId = ((int) (Math.random() * 1000) + 1000);

					flat.setRegisterationId(registeratonId);

					// passing the bean class object to service to register flat as per details
					// provided by user

					flat1 = service.registerFlat(flat);

					// checking if registered successfully or not
					if (flat1 == null) {
						System.out.println("Sorry Cannot Register ");

						// if registration is successful print the appropiate message along with the
						// registration id
					} else {
						System.out
								.println("Flat successfully Registered. Registration id " + flat1.getRegisterationId());

					}

					// if owner details is not present
				} catch (OwnerDoesNotExistsException e) {
					System.out.println(e);
				}

				break;

			// to get the user details based on registration id

			case "2":

				// to take registration id as input to show registration details to the user
				System.out.println("Enter Registration Id");
				int id = sc.nextInt();

				// to check if details is present or not
				// if present print the details or else throw exceptions
				try {
					flat = service.getDetails(id);
					System.out.println(flat);
				} catch (DetailsNotFoundException e) {
					System.out.println(e);
				}

				break;

			// to allow user to terminate the application
			case "3":
				System.out.println("Thank You for Using the Application");
				System.exit(0);
				break;

			// to check whether the input of cases are valid or not
			default:

				System.out.println("Invalid choice");
				menu();
				break;
			}
			// condition to run the application to run continously unless user wishes to
			// terminate

		} while (cont.equalsIgnoreCase("yes"));
	}

	// a method to show menu/options to the user using the application
	static String menu() {

		String choice = null;
		// menu
		System.out.println("1 Register Flat");
		System.out.println("2 Display Flat Registration Details");
		System.out.println("3 Exit");
		// to ask choice form user and perform operations
		System.out.println("Enter choice");
		choice = sc.next();

		// returning the choice to switch for further operations
		return choice;
	}
}
