
public class LinkedList {
private Node head;
private int count;



public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public LinkedList() {
head = null;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}

public boolean insert(int data) {
	Node newNode =new Node(data);
	if(newNode == null) {
		return false;
	}
	if(head==null) {
		head=newNode;
		return true;
	}
	Node temp=head;
	while(temp.getNext()!=null) {
		temp=temp.getNext();
		if(temp.getData()== data) {
			return false;
		}
	}
	temp.setNext(newNode);
	return true;	
}

public void display() {
	Node temp=head;
	while(temp!=null) {
	 System.out.println(temp.getData()+"");
	 temp=temp.getNext();
	}
	System.out.println();
}

public void insertAtFirstPos(int data, int pos) {
    Node newNode = new Node(data);
    newNode.setNext(head);
    head=newNode;    
}
public boolean insertAtSpecificPos(int data,int pos) {
	Node newNode=new Node(data);
	if(newNode== null) {
		return false;
	}
	Node prev=head;
	for(int i=1;i<pos-1;i++) {
		prev=prev.getNext();
	}
	newNode.setNext(prev.getNext());
	prev.setNext(newNode);
	return true;
}

public boolean insertAtSpecificPosByVal(int data) {
    Node newNode = new Node(data);
    if (head == null || head.getData() >= newNode.getData()) {
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    Node prev = head;
   
    while (prev.getNext() != null && prev.getNext().getData() < newNode.getData()) {
        prev = prev.getNext();
    }

    newNode.setNext(prev.getNext());
    prev.setNext(newNode);
    return true;
}

public void deleteByPos(int pos) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (pos < 0) {
        System.out.println("Invalid position");
        return;
    }
    if (pos == 0) {
        head = head.getNext();
        return;
    }
    Node cur = head;
    Node prev = null;
    int curPos = 0;

    while (cur != null && curPos < pos) {
        prev = cur;
        cur = cur.getNext();
        curPos++;
    }
    if (cur == null) {
        System.out.println("Position out of bounds");
        return;
    }
    prev.setNext(cur.getNext());
}


public void deleteByVal(int val) {
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
if(head.getData()==val) {
	head=head.getNext();
	return;
}
Node cur=head;
Node prev=null;
while(cur!=null && cur.getData()!=val) {
	prev=cur;
	cur=cur.getNext();
}
if(cur==null) {
	System.out.println("value not found");
	return;
}
prev.setNext(cur.getNext());
}

public int count() {
	int count=0;
	Node c=head;
	while(c!=null) {
		c=c.getNext();
		count++;
	}
	return count;
}

public void removeDuplicates() {
    Node c = head;
    while (c != null) {
        Node r = c;
        while (r.getNext() != null) {
            if (r.getNext().getData() == c.getData()) {
                r.setNext(r.getNext().getNext());
               
            } else {
                r = r.getNext();
            }
        }
        c = c.getNext();
    }
}




public void sort() {
	if(head== null || head.getNext() == null) {
		return;
	}
	Node cur=head;
	while(cur!=null) {
		Node index=cur.getNext();
		while(index!=null) {
			if(cur.getData()>index.getData()) {
				int temp=cur.getData();
				cur.setData(index.getData());
				index.setData(temp);
			}
			index=index.getNext();
		}
		cur=cur.getNext();
	}
}

public void sortDesc() {
	if(head==null ||head.getNext()== null) {
		return;
	}
	Node cur=head;
	while(cur!=null) {
		Node index=cur.getNext();
		while(index!=null) {
			if(cur.getData() < index.getData()) {
				int temp=cur.getData();
				cur.setData(index.getData());
				index.setData(temp);
			}
			index=index.getNext();
		}
		cur=cur.getNext();
	}
}

public void max() {
    sortDesc();
    Node first=head;
    System.out.println(first.getData());
    
}

public void min() {
	sort();
	Node temp=head;
System.out.println(temp.getData());
	
}
}

