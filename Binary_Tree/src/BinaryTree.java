import java.util.Stack;

public class BinaryTree {
private Node root;

public BinaryTree(Node root) {
	super();
	this.root = root;
}

public BinaryTree() {
	root=null;
}

public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode == null) {
		return false;
	}
	if(root == null) {
		root=newNode;
		return true;
	}
	
	Node temp=root;
	while(true) {
		if(data == temp.getData()) {
			return false;
		}
		
		if(data< temp.getData()) {
			if(temp.getLeft() == null) {
				temp.setLeft(newNode);
				return true;
			}
			temp=temp.getLeft();

		}else {
			if(temp.getRight() ==null) {
				temp.setRight(newNode);
				return true;
			}
			temp=temp.getRight();
		}		
	}
}

public void preorder() {
	Node temp=root;
	Stack<Node> stack=new Stack();
	while(temp!=null || !stack.empty()) {
		while(temp!=null) {
			System.out.println(temp.getData()+"");
			stack.push(temp);
			temp=temp.getLeft();
		}
		temp=stack.pop().getRight();
	}
	System.out.println();
}

public void inorder() {
	Node temp=root;
	Stack<Node>stack =new Stack();
	while(temp!=null || !stack.empty()) {
		while(temp !=null) {
			stack.push(temp);
			temp=temp.getLeft();
		}
		temp=stack.pop();
		System.out.println(temp.getData()+"");
		temp=temp.getRight();
	}
	System.out.println();
}



public void postorder() {
	class Pair{
		Node node;
		char flag;
		public Pair(Node node, char flag) {
			this.node = node;
			this.flag = flag;
		}
		}
		Stack<Pair> stack=new Stack<>();
		Node temp=root;
		
		while(temp!= null || stack.empty()) {
			stack.push(new Pair(temp,'L'));
			temp=temp.getLeft();
		}
		Pair p=stack.pop();
		if(p.flag== 'L') {
			temp=p.node.getRight();
			p.flag='R';
			stack.push(p);		
	}
		else {
		System.out.println(p.node.getData()+"");
		}
		System.out.println();
}














}
