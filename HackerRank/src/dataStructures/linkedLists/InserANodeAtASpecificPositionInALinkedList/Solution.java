package dataStructures.linkedLists.InserANodeAtASpecificPositionInALinkedList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

// Complete the insertNodeAtPosition function below.
    
    /*
     * solution without verifying any given data
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    	/*
    	 * first get size of the linked list --> should be a method of linked list in a real world application
    	 */
    	int size = 0;
    	if(head != null) {
    		SinglyLinkedListNode currNode = head;
    		size = 1;
    		while(currNode.next != null) {
    			currNode = currNode.next;
    			size++;
    		}
    	}
    	
    	/*
    	 * check if the provided list is not to short
    	 */
    	if(size < position) {
    		throw new IllegalArgumentException("The list is to short!");
    	}
    	else {
    		/*
    		 * Case 1: The list is empty
    		 */
    		if(size == 0) {
    			System.out.println("Case 1");
    			head = new SinglyLinkedListNode(data);
    		}
    		/*
    		 * Case 2: The list contains only one node.
    		 * 	a) add new node as head
    		 * 	b) add new node as tail
    		 */
    		else if(size == 1) {
    			System.out.println("Case 2");
    			if(position == 0) {
    				System.out.println("Option a)");
    				SinglyLinkedListNode tail = head;
    				head = new SinglyLinkedListNode(data);
    				head.next = tail;
    			}
    			else {
    				System.out.println("Option b)");
    				SinglyLinkedListNode tail = new SinglyLinkedListNode(data);
    				head.next = tail;    				
    			}
    		}
    		/*
    		 * Case 3: The list contains two or more nodes
    		 * 	a) add new node as head
    		 * 	b) add new node as tail
    		 *  c) add new node in the middle
    		 */
    		else {
    			System.out.println("Case 3");
    			if(position == 0) {
    				System.out.println("Option a)");
    				SinglyLinkedListNode oldHead = head;
    				head = new SinglyLinkedListNode(data);
    				head.next = oldHead;
    			}
    			else if(position == size) {
    				System.out.println("Option b)");
    				SinglyLinkedListNode currNode = head;
    				SinglyLinkedListNode prevNode = null;
    				while(currNode.next != null) {
    					prevNode = currNode;
    					currNode = currNode.next;
    				}
    				SinglyLinkedListNode tail = new SinglyLinkedListNode(data);
    				prevNode.next = tail;
    			}
    			else {
    				System.out.println("Option c)");
    				SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    				SinglyLinkedListNode currNode = head;
    				SinglyLinkedListNode prevNode = null, nextNode = null;
    				int currPos = 0;
    				while(currNode.next != null && position < currPos) {
    					prevNode = currNode;
    					currNode = currNode.next;
    					nextNode = currNode.next;
    					currPos++;
    				}
    				prevNode.next = newNode;
    				newNode.next = nextNode;
    			}
    		}
    	}
    	
    	return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
