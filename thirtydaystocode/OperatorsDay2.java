package LearningProgramming.thirtydaystocode;

import java.util.Scanner;

public class OperatorsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double totalCost = meal_cost+(meal_cost * tip_percent/100.0)+(meal_cost * tax_percent/100.0);
        System.out.printf("The total meal cost is %d dollars.",Math.round(totalCost));
	}

}
