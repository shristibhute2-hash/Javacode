//WAP on super keyword

package assignments;

class JavaParent {

	final void login() {
		System.out.println("Login using Email id");
	}
}

public class SuperKeyword_50 extends JavaParent {
	void loginMob() {
		System.out.println("Login using mobileno");
		super.login();// keyword

	}

	public static void main(String[] args) {
		SuperKeyword_50 m1 = new SuperKeyword_50();
		m1.login();

	}

}
