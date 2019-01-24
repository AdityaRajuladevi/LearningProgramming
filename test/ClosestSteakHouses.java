import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClosestSteakHouses
 */
public class ClosestSteakHouses {

    public static void main(String[] args) {
        int totalSteakhouses=3;
        List<List<Integer>> allLocations =new ArrayList<List<Integer>> ();
        for (int i = 0; i < 3; i++) {
            List<Integer> lst= new ArrayList<>();
            
            if(i==0)
            {
                lst.add(1);
                lst.add(-3);
            }

            else if(i==1)
            {
                lst.add(1);
                lst.add(2);
            }
           else if(i==2)
            {
                lst.add(3);
                lst.add(4);
            }

            allLocations.add(lst);
        }
        //System.out.println(allLocations);
        int numSteakhouses =1;
       System.out.println("Answer: "+ nearestXsteakhouses(totalSteakhouses,allLocations,numSteakhouses));
       System.out.println("Answer 2 : "+ nearestXsteakhouses(6,prepareData(),3));
      
    }

    public static List<List<Integer>> nearestXsteakhouses(int totalSteakhouses, List<List<Integer>> allLocations, int numSteakhouses)
    {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Map<Double, List<List<Integer>>> map = new TreeMap<Double,List<List<Integer>>>();
        for (List<Integer> eachLocation : allLocations) {
            double distance = distanceFromOrigin(eachLocation.get(0), eachLocation.get(1));
           // System.out.println("Each Location "+ eachLocation+ " Distance from Origin "+ distanceFromOrigin(eachLocation.get(0), eachLocation.get(1)));
           if(map.containsKey(distance))
           {
               map.get(distance).add(eachLocation);
           }
           else{
               List<List<Integer>> keyLocations = new ArrayList<>();
               keyLocations.add(eachLocation);
               map.put(distance, keyLocations);
           }
        }
       // System.out.println(map);
        int x=0;
        boolean isDone =false;
        for(Map.Entry m:map.entrySet())
        {
            //System.out.println("Key "+ m.getKey() + " -- "+ m.getValue());
            List<List<Integer>> lst= m.getValue();
           // System.out.println("Value= "+ lst+ "-- "+ lst.get(0));
          
           for(List<Integer> t: lst)
           {
               if(x<numSteakhouses)
               {
                results.add(t);
                x++;
               } else 
               {
                   isDone =true;
                   break;
               }
           }
           if(isDone)
           break;
        }
        return results;
    }


    public static double distanceFromOrigin(int x, int y)
    {
        double distance = Math.pow(x,2) + Math.pow(y,2);
        return Math.sqrt(distance);
    }

    public static List<List<Integer>> prepareData()
    {
        List<List<Integer>> allLocations =new ArrayList<List<Integer>> ();
        for (int i = 0; i < 6; i++) {
            List<Integer> lst= new ArrayList<>();
            
            if(i==0)
            {
                lst.add(3);
                lst.add(6);
            }

            else if(i==1)
            {
                lst.add(2);
                lst.add(4);
            }
           else if(i==2)
            {
                lst.add(5);
                lst.add(3);
            }
            else if(i==3)
            {
                lst.add(2);
                lst.add(7);
            }
           else if(i==4)
            {
                lst.add(1);
                lst.add(8);
            }
            else if(i==5)
            {
                lst.add(7);
                lst.add(9);
            }
           else if(i==2)
            {
                lst.add(3);
                lst.add(4);
            }

            allLocations.add(lst);
        }
        return allLocations;
    }

}