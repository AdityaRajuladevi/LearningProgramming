package LearningProgramming.topics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagsValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="<h1><h1><h2>Sanjay has no</h2><h5> watch </h5></h1></h1><par>So wait for a while</par>";
		String regex="<(\\w+)>(.+)<\\/(\\1)>";
		Pattern pattern = Pattern.compile(regex);
		
		validateTag(inp,pattern);
		//val(regex);

	}

	
	/*static String validateTag(String input, Pattern p)
	{
		Matcher m= p.matcher(input);
		
		if(m.find() == false)
			return input;
		else
		{
			m.reset();
			
			//if(!recursiveCheck( m.group(2), p))
			if(m.find() && m.group(2) !=null)
			{	
				
				return validateTag(m.group(2),p);
				
			}
			else {
				System.out.println(m.group(2));		
				return "";
			}
		}
	}*/
	static void validateTag(String input, Pattern p)
	{
		Matcher m= p.matcher(input);
		if(m.find())
		{
			m.reset();
			while(m.find())
			{
				//if(!recursiveCheck( m.group(2), p))
					//recursiveprint(m.group(2),p);
				recursiveCheck(m.group(2), p);
			}
		}
		else
		{
			System.out.println("None");
		}
		
	}
	private static String recursiveprint(String input, Pattern p) {
		// TODO Auto-generated method stub
		Matcher m= p.matcher(input);
		
		if (!m.find()) {
			if (input.contains("<")) {
			
				System.out.println("Invalid");
				
			}
			else 
				System.out.println(input);
			return null;
		}
		else
		{
			//m.reset();
			if( m.group(2)!=null){
				return recursiveprint(m.group(2),p);
			}
			
		}
		return null;
	}


	static void val(String in)
	{
        
        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(in);

        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if ( ! matchFound) {
            System.out.println("None");
        }
	}
	
	static String recursiveCheck(String grp, Pattern p)
	{
		//System.out.println("Entered : "+grp);
		Matcher  mg= p.matcher(grp);
		if(!mg.find())
		{
			System.out.println(grp);
			return "";
		}
		else
		{
			mg.reset();
			while(mg.find())
			{
				 recursiveCheck(mg.group(2),p);
			}
		}
		
		return "";
			
	}
}
