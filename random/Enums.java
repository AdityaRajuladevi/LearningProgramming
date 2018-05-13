package random;
public class Enums {

	public enum PizzaStatus{
		ORDERED,
		READY,
		DELIVERED;
	}
	
	enum Direction {
	    NORTH,
	    SOUTH,
	    EAST,
	    WEST; //note semicolon needed only when extending behavior
	    
	    //overrides and additions go here, below the enum constants

	    @Override public String toString(){
	      return "Direction: " + name();
	    }
	    /** An added method.  */
	    public boolean isCold() {
	      //only NORTH is 'cold'
	      return  this == NORTH;
	    }
	  }

	enum ErrorCodes {
		DATA_RECEIVED(200),
		DATA_BLOCKED(404);
		
		private int error;
		ErrorCodes(int e)
		{
			this.error=e;
		}
		
		private int getErrorCode()
		{
			return this.error;
		}
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PizzaStatus.DELIVERED);
		System.out.println(Direction.EAST.isCold());
		
		ErrorCodes k= ErrorCodes.valueOf("DATA_BLOCKED");
		switch(k) {
		case DATA_BLOCKED:System.out.println("In Data Blocked ");
		break;
		case DATA_RECEIVED: System.out.println("In Data Received ");
		break;
		}
		System.out.println(k+" "+ k.getErrorCode());
	}

}
