package Interface;

interface A{
	int a=20;
	void m1();
}

public class Test implements A{
	
	public void m1() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test t = new Test();
  t.m1();
	}

}
