package random;
public abstract class InterfaceProblems implements sub
{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void based() {
		// TODO Auto-generated method stub
		
	}
	
}


interface base {
	void display();
	void based();
}

interface sub extends base{
	void display();
	void displaySub();
}