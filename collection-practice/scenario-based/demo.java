import java.util.*;
public class demo {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		int ans = a / b;
//		System.out.println(ans);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		ArrayList<Integer> unique = new ArrayList<>(set);
		System.out.println(unique);
	}
}
