package assignment1;

public class stackLL {
	static class Node{
		int data;
		Node link;
	}
	Node top;
	stackLL(){
		this.top=null;
	}
	public void push(int x) {
		Node temp=new Node();
		temp.data=x;
		temp.link=top;
		top=temp;
	}
	public int pop() {
		int p=top.data;
		top=top.link;
		return p;
	}
	public void peek() {
		System.out.println(top.data+" is top");
	}
	public void display() {
		if(top==null) {
			System.out.println("empty");
		}
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.link;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		stackLL a=new stackLL();
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
		a.display();
		a.peek();
		a.pop();
		a.pop();
		a.display();
		a.peek();
	}

}
