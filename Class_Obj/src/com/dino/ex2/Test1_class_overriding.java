package com.dino.ex2;


public class Test1_class_overriding {
	public static void main(String[] args) {
	   //상위 클래스의 참조 변수는 하위 클래스의 인스턴스를 참조할 수 있다. 
       A a = new A();  
       A a1 = new B();
       A a2 = new C();
       System.out.println("----------");
       
       //그러나 반대는 성립되지 않는다.
       //하위 클래스의 참조 변수로상위 클래스의 인스턴스를 참조할 수는 없다.
       // B b = new A();
       B b1 = new B();
       B b2 = new C();
       System.out.println("----------");
       
       A a3 = new B();
       A a4 = new C();
       B b3 = (B)a3;  //a3 참조변수는 B클래스를 참조
       B b4 = (B)a4;  //a4 참조변수는 C클래스를 참조
    //  b3.fun1();
    //  b4.fun1();
       
       System.out.println("----------");
       System.out.println("메서드 오버라이딩");
       a1.fun1();
	}
}

class A {
	public void fun1() {
		System.out.println("fun1");
	}

	public void fun2() {
		System.out.println("fun2");
	}

	public void fun3() {
		System.out.println("fun3");
	}
}


class B extends A {
	// 메서드 오버라이딩(재정의)
    @Override
    public void fun1() {
        System.out.println("fun1-----재정의된 fun1"); // 클래스 B에서 fun1 메서드 오버라이딩
    }
    void method4() {
        System.out.println("fun4");
    }
    
    void method5() {
        System.out.println("fun5");
    }
}

class C extends B {
    void method6() {
        System.out.println("fun6");
    }
    
    void method7() {
        System.out.println("fun7");
    }
}

