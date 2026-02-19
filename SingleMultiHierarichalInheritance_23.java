//WAP on Single,multi,hierchical inheritance

//Single  A->B,  Multi A->B->C , Hierarichal  X
//                                          /Y  \Z
package assignments;

class Parent {

	public void showParent() {
		System.out.println("This is Single level inheritance Parent class");
	}
}

class Child extends Parent {
	public void showChild() {
		System.out.println("This is Single level inheritance Child class");

	}
}

// Multi level Inheritance
class A {
	void showSuperClass() {
		System.out.println("This is Multi level inheritance Super class");
	}
}

class B extends A {
	void showParentClass() {
		System.out.println("This is Multi level inheritance Parent class");
	}
}

class C extends B {
	void showChildClass() {
		System.out.println("This is Multi level inheritance Child class");
	}
}

// Hierarichal Level Inheritance
class X {
	void showX() {
		System.out.println("This is Hierarichal level inheritance Super class");
	}
}

class Y extends X {
	void showY() {
		System.out.println("This is Hierarichal level inheritance Child1 class");
	}
}

class Z extends X {
	void showZ() {
		System.out.println("This is Hierarichal level inheritance Child2 class");
	}
}

public class SingleMultiHierarichalInheritance_23 {
	public static void main(String[] args) {
		System.out.println("Single level level inheritance ....................");
		Child obj = new Child();
		obj.showParent();
		obj.showChild();

		System.out.println("Multi level level inheritance .........................");
		C obj1 = new C();
		obj1.showParentClass();
		obj1.showSuperClass();
		obj1.showChildClass();

		System.out.println("Hierarichal level level inheritance ...........................................................");
		Y obj2 = new Y();
		obj2.showX();
		obj2.showY();

		Z obj3 = new Z();
		obj3.showX();
		obj3.showZ();

	}

}
