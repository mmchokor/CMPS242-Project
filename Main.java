import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int back = 1;
      int operator;
      // Creating an object g that can access the two classes Guest info and
      Reservation g[] = {new GuestInformation(), new Reservation()};
      CheckOut c = new CheckOut();

      do {
         System.out.println("Main Menu:");
         System.out.println("1 - Reservation");
         System.out.println("2 - Room Info");
         System.out.println("3 - Restaurant/Room Food Service");
         System.out.println("4 - Checkout");
         System.out.println("5 - Exit Program");
         System.out.println("Enter the Menu Number you want to Enter: ");
         operator = input.nextInt();

         switch (operator) {
            case 1:
               // Reservation
               g[0].setGuestInfo(input);
               g[1].setGuestReservation(input);

               // to go back to the main menu
               backToMenu(input, back);

               break;

            case 2:
               // Room Info
               // Creating many object using polymorphism to display the info of each room

               StandardRoom r[] = { new StandardRoom(), new DoubleRoom(), new TripleRoom(), new KingSizeRoom(),
                     new Suite() };

               // integers to select which operator
               int roomInfoSelect;
               // a switch inside a do while to let the user which room info he want to display
               do {
                  System.out.println("Enter the Room Type number to display its info:");
                  System.out.println("1 - Standard Room");
                  System.out.println("2 - Double Room");
                  System.out.println("3 - Triple Room");
                  System.out.println("4 - King Size Room");
                  System.out.println("5 - Suite");
                  System.out.println("6 - View All Rooms info");
                  System.out.println("7 - Return to main menu");
                  roomInfoSelect = input.nextInt();

                  switch (roomInfoSelect) {
                     case 1:
                        // Standard Room
                        r[0].displayRoom();
                        backToMenu(input, back);
                        break;

                     case 2:
                        // Double Room
                        r[1].displayRoom();
                        backToMenu(input, back);
                        break;

                     case 3:
                        // Triple Room
                        r[2].displayRoom();
                        backToMenu(input, back);
                        break;

                     case 4:
                        // king size room
                        r[3].displayRoom();
                        backToMenu(input, back);
                        break;

                     case 5:
                        // Suite
                        r[4].displayRoom();
                        backToMenu(input, back);
                        break;

                     case 6:
                        // Display all Rooms
                        for (int i = 0; i < r.length; i++) {
                           r[i].displayRoom();
                        }
                        System.out.println();
                        backToMenu(input, back);
                        break;

                     case 7:
                        // this case is empty so the program doesn't go to default case when exiting
                        break;

                     default:
                        System.out.println("Invalid Room! \nTry Again.");
                        break;
                  }
               } while (roomInfoSelect != 7);

               break;

            case 3:
               // Restaurant
               Restaurant res[] = {
                  new Restaurant(),
                  new RoomService()
               };

               int option;
               System.out.println("Where you want to eat?");
               System.out.println("1 - In the Restaurant");
               System.out.println("2 - Room Service");
               option = input.nextInt();
               if (option == 1) {
                  res[0].order(input);
               } else {
                  res[1].order(input);
               }

               // to go back to the main menu
               backToMenu(input, back);

               break;

            case 4:
               // Checkout
               c.checkoutProcess(g[0].toStringGuestInformation(), g[1].toStringGuestReservation(), g[1].getRoomType(), input);
               
               // to go back to the main menu
               backToMenu(input, back);

               break;

            case 5:
               // To exit Program
               System.out.println("Exiting in process...");
               System.exit(0);
               break;

            default:
               // Invalid input
               System.out.println(operator + " is not a valid Menu Option! Please Select Another.");
               break;
         }
      } while (operator != 5);
      input.close();
   }

   // Method to pause the caude between function in the menu
   public static void backToMenu(Scanner input, int back) {
      System.out.println("Enter \"0\" to go back to the previous Menu.");
      do {
         back = input.nextInt();
         if (back != 0) {
            System.out.println("You have enter a number other than 0. Try Again!");
         }
      } while (back != 0);
   }
}
