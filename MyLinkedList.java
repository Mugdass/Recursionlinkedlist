/*******************
Name: Matas Backevicius

Date: May 19, 2021

Notes: This is a list that prints int value in a given oder,
 and then once the method ir reversed it prints same values
 Node head,list, but in a REVERSE-order
 
*******************/ 



class MyLinkedList {       /* decalred given class */

static Node head;          /* static because it will return the head*/

static class Node {           /* define the static class*/

int data;               /* the variable or the data will be int not String*/
Node next;
                     /* every int d will be a next int value followed by next */
Node(int d) {
data = d;
next = null;
}
}

/* Function to reverse the linked list */
Node reverse(Node node) {
   
   Node prev = null;          /* so the funciton is node */
   Node current = node;       /* to reverse both prev int and next int must be null*/
   Node next = null;          /* assign current node to node*/
                /* meaning the number after the current number is the next number*/
  while (current != null) {
   next = current.next;
   current.next = prev;
   prev = current;            /* next number will be the next number after current */
   current = next;               /* but the current number must be prev number */
   
}           /* this is to reverse the previous order by calling onto the method node*/
               /* evey preious number that was next will be the reverse*/
node = prev;      /* meaning like the number 2 that was next, now is second last */
return node;
}         /* so from first to the next number in a list 
               the number is now the opposite */
               
               /*so now not first number is 1, but 12, and next nubber is not 2, but 11 */

// prints content of double linked list
void printList(Node node) {
while (node != null) {



System.out.println("animal in Chinese Zodiac");
System.out.println("\n" + "Nr. " + "" + node.data);
node = node.next;             
}
}                       /* this is the right oder WITHOUT the REVERSE*/
                              /* we need this order in order to REVERSE it after */
public static void main(String[] args) {
MyLinkedList list = new MyLinkedList();
list.head = new Node(1);
list.head.next = new Node(2);
list.head.next.next = new Node(3);
list.head.next.next.next = new Node(4);
list.head.next.next.next.next = new Node(5);
list.head.next.next.next.next.next = new Node(6);
list.head.next.next.next.next.next.next = new Node(7);
list.head.next.next.next.next.next.next.next = new Node(8);
list.head.next.next.next.next.next.next.next.next = new Node(9);
list.head.next.next.next.next.next.next.next.next.next = new Node(10);
list.head.next.next.next.next.next.next.next.next.next.next = new Node(11);
list.head.next.next.next.next.next.next.next.next.next.next.next = new Node(12);

 /*as you can see every next is called upon ,is the next int number after next */
/*starting from 1,2,3.. */

System.out.println();

System.out.println("           " + "Hello there!");

System.out.println();
System.out.println("Here is the");
System.out.println();
System.out.println(" >>> 'Linked list' " + "\n");
System.out.println("of");
System.out.println();
System.out.println("<<< 12 Chinese Zodiacs>>>");
System.out.println();
System.out.println("in order");
System.out.println();
list.printList(head);     /* because it's a list with a head,
                         it's like aheading printed before 
                              the full list is printed */
System.out.println();
head = list.reverse(head);       /* now assign a revered list to variable 'head' */
System.out.println();
System.out.println("This is a FULL list of ANIMAL names in Chinese Zodiac: ");
System.out.println( "\n" + "Nr. 1 " + "\n" + " >>> Shu (Rat)" + "\n" +
 "Nr. 2 " + "\n" + " >>> Niu (Ox)" + "\n" + "Nr. 3 " + "\n" + 
" >>> Hu (Tiger)" + "\n" + "Nr. 4 " + "\n" + " >>> Tu (Rabbit)" + "\n" + "Nr. 5"
 + "\n" + " >>> Long (Dragon)" + "\n" + "Nr. 6" + "\n" + " >>> She (Snake)" + 
 "\n" + "Nr. 7" + "\n" + " >>> Ma (Horse)" + "\n" + "Nr. 8" + "\n" + 
 " >>> Yang (Goat)" + "\n" + "Nr. 9" + "\n" + " >>> Hou (Monkey) " +
  "\n" + "Nr. 10" + "\n" + " >>> Ji (Rooster) " + "\n" + "Nr. 11 " + 
  "\n" + " >>> Gou (Dog) " + "\n" + "\n" + 
  " and the last animal in Chinese Zodiac is " + "\n" + "\n" + "Nr. 12 " + 
  "\n" + " >>> Zhu (Pig) ");
 
 /*statement printed after the list is printed */
 
 
System.out.println();
System.out.println("This was the full list of all 12 animals");
System.out.println();
System.out.println();
System.out.println("Now if we REVERSED this full LIST");
System.out.println();
System.out.println("\n" + "Here is how it would look: ");
System.out.println("\n" + ">>>" + "\n");
list.printList(head);        /* call upon a a variable 
                              named 'head' that will reverse the list*/
System.out.println();
System.out.println();
System.out.println("and this is how the REVERSED name list would look: ");
System.out.println();      
System.out.println("\n" + "Nr. 12 " + 
  "\n" + " >>> Zhu (Pig) " + "\n" + "Nr. 11 " + 
  "\n" + " >>> Gou (Dog) "+ "\n" + "Nr. 10" + "\n" +
   " >>> Ji (Rooster) " + "\n" + "Nr. 9" + "\n" + " >>> Hou (Monkey) " +
 "\n" + "Nr. 8" + "\n" + " >>> Yang (Goat)" + "\n" + "Nr. 7" + "\n" +
" >>> Ma (Horse)" + "\n" + "Nr. 6" + "\n" + " >>> She (Snake)" + "\n" + "Nr. 5"
 + "\n" + " >>> Long (Dragon)" + "\n" + "Nr. 4 " + "\n" + " >>> Tu (Rabbit)" + 
"\n" + "Nr. 3 " + "\n" + " >>> Hu (Tiger)" + "\n" + "Nr. 2 " + "\n" + " >>> Niu (Ox)" +
"\n" + "Nr. 1 " + "\n" + " >>> Shu (Rat)");  
    
    
    
/* once the prior list is reverse,
 then print this big statement 
listing the names in a different order now like in a reversed list*/
    
System.out.println();
System.out.println();
System.out.println();    
      
System.out.println("         " + "That was all for today.");
System.out.println();
System.out.println("                    " + "Thank you.");
System.out.println();
System.out.println("                           " + "Goodbye!.");


   }                       /* pirnt spacing in between the lines */
                           /* print goodbye statement */

}                          /* the end */