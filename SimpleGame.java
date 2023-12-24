
public class SimpleGame
{
    public String convertTime(int seconds)
    {
        int h , m , s ;
        double op;
        if(seconds > 23*3600 + 59*60 + 59)
        {
            return "Invalide Seconds";
        }   
        op = seconds/3600;
        h = (int) op;
        
        seconds -= h*3600;
        
        op = seconds/60;
        m = (int)op;

        seconds -= m*60;

        s = seconds;

        return h+":"+m+":"+s;
        
    }
    public int digitsSum(int input)
    {
        int s = 0 ;
        while(input > 0)
        {
            s+= input%10;
            input /=10;
        }
        return s;
    } 


    public static void main(String[] args)
    {
        SimpleGame simplegame = new SimpleGame();
        System.out.println(simplegame.convertTime(8000));
        System.out.println("Sum of 12345 = "+ simplegame.digitsSum(12345));
    }
}