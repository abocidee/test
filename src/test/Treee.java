package test;



public class Treee<E> {
  private Node<E> root;
  
  public static void main(String[] args) {
	Treee<Integer> treee=new Treee<Integer>();
	treee.add(8);
	treee.add(9);
	treee.add(34);
	treee.add(78);
	treee.add(12);
	treee.add(45);
	treee.add(34);
	treee.add(7);
	treee.add(1);
	
	System.out.println(treee.contains(1));
	
}
  public void add(E e) {
	  if(root==null) {
		  root=new Node<E>(e,null,null);
		  return;
		  }
	  
	  Node<E> current=root;
	  Node<E> parent;
	  while(true) {
		  parent=current;
		  if(((Comparable)current.e).compareTo(e)<0) {
			 
			
			  current=current.left;
			  if(current==null) {
				  parent.left=new Node(e,null,null);
			  return;}
		  }else {
			  
			  current=current.right;

			  if(current==null) {
				  parent.right=new Node(e, null, null);
			  return;}
		  }
	  }
  }
  
  public boolean contains(E obj) {
	  if(obj.equals(root.e))
		  return true;
	  
	  return contains(obj,root);
	  
  }
  
  private boolean contains(E obj, Treee<E>.Node<E> root2) {
	  if(root2==null)
		  return false;
	 if(((Comparable)root2.e).compareTo(obj)==0) {
		 return true;
	 }
	 
	 if(((Comparable)root2.e).compareTo(obj)>0) {
		 return  contains(obj,root2.right);
	 }
	 else {
		return contains(obj,root2.left);
	 }
	
}

class Node<E>{
	  E e;
	  Node<E> left;
	  Node<E> right;
	 
	  public Node(E e,Node<E>left,Node<E> right){
		  this.e=e;
		  this.left=left;
		  this.right=right;
	  }
  }
}
