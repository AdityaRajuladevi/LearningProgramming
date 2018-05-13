package random;
public class RuntimePolymorphism {
	public static void main(String[] args)
	{
		Shape s1= new Circle();
		s1.draw();
		s1.show();
		
		Shape s2= new Square();
		s2.draw();
		s2.show();
	}
}


 class Shape {

	public void draw()
	{
		System.out.println("Drwaing Shape");
	}
	
	public void show()
	{
		System.out.println(" Show in shape class");
	}
}
 
 class Circle extends Shape{

		@Override
		public void draw(){
			System.out.println("Drwaing circle");
		}

	}
 
 
 class Square extends Shape{

		@Override
		public void draw(){
			System.out.println("Drwaing square");
		}

	}