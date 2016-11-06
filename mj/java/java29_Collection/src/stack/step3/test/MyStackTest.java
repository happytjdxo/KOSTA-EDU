package stack.step3.test;

import java.util.EmptyStackException;
import java.util.Vector;

/*
 *  Stack의 기본적인 구조와
 *  데이타 추가, 삭제, 검색에 따른 기본적인 기능을 살펴볼수있는 로직
 *  push()	/ pop()	/ search()	/ empty()	/ peek()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
 */
class MyStack extends Vector{
	
	public Object push(Object item){
	
		//add(item);
		addElement(item);
		return item;
	}

	public Object peek(){	//Vector에 가장 윗부분의 있는 리턴되도록
		// Vector의 기능을 이용해서..
		//lastElement(), get(), elementAt()
		if(size()==0) throw new EmptyStackException();
		return elementAt(size()-1);	// 마지막 index
	}
	
	public Object pop(){
		// Vector의 기능을 이용해서 Vector에 가장 윗부분의 있는 예를 지우도록
		Object obj = peek();
		remove(obj);
		return obj;
	}
	
	public int search(Object obj){
		// Vector의 기능을 이용해서
		return indexOf(obj);
	}
	
	public boolean empty(){
		// 비었는지 여부..
		return size()==0;
	}
}

public class MyStackTest {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack.pop());	// D
		System.out.println(stack.pop());	// C

		System.out.println(stack.empty());	// false
		System.out.println(stack);	// A, B
		
		System.out.println(stack.peek());	// B
		System.out.println(stack.search("A"));	// 0
		
	}
}
