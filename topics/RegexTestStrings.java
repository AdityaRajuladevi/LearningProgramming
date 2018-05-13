package topics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestStrings {
	public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
//        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
//        System.out.println(splitString.length);// should be 14
//        for (String string : splitString) {
//            System.out.println(string);
//        }
//        // replace all whitespace with tabs
//        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
        
        stringDuplicate("Goodbye bye to bye world is world world");
	}
	
	public static void stringDuplicate(String input)
	{
        Pattern p= Pattern.compile("\\b(\\w+)(\\W+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        
        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
            System.out.println(m.group()+" -- "+m.group(1));
            
        }
        
        // Prints the modified sentence.
        System.out.println(input);
	}

}
