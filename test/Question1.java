/**
 * Question1
 */
 class Question1 {

    public static void main(String[] args) {
        int x = 1534236469;
        String k= Integer.toString(x);
        System.out.println("k "+k);
        String rev = new StringBuilder().append(k).reverse().toString();
        System.out.println(" Rev-- " +rev);
        int r=0;
        if(x<0)
        {
            try{
            r=Integer.parseInt(rev.substring(0, rev.length()-1));
            r=r*-1;
            }
            catch(NumberFormatException e)
            {
                
            }
        }
        else
        {
            r=Integer.parseInt(rev);
        }
       
        System.out.println("Result-- "+r);
        
        
        System.out.println(Integer.parseInt("00231"));
        System.out.println("Int == "+ Integer.toString(Integer.MIN_VALUE));
    }
}
