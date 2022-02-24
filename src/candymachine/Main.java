package candymachine;
import java.util.*;

public class Main {
	public static void main(String []args) {
		
	 	
		displayProduct displayProductObject = new displayProduct();
		displayProductObject.showProduct();
		
		productSelect productSelectObject= new productSelect();
		productSelectObject.showCost();		
	}
}
