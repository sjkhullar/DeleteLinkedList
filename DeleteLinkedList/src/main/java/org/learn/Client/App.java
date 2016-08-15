package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.DeleteLinkedList;

public class App {
	public static void main(String[] args) {
		int[] data = { 9, 5, 2, 8, 10, 9, 1 };
		Node head = new Node(data[0]);
		for (int count = 1; count < data.length; count++)
			DeleteLinkedList.insert(head, data[count]);

		System.out.printf("Linked list is : ");
		DeleteLinkedList.print(head);

		head = DeleteLinkedList.delete(head);
		if (head == null) {
			System.out.println("Deleted all nodes in linked list");
		} else {
			System.out.println("Could not able to delete all nodes from linked list");
		}
	}
}