
import java.util.Scanner;
public class InvoiceTest {
public static void main(String[] args) {        
    int quantity;
    double price;
    double invoiceAmount;       
    Invoice invoice1 = new Invoice("1234","Hammer",10, 400);     
    Scanner keyboard = new Scanner (System.in);     
    System.out.printf( "Part number: %s\n", invoice1.getPartNumber());
    System.out.printf( "Part Description: %s\n", invoice1.getPartDescription());
    System.out.printf( "Quantity: %s\n", invoice1.getQuantity());
    System.out.printf( "Price: %s\n", invoice1.getPrice());
 }
}