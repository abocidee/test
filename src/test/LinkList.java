package test;



public class LinkList<E> {

	
		private Node<E> first;
  
		 class Node<E> {
			 Node<E> next;
			 E element;
			 
			 public Node(E obj,Node<E> next) {
				 this.next=next;
				 this.element=obj;
			 }
		 }
		 
		 public void add(E e) {
			 if(first==null) {
				 first=new Node(e,null);
				 
				 return;
			 }
			 
			 Node<E> f=first;
			 Node<E> newNode=new Node(e, f);
			 first=newNode;
		 }
		 
		 public boolean contains(E e) {
			 if(first==null)
				 return false;
			 
			 return contains(e,first);
		 }
		 private boolean contains(E e, Node<E> first2) {
			if(first2==null)
				return false;
			if(first2.element.equals(e))
				return true;
			else
				return contains(e,first2.next);
		}

		public static void main(String[] args) {
				LinkList<Integer> linkList =new LinkList<Integer>();
				linkList.add(3);
				linkList.add(4);
				linkList.add(35);
				linkList.add(36);
				linkList.add(37);
				linkList.add(38);
				linkList.add(39);
				linkList.add(31);
				
				System.out.println(linkList.contains(31));
			}

}
