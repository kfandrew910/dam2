package ejerciciosLambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable test1 = () -> {};
		Supplier test2 = () -> "Raoul";
		Supplier test3 = () -> {return "Mario";};

		Predicate<List> test6 = (list) -> list.isEmpty();
		Supplier test7 = () -> new Integer(10);
		Consumer <Integer>test8 = (Integer a) -> {System.out.println(a.toString());};
		Function <String, Integer> test9 = (s) -> s.length();
		BiFunction <Integer, Integer, Integer> test10 = (a, b) -> a * b;
		//Comparator <String>test11 = (String a1, String a2) -> a1.length().compareTo(a2.length());
		
	}

}
