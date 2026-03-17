import java.util.*;
class Product{
	String name;
	double price;
	int quantity;
	
	Product(String name,double price,int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	double totalValue(){
		return price * quantity; 
	}
	void display() {
	}
}
class Electronics extends Product{
	int warranty;
	Electronics(String name, double price, int quantity, int warranty) {
		super(name, price, quantity);
		this.warranty = warranty;
	}
	void display() {
		System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Warranty: "+warranty+" months");
	}
	
}
class Clothing extends Product{
	String size;
	Clothing(String name, double price, int quantity,String size) {
		super(name, price, quantity);
		this.size = size;
	}
	void display() {
		System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Size "+size);
	}
	
}
public class InventorySystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Product> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(",");
			if(arr[0].equals("Electronics")) {
				Electronics e = new Electronics(
						arr[1],
						Double.parseDouble(arr[2]),
						Integer.parseInt(arr[3]),
						Integer.parseInt(arr[4])
						);
				list.add(e);
				System.out.println("Product added to inventory: "+arr[1]);
			}
			else if(arr[0].equals("Clothing")) {
				Clothing c = new Clothing(
						arr[1],
						Double.parseDouble(arr[2]),
						Integer.parseInt(arr[3]),
						arr[4]
						);
				list.add(c);
				System.out.println("Product added to inventory: "+arr[1]);
			}
			
		}
		System.out.println("Inventory: ");
		double total = 0;
		for(Product p : list) {
			p.display();
			total += p.totalValue();
		}
		System.out.printf("Total value of the inventory: %.2f",total);
	}
}
