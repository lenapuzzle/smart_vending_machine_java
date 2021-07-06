
import java.util.Scanner;

  public class SmartVendingMachine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello, I'm the first and only Talking Vending Machine. \n"
        + "What would you like today?");
    String userInput = scanner.next();

    System.out.println("How many of those would you like?");
    String userQuantity = scanner.next();
    try {
      int quantity = Integer.parseInt(userQuantity);
      if (quantity == 0) {
        System.out.println(
            "You selected an item, but not a quantity. Please come back when you can decide on both");
      } else {
        System.out.println("Thank you, here are your " + quantity + " " + userInput);
      }
      System.out.println("There you go! Come again!");
    } catch (NumberFormatException e) {
      System.out.println("Please enter a valid number, not a text");
    }
  }
}