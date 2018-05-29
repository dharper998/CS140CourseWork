package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment08 {
	public static List<String> selectFrom(List<String> lst, char letter) {
		return lst.stream()
				.filter(e -> e.substring(0, 1).equalsIgnoreCase(letter + ""))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(selectFrom(new ArrayList<String>(Arrays.asList("Alpha", "beta", "Gamma", "Binghamton")), 'b'));
	}
}
