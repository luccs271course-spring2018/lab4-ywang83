class Node<E> {
  public E data;
public Node<E> next;
  public Node(final E data, final Node<E> next) { 
 if (data == null) throw new IllegalArgumentException("data is null");
this.data = data; 
this.next = next; 
}
public Node(final E data) { this(data, null); }
public String toString() { 
return "Node@" + hashCode() + "(" + data + (next != null ? ", Node@" + next.hashCode() + ")" : ")"); 
}
}
 /save -history myhistory.jsh
/save -history myhistory.jsh
List<String> myList = new LinkedList<>();
Node<String> = new Node<String> ("hello");
new Node<String> ("hello");
new Node<String> ("Cindy");
new Node<String> ("what");
new Node<String> ("up");
System.out.println(myList);
Node<String> node1  = new Node<String> ("hello");
$3.next=$4;
$4.next=$5
$5.next=$6;
myList.add($3);

 LinkedList<Node<String>> list = new LinkedList<Node<String>>();

list.add(new Node<String>("hello"));
list.add(new Node<String>("Cindy"));
list.add(new Node<String>("!"));
list.add(new Node<String>("what"));
list.add(new Node<String>(" "));
list.add(new Node<String>("up"));
System.out.println(list);
/save -history myhistory.jsh
