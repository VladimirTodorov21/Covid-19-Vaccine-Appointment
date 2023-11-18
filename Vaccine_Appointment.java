/*This program runs a code gives the user a choice to input an integer associated with a name of a vaccine
 *and also verifies the validity of that input. The user is then asked to proceed by inputing a series of 
 *integers that are associated with output options. If a vaccine is unavailable, the user may wish to continue
 *or exit the program. The same applies as to when the user inputs an integer associated with the "Quit" option.
 *Lastly, the program displays a message a farewell message to the user.*/

package assignment2;

import java.util.*; //Class needs to be imported

public class assignment2code2 
{
	public static void main (String[] args)
	{
		/*Scanner declared as Appointment*/
		Scanner Appointment = new Scanner(System.in);
		
		/*Formatted welcome message output and displays options for user*/
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      Welcome to Covid19 Vaccine Appointment Program!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here is the Coivd-19 vaccine menu:");
		System.out.println("    1. Pfizer");
		System.out.println("    2. Moderna");
		System.out.println("    3. AstraZeneca");
		System.out.println("    4. Johnson&Johnson");
		System.out.println("    5. Sinovac");
		System.out.println("    6. Gamaleya");
		System.out.println("    7. Exit");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		boolean IntegerValidity; //boolean variable declared
		boolean AnswerValidity; //boolean variable declared
		
		/*do-while loop to execute the statements and verify at the end if conditions are true. 
		 * If True, loop occurs. If False, the loop ends and user exits the loop.
		 * Conditions: NOT IntegerValidity is true
		 *             NOT AnswerValidity is true*/
		do
		{
			System.out.print("\nPlease enter your choice (1-7): "); //Prompts user to input an integer between 1 and 7
			int VaccineOption = Appointment.nextInt(); //VaccineOption input
			String Vaccine = ""; //empty string for vaccine
			IntegerValidity = (VaccineOption > 0) && (VaccineOption < 8); //meaning of boolean IntegerValidity. True if int (1,7). False otherwise.
			
			/*String of vaccine locations and availability*/
			String location1 = "Pharmaprix";
			String location2 = "Jean Coutu";
			String location3 = "Uniprix Clinique";
			String location4 = "Health Center";
			
			/*Strings assigned to specific time slots*/
			String TimeSlot1 = "2:00 - 2:15";
			String TimeSlot2 = "2:20 - 2:35";
			String TimeSlot3 = "2:40 - 2:55";
			String TimeSlot4 = "3:00 - 3:15";
			String TimeSlot5 = "Quit";
			
			String Answer = ""; // empty String for yes or no Answer
			/*Switch used for integers between 1 and 7 and integer assigned to empty String Vaccine.
			 * Otherwise, default message will display invalid input and the user restarts the loop*/
			switch (VaccineOption)
			{
			case 1: 
				Vaccine = "Pfizer"; //String Vaccine assigned to Pfizer
				
				System.out.println("Your choise is: " + Vaccine + ".\n"); //Shows what choice of vaccine the user has input
				
				/*Output message that shows the locations of the distributed Vaccine*/
				System.out.println("Please choose the location of vaccine " + Vaccine +":");
				System.out.println("        1 - " + location1);
				System.out.println("        2 - " + location2);
				System.out.print("Please enter your choice: ");
				
				int P_LocationOption = Appointment.nextInt(); //user input for choice of location as an integer
				String P_Location = ""; //empty string for location
				
				/*Condition for each specific integer input, empty string is assigned to another existing string*/
				if (P_LocationOption == 1)
					P_Location = location1;
				else if (P_LocationOption == 2)
					P_Location = location2;
				
				if (P_LocationOption == 1 || P_LocationOption == 2)
				{
					/*Output message that shows the time slots in which the user can appoint themselves*/
					System.out.println("\nPlease choose the time slots :");
					System.out.println("        1 - " + TimeSlot1);
					System.out.println("        2 - " + TimeSlot2);
					System.out.println("        3 - " + TimeSlot3);
					System.out.println("        4 - " + TimeSlot4);
					System.out.println("        5 - " + TimeSlot5);
					System.out.print("Please enter your choice (1-5): ");
				}
				
				int P_TimeSlot = Appointment.nextInt(); //user input for choice of time slot as an integer
				String P_Time = ""; //empty string for time
				
				/*Condition from integers 1-4, Time is equivalent to the specific time slots*/
				if (P_TimeSlot == 1)
					P_Time = TimeSlot1;
				else if (P_TimeSlot == 2)
					P_Time = TimeSlot2;
				else if (P_TimeSlot == 3)
					P_Time = TimeSlot3;
				else if (P_TimeSlot == 4)
					P_Time = TimeSlot4;
				
				/*Condition if user inputs one of the integers from 1 to 4*/
				if (P_TimeSlot == 1 || P_TimeSlot == 2 || P_TimeSlot == 3 || P_TimeSlot == 4)
				{
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): "); //prompts user to input value from 1 to 2
					int P_VaccineShot = Appointment.nextInt(); //user input for vaccine shot
					String P_Dose = ""; //empty string for dose
					
					/*Condition when integer is either 1 or 2, Dose takes a specific output for its string*/
					if (P_VaccineShot == 1)
						P_Dose = "1st";
					else if (P_VaccineShot == 2)
						P_Dose = "2nd";
					
					/*Displays the information of successful appointment for user*/
					System.out.println("\nYour booked appointment is: " + Vaccine + ", " + P_Dose + " dose.");
					System.out.println("Your schedule is: " + P_Time + " @ " + P_Location + ".");
				} 
				else if (P_TimeSlot == 5) //Condition if user inputs integer = 5
				{
					/*Asks the user if they wish to continue or exit the program*/
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					String AnswerToCase1 = Appointment.next();
					if (AnswerToCase1.equals("yes"))
						Answer = "yes";
					else if (AnswerToCase1.equals("no"))
						Answer = "no";
				}
				break; // exits case 1
			case 2: 
				Vaccine = "Moderna"; //String Vaccine assigned to Moderna
				
				System.out.println("Your choise is: " + Vaccine); // Shows what choice of vaccine the user has input
				
				/*Output message that shows the locations of the distributed Vaccine*/
				System.out.println("\nPlease choose the location of vaccine " + Vaccine +":");
				System.out.println("        1 - " + location1);
				System.out.println("        3 - " + location3);
				System.out.println("        4 - " + location4);
				System.out.print("Please enter your choice: ");
				
				int M_LocationOption = Appointment.nextInt(); //user input for choice of location as an integer
				String M_Location = ""; //empty string for location
				
				/*Condition for each specific integer input, empty string is assigned to another existing string*/
				if (M_LocationOption == 1)
					M_Location = location1;
				else if (M_LocationOption == 3)
					M_Location = location3;
				else if (M_LocationOption == 4)
					M_Location = location4;
				
				if (M_LocationOption == 1 || M_LocationOption == 3 || M_LocationOption == 4)
				{
					/*Output message that shows the time slots in which the user can appoint themselves*/
					System.out.println("\nPlease choose the time slots :");
					System.out.println("        1 - " + TimeSlot1);
					System.out.println("        2 - " + TimeSlot2);
					System.out.println("        3 - " + TimeSlot3);
					System.out.println("        4 - " + TimeSlot4);
					System.out.println("        5 - " + TimeSlot5);
					System.out.print("Please enter your choice (1-5): ");
				}
				
				int M_TimeSlot = Appointment.nextInt(); //user input for choice of time slot as an integer
				String M_Time = ""; //empty string for time
				
				/*Condition from integers 1-4, Time is equivalent to the specific time slots*/
				if (M_TimeSlot == 1)
					M_Time = TimeSlot1;
				else if (M_TimeSlot == 2)
					M_Time = TimeSlot2;
				else if (M_TimeSlot == 3)
					M_Time = TimeSlot3;
				else if (M_TimeSlot == 4)
					M_Time = TimeSlot4;
				
				/*Condition if user inputs one of the integers from 1 to 4*/
				if (M_TimeSlot == 1 || M_TimeSlot == 2 || M_TimeSlot == 3 || M_TimeSlot == 4)
				{
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): "); //prompts user to input value from 1 to 2
					int M_VaccineShot = Appointment.nextInt(); //user input for vaccine shot
					String M_Dose = ""; //empty string for dose
					
					/*Condition when integer is either 1 or 2, Dose takes a specific output for its string*/
					if (M_VaccineShot == 1)
						M_Dose = "1st";
					else if (M_VaccineShot == 2)
						M_Dose = "2nd";
					
					/*Displays the information of successful appointment for user*/
					System.out.println("\nYour booked appointment is: " + Vaccine + ", " + M_Dose + " dose.");
					System.out.println("Your schedule is: " + M_Time + " @ " + M_Location + ".");
				} 
				else if (M_TimeSlot == 5) //Condition if user inputs integer = 5
				{
					/*Asks the user if they wish to continue or exit the program*/
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					String AnswerToCase2 = Appointment.next();
					if (AnswerToCase2.equals("yes"))
						Answer = "yes";
					else if (AnswerToCase2.equals("no"))
						Answer = "no";
				}
				break;	//exits case 2
			case 3: 
				Vaccine = "AstraZeneca"; //String Vaccine assigned to AstraZeneca
				System.out.println("Your choise is: " + Vaccine); //Shows what choice of vaccine the user has input
				
				/*Output message that shows the locations of the distributed Vaccine*/
				System.out.println("\nPlease choose the location of vaccine " + Vaccine +":");
				System.out.println("        2 - " + location2);
				System.out.println("        3 - " + location3);
				System.out.print("Please enter your choice: ");
				
				int AZ_LocationOption = Appointment.nextInt(); //user input for choice of location as an integer
				String AZ_Location = ""; //empty string for location
				
				/*Condition for each specific integer input, empty string is assigned to another existing string*/
				if (AZ_LocationOption == 2)
					AZ_Location = location2;
				else if (AZ_LocationOption == 3)
					AZ_Location = location3;
				
				if (AZ_LocationOption == 2 || AZ_LocationOption == 3)
				{
					/*Output message that shows the time slots in which the user can appoint themselves*/
					System.out.println("\nPlease choose the time slots :");
					System.out.println("        1 - " + TimeSlot1);
					System.out.println("        2 - " + TimeSlot2);
					System.out.println("        3 - " + TimeSlot3);
					System.out.println("        4 - " + TimeSlot4);
					System.out.println("        5 - " + TimeSlot5);
					System.out.print("Please enter your choice (1-5): ");
				}
				
				int AZ_TimeSlot = Appointment.nextInt(); //user input for choice of time slot as an integer
				String AZ_Time = ""; //empty string for time
				
				/*Condition from integers 1-4, Time is equivalent to the specific time slots*/
				if (AZ_TimeSlot == 1)
					AZ_Time = TimeSlot1;
				else if (AZ_TimeSlot == 2)
					AZ_Time = TimeSlot2;
				else if (AZ_TimeSlot == 3)
					AZ_Time = TimeSlot3;
				else if (AZ_TimeSlot == 4)
					AZ_Time = TimeSlot4;
				
				/*Condition if user inputs one of the integers from 1 to 4*/
				if (AZ_TimeSlot == 1 || AZ_TimeSlot == 2 || AZ_TimeSlot == 3 || AZ_TimeSlot == 4)
				{
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): "); //prompts user to input value from 1 to 2
					int AZ_VaccineShot = Appointment.nextInt(); //user input for vaccine shot
					String AZ_Dose = ""; //empty string for dose
					
					/*Condition when integer is either 1 or 2, Dose takes a specific output for its string*/
					if (AZ_VaccineShot == 1)
						AZ_Dose = "1st";
					else if (AZ_VaccineShot == 2)
						AZ_Dose = "2nd";
					
					/*Displays the information of successful appointment for user*/
					System.out.println("\nYour booked appointment is: " + Vaccine + ", " + AZ_Dose + " dose.");
					System.out.println("Your schedule is: " + AZ_Time + " @ " + AZ_Location + ".");
				} 
				else if (AZ_TimeSlot == 5) //Condition if user inputs integer = 5
				{
					/*Asks the user if they wish to continue or exit the program*/
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					String AnswerToCase3 = Appointment.next();
					if (AnswerToCase3.equals("yes"))
						Answer = "yes";
					else if (AnswerToCase3.equals("no"))
						Answer = "no";
				}
				break; //exists case 2
			case 4: 
				Vaccine = "Johnson&Johnson"; //String Vaccine assigned to Johnson&Johnson
				System.out.println("Your choise is: " + Vaccine); //Shows what choice of vaccine the user has input
				
				/*Output message that shows the locations of the distributed Vaccine*/
				System.out.println("\nPlease choose the location of vaccine " + Vaccine +":");
				System.out.println("        4 - " + location4);
				System.out.print("Please enter your choice: ");
				
				int J_LocationOption = Appointment.nextInt(); //user input for choice of location as an integer
				String J_Location = ""; //empty string for location
				
				/*Condition for each specific integer input, empty string is assigned to another existing string*/
				if (J_LocationOption == 4)
					J_Location = location4;
				
				if (J_LocationOption == 4)
				{
					/*Output message that shows the time slots in which the user can appoint themselves*/
					System.out.println("Please choose the time slots :");
					System.out.println("        1 - " + TimeSlot1);
					System.out.println("        2 - " + TimeSlot2);
					System.out.println("        3 - " + TimeSlot3);
					System.out.println("        4 - " + TimeSlot4);
					System.out.println("        5 - " + TimeSlot5);
					System.out.print("Please enter your choice (1-5): ");
				}
				
				int J_TimeSlot = Appointment.nextInt(); //user input for choice of time slot as an integer
				String J_Time = ""; //empty string for time
				
				/*Condition from integers 1-4, Time is equivalent to the specific time slots*/
				if (J_TimeSlot == 1)
					J_Time = TimeSlot1;
				else if (J_TimeSlot == 2)
					J_Time = TimeSlot2;
				else if (J_TimeSlot == 3)
					J_Time = TimeSlot3;
				else if (J_TimeSlot == 4)
					J_Time = TimeSlot4;
				
				/*Condition if user inputs one of the integers from 1 to 4*/
				if (J_TimeSlot == 1 || J_TimeSlot == 2 || J_TimeSlot == 3 || J_TimeSlot == 4)
				{
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): "); //prompts user to input value from 1 to 2
					int J_VaccineShot = Appointment.nextInt(); //user input for vaccine shot
					String J_Dose = ""; //empty string for dose
					
					/*Condition when integer is either 1 or 2, Dose takes a specific output for its string*/
					if (J_VaccineShot == 1)
						J_Dose = "1st";
					else if (J_VaccineShot == 2)
						J_Dose = "2nd";
					
					/*Displays the information of successful appointment for user*/
					System.out.println("\nYour booked appointment is: " + Vaccine + ", " + J_Dose + " dose.");
					System.out.println("Your schedule is: " + J_Time + " @ " + J_Location + ".");
				} 
				else if (J_TimeSlot == 5) //Condition if user inputs integer = 5
				{
					/*Asks the user if they wish to continue or exit the program */
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					String AnswerToCase4 = Appointment.next();
					if (AnswerToCase4.equals("yes"))
						Answer = "yes";
					else if (AnswerToCase4.equals("no"))
						Answer = "no";
				}
				break; //exits case 4
			case 5: 
				Vaccine = "Sinovac"; //String Vaccine assigned to Sinovac
				System.out.println("Sorry, " + Vaccine + " is not available now!"); //displays a message of unavailability
				/*Asks user if they wish to continue*/
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				String AnswerToCase5 = Appointment.next();
				if (AnswerToCase5.equals("yes"))
					Answer = "yes";
				else if (AnswerToCase5.equals("no"))
					Answer = "no";
				break; //exits case 5
			case 6: 
				Vaccine = "Gamaleya"; //String Vaccine assigned to Gamaleya
				System.out.println("Sorry, " + Vaccine + " is not available now!"); //displays a message of unavailability
				/*Ask user if they wish to continue*/
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				String AnswerToCase6 = Appointment.next();
				if (AnswerToCase6.equals("yes"))
					Answer = "yes";
				else if (AnswerToCase6.equals("no"))
					Answer = "no";
				break; //exits case 6
			case 7: 
				Vaccine = "Exit"; //String Vaccine assigned to Exit
				/*Ask user if they wish to continue*/
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				String AnswerToCase7 = Appointment.next();
				if (AnswerToCase7.equals("yes"))
					Answer = "yes";
				else if (AnswerToCase7.equals("no"))
					Answer = "no";
				break; //exists case 7
			default: //output when input of integer is NOT from 1 to 7
				if (!IntegerValidity)
					System.out.println("\nThis is a wrong input. Please try again!");
				break; //exits default
			} //end of switch
			
			/*boolean AnswerValidity is true if Answer equals "yes"*/
			AnswerValidity = Answer.equals("yes");
			
		} while (!IntegerValidity || AnswerValidity); // Condition is satisfied if NOT IntegerValidity is true or Answer Validity is true
		
		System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!"); //Prints a farewell message to user
		
		Appointment.close(); //close scanner
	} // end of main
}//end of public class
