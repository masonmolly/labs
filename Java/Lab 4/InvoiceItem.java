public class InvoiceItem {
	
int id; /* int variable to hold item id */
String description; /* String variable to hold item description */
int quantity; /* int variable to hold item quantity */
double unitPrice; /* double variable to hold the price of the item */
static int counter = 0; /* counter to hold amount of items there are, defaults at 0, only changes by +1 when new InvoiceItem() is made */

InvoiceItem() { /* default constructor, no arguments, thus all variables within default at 0 or null */
	counter++; /* increases counter by 1 each new item */
	id = 0;
	description = "";
	quantity = 0;
	unitPrice = 0;
}

public int getId() { /* getId() method returns item id */
	return id;
}

public String getDescription() { /* getDescription() method returns item description */
	return description;
}

public int getQuantity() { /* getQuantity() method returns item quantity */
	return quantity;
}
	
public double getUnitPrice() { /* getUnitPrice() method returns item price */
	return unitPrice;
}

void setQuantity(int newQuantity) { /* setQuantity() sets quantity variable as argument newQuantity, allows user to set item quantity */
	quantity = newQuantity;
}

void setUnitPrice(double newUnitPrice) { /* setUnitPrice() sets unitPrice variable as argument newUnitPrice, allows user to set item price */
	unitPrice = newUnitPrice;
}

public String toString() { /* toString() method returns InvoiceItem details as a string */
	return "InvoiceItem[id=" + id + ", description=" + description + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
}

	public static void main(String[] args) { /* InvoiceItem testing in main method */
		InvoiceItem item = new InvoiceItem(); /* creates new InvoiceItem at 'item' */
		System.out.println(item.toString()); /* tests that default constructor and toString() method works */
		item.setQuantity(10); /* tests setQuantity() works, setting quantity to 10 */
		item.setUnitPrice(10.5); /* tests setUnitPrice() works, setting price to 10.5 */
		System.out.println(item.toString()); /* prints item details as string to show updated values */
	}

}
