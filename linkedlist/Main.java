package linkedlist;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add("Trinh");
		dll.add("Viet");
		dll.add("Hoang");
		System.out.println(dll.toString());
		dll.addFirst("first");
		dll.addLast("last");
		System.out.println(dll.toString());
		System.out.println(dll.contains("Hoang"));
		System.out.println(dll.indexOf("Viet"));
		dll.removeAt(2);
		System.out.println(dll.toString());
	}

}
