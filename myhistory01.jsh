class Node<E> {
public E data;
public Node<E> next;
public Node(final E data, final Node<E> next) { 
if (data == null) throw new IllegalArgumentException("data is null");
this.data = data; 
this.data = data; 
}
public Node(final E data) { this(data, null); }
public String toString() { 
return "Node@" + hashCode() + "(" + data + (next != null ? ", Node@" + next.hashCode() + ")" : ")"); 
}
}

Node<String> hello = new Node<String> ("hello");
Node<String> cindy = new Node<String> ("Cindy");
Node<String> what = new Node<String> ("what");
Node<String> up = new Node<String> ("up");
hello.next=cindy;
cindy.next=what
what.next=up;
LinkedList<Node<String>> list = new LinkedList<Node<String>>();
list.add(hello);
list.add(cindy)
list.add(what)
list.add(up)
System.out.println(list)
/save -history myhistory.jsh
