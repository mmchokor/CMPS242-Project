import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int back;
      int operator;
      
      do {
         System.out.println("1 - Reservation");
         System.out.println("2 - Room Info");
         System.out.println("3 - Restaurant/Room Food Service");
         System.out.println("4 - Checkout");
         System.out.println("5 - Exit Program");
         System.out.println("Enter the Menu Number you want to Enter: ");
         operator = input.nextInt();

         switch (operator) {
            case 1:
            // Creating an object g that can access the two classes Guest info and Reservation
               GuestInformation g = new GuestInformation();
               g.setGuestInfo(input);
               g.setGuestReservation(input);

               // to go back to the main menu 
               System.out.println("Enter \"0\" to go back to the main Menu.");
               do {
                  back = input.nextInt();
                  if (back != 0) {
                     System.out.println("You have enter a number other than 0. Try Again!");
                  }
               } while (back != 0);

               break;
               

            case 2:
               System.out.println("case 2");


               // to go back to the main menu 
               System.out.println("Enter \"0\" to go back to the main Menu.");
               do {
                  back = input.nextInt();
                  if (back != 0) {
                     System.out.println("You have enter a number other than 0. Try Again!");
                  }
               } while (back != 0);

               break;
            
            case 3:
               System.out.println("case 3");

               
               // to go back to the main menu 
               System.out.println("Enter \"0\" to go back to the main Menu.");
               do {
                  back = input.nextInt();
                  if (back != 0) {
                     System.out.println("You have enter a number other than 0. Try Again!");
                  }
               } while (back != 0);

               break;

            case 4:
               System.out.println("case 4");

               
               // to go back to the main menu 
               System.out.println("Enter \"0\" to go back to the main Menu.");
               do {
                  back = input.nextInt();
                  if (back != 0) {
                     System.out.println("You have enter a number other than 0. Try Again!");
                  }
               } while (back != 0);

               break;
               
            case 5:
               System.out.println("Exiting in process...");
               System.exit(0);
               break;
         
            default:
            System.out.println(operator + " is not a valid Menu Option! Please Select Another.");
               break;
         }
      } while (operator != 5);
      input.close();
}
}
