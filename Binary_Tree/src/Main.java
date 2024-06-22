
public class Main {

	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		
		b.insert(50);
		b.insert(60);
		b.insert(4);
		b.insert(100);
		b.insert(65);
		b.inorder();
		b.preorder();
		b.postorder();

	}

}
