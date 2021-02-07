import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FeaturedProducts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of quantity: ");
		int numberOfProducts = sc.nextInt();
		List<String> product = new ArrayList<String>();
		System.out.println("Enter the products:: ");
		for (int i = 0; i <= numberOfProducts; i++) {
				product.add(sc.nextLine());
		}
		sc.close();
		featured(product);
	}

	private static String featured(List<String> products) {
		List<String> result = new ArrayList<>();
		Collections.sort(products);
		for (int i = 0; i < products.size() - 1; i++) {
				if (products.get(i).equals(products.get(i+1))) {
					result.add(products.get(i+1));
			}
		}
		return result.get(result.size()-1);
	}
}
