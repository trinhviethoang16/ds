package array;

public class Main {

	public static void main(String[] args) {
		DynamicArray<String> dynamicArray = new DynamicArray<>();
		dynamicArray.add("H");
		dynamicArray.add("o");
		dynamicArray.add("a");
		dynamicArray.add("n");
		dynamicArray.add("g");
		System.out.println(dynamicArray.toString());
		System.out.println(dynamicArray.get(2));
		System.out.println(dynamicArray.indexOf("g"));
		dynamicArray.remove("o");
		System.out.println(dynamicArray.toString());
	}

}
