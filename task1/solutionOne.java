import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class solutionOne {
    public static void main(String[] args)
    {
        
        System.out.println(" Enter word" );
        Scanner ob = new Scanner (System.in);
        String name = ob.nextLine();
        System.out.println(nonRepeat(name));
        ob.close();
    }
    
    public static Character nonRepeat(String name)
    {
        Map<Character,Integer>  charTb = new LinkedHashMap<Character ,Integer>();
        int length = name.length();
        
          
        for (int i=0;i < length;i++)
        {
            
            if(charTb.containsKey(name.charAt(i)))
            {
                charTb.put(  name.charAt(i) ,  charTb.get(name.charAt(i)) +1 );
            }
            else
            {
                charTb.put( name.charAt(i) , 1 ) ;
            }
        }
        for(Entry<Character,Integer> entry: charTb.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}    