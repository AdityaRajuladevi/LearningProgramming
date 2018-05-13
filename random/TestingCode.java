package random;
public class TestingCode {

	static String abc="Default";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(abc);
		abc="def";
		B b= new B();
		b.display();
		
		A a = new A();
		a.display();
	
	}

}
	
	class A{
		int demo=5;
		void display()
		{
			System.out.println("In A's display"+ demo);
		}
	}
	
	class B extends A{
		int demo=1;
		void display()
		{
			System.out.println("In B's display "+ demo);
		}
	}
	

