import java.util.Scanner;
/**
 * asks user for amount spent, tell the user their discount, then tell the user their new price
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get the user's input
    Scanner input = new Scanner(System.in);
    
    //initialize variables
    double startPrice; //the initial price given by the user
    double discountAmount; //the amount that will be taken off the initial price
    double finalPrice; //the discounted price

    //initialize constants
    // - - - discount % - - -
    final double DISCOUNT_10 = 0.10; //the number to multiply the initial price by to get a 10% discount
    final double DISCOUNT_20 = 0.20; //the number to multiply the initial price by to get a 20% discount
    final double DISCOUNT_30 = 0.30; //the number to multiply the initial price by to get a 30% discount
    final double DISCOUNT_40 = 0.40; //the number to multiply the initial price by to get a 40% discount
    // - - - discount condition prices  - - -
    final double PRICE_40 = 40.00; //price to check for lowest discount
    final double PRICE_80 = 80.00; //price to check for next lowest discount
    final double PRICE_120 = 120.00; //price to check for highest discount



    //ask user for starting price
    System.out.println("Please enter the amount the customer spent");
    startPrice = input.nextDouble(); //store it in the starting price variable

    // check discount amount for entered price
    if (startPrice > PRICE_120){ //if starting price is over $120.00
      System.out.println("They will receive 40% off."); //tell the user their discount is 40%

      discountAmount = startPrice * DISCOUNT_40; //multiply the starting price by the discount amount and store it in the discount variable
    }else if (startPrice > PRICE_80){ //if starting price is over $80.00
      System.out.println("They will receive 30% off."); //tell the user their discount is 30%

      discountAmount = startPrice * DISCOUNT_30; //multiply the starting price by the discount amount and store it in the discount variable
    }else if (startPrice > PRICE_40){ //if starting price is over $40.00
      System.out.println("They will receive 20% off."); //tell the user their discount is 20%

      discountAmount = startPrice * DISCOUNT_20; //multiply the starting price by the discount amount and store it in the discount variable
    }else{ //if starting price is less than $40.00
      System.out.println("They will receive 10% off."); //tell the user their discount is 10%

      discountAmount = startPrice * DISCOUNT_10; //multiply the starting price by the discount amount and store it in the discount variable
    }

    //subtract discount from the starting price to get final price
    finalPrice = startPrice - discountAmount;

    //tell the user results
    System.out.println("They will save $" + discountAmount + "."); //tell user the amount saved
    System.out.println("The new total is $" + finalPrice + "."); //tell user final price
  }
}
