package assignment1;

public class LL {
	Node head;
	static class Node{	
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static LL create(LL list,int data) {
		Node x=new Node(data);
		Node temp=list.head;
		if(list.head==null) {
			list.head=x;
			x.next=null;
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=x;
			x.next=null;
		}
		return list;
	}
	public static void print(LL list) {
		Node temp=list.head;
		if(temp==null) {
			System.out.println("empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}
	static void insBeg(LL list,int data) {
		Node p=new Node(data);
		if(list.head==null) {
			list.head=p;
		}
		else {
			p.next=list.head;
			list.head=p;
		}
	}
	static void insEnd(LL list,int data) {
		Node p=new Node(data);
		Node temp=list.head;
		if(list.head==null) {
			list.head=p;
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=p;
		}		
	}
	static int count(LL list) {
		Node temp=list.head;
		int c=0;
		if(list.head==null) {
			return c;
		}
		else {
			while(temp!=null) {
				c++;
				temp=temp.next;
			}
			return c;
		}
		
	}
	static void insAny(LL list,int data,int pos) {
		Node p=new Node(data);
		Node prev=list.head;
		Node cur=list.head.next;
		int c=count(list);
		if(pos==1) {
			insBeg(list,p.data);
		}
		if(pos<1) {
			System.out.println("invalid");
		}
		else if(pos>c) {
			System.out.println("invalid");p.next=list.head;
			list.head=p;
			
		}
		else {
			for(int i=2;i<pos;i++) {
				prev=prev.next;
			
			}
			cur=prev.next;
			prev.next=p;
			p.next=cur;
		}		
	}
   

	
	public static void main(String[] args) {
		LL list=new LL();
		list=create(list, 1);
		list=create(list, 2);
		list=create(list, 3);
		list=create(list, 4);
		list=create(list, 5);
		print(list);
		insBeg(list,6);
		print(list);
		insEnd(list,7);
		print(list);
		int c=count(list);
		System.out.println(c);
		insAny(list,8,1);
		print(list);
		

	}

}
