// Exercises 3.13 Template: InvoiceTest.java
// Application to test class Invoice.
// Peter Phan 9/14/2014

import java.util.Scanner;

public class InvoiceTest
{
   public static void main( String[] args )
   {
      Invoice invoice1 = new Invoice("1234","Hammer",2,14.95); // create Invoice object
      Invoice invoice2 = new Invoice("5678","PaintBrush",0,0.00); // create Invoice object
      
      
      // display initial balance of each object
      System.out.println( "Original invoice information" );
      System.out.printf( "Part number: %s\n", invoice1.getPartNumber() );
      System.out.printf( "Description: %s\n", invoice1.getPartDescription() );
      System.out.printf( "Quantity: %d\n", invoice1.getQuantity() );
      System.out.printf( "Price: $%.2f\n", invoice1.getPricePerItem() );
      System.out.printf( "Invoice amount: $%.2f\n", invoice1.getInvoiceAmount() );

      
      Scanner input = new Scanner( System.in );
      
      String partNum;
      String partDesc;
      int qty;
      double price;
      double invoiceAmt = 0;
      
      
      //obtain user input
      System.out.print( "\nEnter part number: " ); // prompt 
      partNum = input.nextLine();
      invoice1.setPartNumber( partNum );
      
      System.out.print( "Enter part description: " );
      partDesc = input.nextLine();
      invoice1.setPartDescription( partDesc );
      
      System.out.print( "Enter quantity: " );
      qty = input.nextInt();
      invoice1.setQuantity( qty );
      
      System.out.print( "Enter price: " );
      price = input.nextDouble();
      invoice1.setPricePerItem( price );
      
      System.out.println( "\nUpdated invoice information" );
      System.out.printf( "Part number: %s\n", invoice1.getPartNumber() );
      System.out.printf( "Description: %s\n", invoice1.getPartDescription() );
      System.out.printf( "Quantity: %d\n", invoice1.getQuantity() );
      System.out.printf( "Price: $%.2f\n", invoice1.getPricePerItem() );
      System.out.printf( "Invoice amount: $%.2f\n", invoice1.getInvoiceAmount() );
      
      
      //invoice2   
      System.out.println( "\nOriginal invoice information" );
      System.out.printf( "Part number: %s\n", invoice2.getPartNumber() );
      System.out.printf( "Description: %s\n", invoice2.getPartDescription() );
      System.out.printf( "Quantity: %d\n", invoice2.getQuantity() );
      System.out.printf( "Price: $%.2f\n", invoice2.getPricePerItem() );
      System.out.printf( "Invoice amount: $%.2f\n", invoice2.getInvoiceAmount() );

      System.out.print( "\nEnter part number: " ); // prompt 
      partNum = input.next();
      invoice2.setPartNumber( partNum );
      
      System.out.print( "Enter part description: " );
      partDesc = input.next();
      invoice2.setPartDescription( partDesc );
      
      System.out.print( "Enter quantity: " );
      qty = input.nextInt();
      invoice2.setQuantity( qty );
      
      System.out.print( "Enter price: " );
      price = input.nextDouble();
      invoice2.setPricePerItem( price );
      
      System.out.println( "\nUpdated invoice information" );
      System.out.printf( "Part number: %s\n", invoice2.getPartNumber() );
      System.out.printf( "Description: %s\n", invoice2.getPartDescription() );
      System.out.printf( "Quantity: %d\n", invoice2.getQuantity() );
      System.out.printf( "Price: $%.2f\n", invoice2.getPricePerItem() );
      System.out.printf( "Invoice amount: $%.2f\n", invoice2.getInvoiceAmount() );
	  
   } // end main
} // end class InvoiceTest

