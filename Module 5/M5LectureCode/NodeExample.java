import java.util.Arrays;

public class NodeExample {

	public static void main(String[] args) {
		// midterm
		// LList<String> strList = new LList();
		// strList.insertAfterEvery("Hello", "There");
		// System.out.println(Arrays.toString(strList.toArray()));
		// strList.add("Hello");
		// strList.insertAfterEvery("Hello", "There");
		// System.out.println(Arrays.toString(strList.toArray()));
		// strList.add("Brian");
		// strList.add("How");
		// strList.add("Hello");
		// strList.add("Are");
		// strList.add("Hello");
		// strList.add("Hello");
		// strList.add("You");
		// strList.add("Hello");
		// System.out.println(Arrays.toString(strList.toArray()));
		// strList.insertAfterEvery("Hello", "Hello");
		// System.out.println(Arrays.toString(strList.toArray()));


		// Node<Integer> node1 = new Node<>(10, null);
		// Node<Integer> node2 = new Node<>(9, node1);
		// Node<Integer> node3 = new Node<>(10, node2);
		// Node<Integer> node4 = new Node<>(9, node3);
		// Node<Integer> node5 = new Node<>(12, node4);
		// Node<Integer> node6 = new Node<>(3, node5);
		// Node<Integer> node7 = new Node<>(9, node6);
		// Node<Integer> node8 = new Node<>(10, node7);
		// Node<Integer> node9 = new Node<>(9, node8);
		// Node<Integer> node10 = new Node<>(7, node9);
		// Node<Integer> node11 = new Node<>(7, node10);
		// Node<Integer> node12 = new Node<>(10, node11);

		// System.out.println("9: " + countMatches(node12, 9));
		// System.out.println("10: " + countMatches(node12, 10));
		// System.out.println("7: " + countMatches(node12, 7));
		// System.out.println("3: " + countMatches(node12, 3));
		// System.out.println("7 NULL: " + countMatches(null, 7));
		// System.out.println("1 SINGLETON: " + countMatches(node1, 10));

		// test
		Node<Integer> node1 = new Node<>(4, null);
		Node<Integer> node2 = new Node<>(2, node1);
		Node<Integer> node3 = new Node<>(1, node2);
		mystery(node3); // prints 141

		// Student s1 = new Student("Alison", "A123");
		// Student s2 = new Student("Barb", "B691");
		// Student s3 = new Student("Carl", "C208");
		// Student s4 = new Student("Dannie", "D810");
		// Student s5 = new Student("Earl", "E890");


		// Node<Student> node1 = new Node<>(s1, null);
		// Node<Student> node2 = new Node<>(s2, node1);
		// Node<Student> node3 = new Node<>(s3, node2);
		// Node<Student> node4 = new Node<>(s4, node3);



		// // creates chain s4 -> s3 -> s2 -> s1
		// // s4 is our head/firstNode
		// // s1 is our tail/lastNode

		// System.out.println("Head of the chain: " + node4.data); // or node1.getData();
		// System.out.println("Second in the chain: " + node3.data);

		// Node<Student> firstNode = new Node<>(s4,
		// 			new Node<>(s3,
		// 					new Node<>(s2,
		// 							new Node<>(s1, null) )));
		// // creates chain s4 -> s3 -> s2 -> s1 -> null
		// // without named node references (more realistic)

		// System.out.println("Head of the chain: " + firstNode.data);
		// System.out.println("Second in the chain: " + firstNode.next.data);
		// System.out.println("Third in the chain: " + firstNode.next.next.data);
		// System.out.println("Fourth in the chain: " + firstNode.next.next.next.data);
		// //System.out.println("Fifth in the chain: " + firstNode.next.next.next.next.data);
		// // null pointer exception
		// System.out.println("Fifth in the chain: " + firstNode.next.next.next.next);

		// if(firstNode.next.next.next.next==null) {
		// 	System.out.println("There is no fifth in the chain!");
		// }

		// // swap (second node) Carl with Earl
		// firstNode.next.data = s5;
		// System.out.println("Second in the chain: " + firstNode.next.data);
		// // list is now s4 -> s5 -> s2 -> s1

		// printRoster(firstNode); // works (no crashing) for empty list
		// printRoster(new Node<Student>(s1)); // works (no crashing) for singleton list


		// hard-coded examples of adding/inserting
		// i am NOT doing the error checking for empty, singleton
		// you WOULD NEED TO DO THIS! when using nodes to implement an actual data structure
		// Node<Student> head = new Node<Student>(s1);
		// Node<Student> newNode = new Node<Student>(s2);
		// // adds a new node to the end of a 1-element list
		// head.next = newNode;

		// // adds a new node to the end of a >1 element list
		// newNode = new Node<Student>(s3);
		// Node<Student> lastNode = head;
		// while(lastNode.next!=null) {
		// 	lastNode = lastNode.next;
		// }
		// lastNode.next = newNode;

		// printRoster(head); // print Alison Barb Carl

		// // adds a new node in between Barb and Carl
		// newNode = new Node<Student>(s4);
		// int positionToInsert = 3;
		// int nodeBeforePosition = 2;
		// Node<Student> nodeBefore = head;
		// for(int i=0; i<nodeBeforePosition-1; i++) {
		// 	nodeBefore = nodeBefore.next;
		// }
		// newNode.next = nodeBefore.next; // dannie.next refers to barb's.next, which is carl
		// nodeBefore.next = newNode; // barb's.next refers to dannie

		// printRoster(head); // print Alison Barb Dabbie Carl

		// // removal examples
		// // these are hard-coded so they do not have error checking for empty and singleton
		// // in a real setting, you WOULD NEED TO DO THIS!

		// // removing from beginning
		// head = head.next;

		// printRoster(head); // print Barb Dannie Carl

		// // removing from middle- dannie
		// int nodeToRemovePosition = 2; // barb 1, dannie 2
		// nodeBeforePosition = 1;
		// nodeBefore = head;
		// for(int i=0; i<nodeBeforePosition-1; i++) {
		// 	nodeBefore = nodeBefore.next;
		// }

		// nodeBefore.next = nodeBefore.next.next;

		// printRoster(head); // print Barb Carl


		// // remove from end- carl
		// nodeToRemovePosition = 2; // barb 1, carl 2
		// nodeBeforePosition = 1;
		// nodeBefore = head;
		// for(int i=0; i<nodeBeforePosition-1; i++) {
		// 	nodeBefore = nodeBefore.next;
		// }

		// nodeBefore.next = nodeBefore.next.next;

		// printRoster(head); // print Barb

	}

	public static void printRoster(Node<Student> head) {
		Node<Student> current = head;

		while(current!=null) {
			Student currentStudent = current.data;
			//if(currentStudent.getStudentID().startsWith("A")) {
			// an example of a conditional to only process some elements

			System.out.println(currentStudent);
			current = current.next;
		}

	}

	public static void mystery(Node node) {
		if(node!=null && node.next!=null) {
      System.out.print(node.data);
      mystery(node.next.next);
      System.out.print(node.data);
   } else if(node!=null) {
      System.out.print(node.data);
   }
	}

	public static int countMatches(Node<Integer> node, Integer number) {
		if (node == null) {
			return 0;
		} else {
			boolean check = node.data.equals(number);
			return check ? 1 + countMatches(node.next, number) : countMatches(node.next, number);
		}
	}









}
