import java.util.*;
public class Z12_2DArrayList {

	public static void main(String[] args) {
		
		
		//2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Cake");
		bakeryList.add("Choclates");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("Peppers");
		produceList.add("Coconut");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("Coke");
		drinksList.add("Soda");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//System.out.println(groceryList);
		//System.out.println(groceryList.get(0).get(2));
		
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
		}

	}

}
