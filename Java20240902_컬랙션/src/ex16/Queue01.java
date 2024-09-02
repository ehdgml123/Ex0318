package ex16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Queue01 {

	public static void main(String[] args) {
		
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    Set<Integer> hs = new HashSet<>();
    Set<Integer> hs1 = new TreeSet<Integer>();
    List<Integer> qu1 = new Stack<>();    
    
    
    // Queue 는 인터페이스다 .따라서 객테 생서을 할 수 없다
    // Queue 사용하기 위햇는 를 Queue 구현하든가 아니면, 구현된 객체를 사용하면 된다. 
    Queue<Integer> qu = new LinkedList<Integer>();
    
    
    qu.offer(10);
    qu.offer(20);
    qu.offer(30);
    
    System.out.println(qu.poll());
    System.out.println(qu.poll());
    System.out.println(qu.poll());
    

	
	}       

}
