package org.learn.Question;

import org.learn.List.Node;

public class DeleteLinkedList {

	public static Node delete(Node head) {
		Node backup = null;
		while (head != null) {
			backup = head.next;
			head = null;
			head = backup;
		}
		return head;
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
