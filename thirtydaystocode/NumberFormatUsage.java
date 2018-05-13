package thirtydaystocode;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class NumberFormatUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//        String k="anagram";
//        
//        String l="marganaa";
//       //System.out.println(k.substring(0,3));
//       char[] arr= k.toCharArray();
//       Arrays.sort(arr);
//       
//       System.out.println(Arrays.toString(arr));
//       
//       String s="Hi how are you?";
//       String[] arr1= s.split(" ");
//       System.out.println(""+arr1.length);
//      
//       //for(Character c: k.toCharArray())
//    	   		
//       s.trim();
//       StringTokenizer st = new StringTokenizer(s,("[_@!?.', ]"));
//         int x = st.countTokens();
//         System.out.println(x);
//         while(st.hasMoreTokens()){
//             System.out.println(st.nextToken());
//         }
       int k=0;
         String numString="148";
         for(int i=0;i<numString.length();i++)
         {
             k+=Integer.parseInt(numString.substring(i,i+1));
         }
         System.out.println(k);
//        Locale indiaLocale = new Locale("en", "IN");
//
//        /* Create NumberFormats using Locales */
//        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
//        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
	}

}
