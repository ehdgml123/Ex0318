package Test;

import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

class Member{
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		         // name 을 hashCode() 반환 
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//  obj 와 member 인스턴스 인지 확인
	    if(obj instanceof Member target) {
	    	       
	    	return target.name.equals(name) && (target.age == age);
	    }else {
	    	return false;
	    }
	    
	}
}




public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));

		System.out.println("총 객체 수: "+ set.size());
	}

}
