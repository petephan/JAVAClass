// Exercises 3.13 Template: Invoice.java
// Invoice class.\
// Peter Phan 9/14/2014

public class Invoice 
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;
   private double total;

   // four-argument constructor
   public Invoice( String part, String description, int count, double price )
   {
      partNumber = part;
      partDescription = description;
      quantity = count;
      pricePerItem = price;
	  
   } // end four-argument Invoice constructor

   // set part number
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } // end method setPartNumber

   // get part number
   public String getPartNumber()
   {
      return partNumber;
   } // end method getPartNumber

   
      // set part description
   public void setPartDescription( String description )
   {
      partDescription = description; 
   } // end method setPartDescription

   // get part Description
   public String getPartDescription()
   {
      return partDescription;
   } // end method getPartDescription
   
   
     // set Quantity
   public void setQuantity( int count )
   {
      quantity = count;
   } // end method setQuantity

   // get Quantity
   public int getQuantity()
   {
      return quantity;
   } // end method getQuantity
   
   
   // set PricePerItem
   public void setPricePerItem( double price )
   {
      pricePerItem = price;
   } // end method setPricePerItem

   // get PricePerItem
   public double getPricePerItem()
   {
      return pricePerItem;
   } // end method getPricePerItem

   

   // get InvoiceAmount
   public double getInvoiceAmount()
   {
      if ( quantity > 0 ) 
        if ( pricePerItem > 0.0 ) 
          total = pricePerItem * quantity;

      return total;
   } // end method getInvoiceAmount
   

   } // end class Invoice
