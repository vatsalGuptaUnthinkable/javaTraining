import java.util.*;
public class solutionTwo {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = ob.nextInt();
        System.out.println("Enter Length of array");
        int num = ob.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < num ; i++){
            int number = ob.nextInt();
            list.add(number);
        }
        List<Integer> twoSum= Sum(list,target);
        System.out.println(twoSum);
       

        ob.close();

    }

    public static List<Integer> Sum(List<Integer> nums, int target) {
        Map<Integer,Integer> hs = new HashMap<>();
         int counter =0 ;
          List<Integer> arr = new ArrayList<>();
          for(int i = 0 ; i < nums.size() ;i++){
              if(hs.containsKey(target - nums.get(i))){
                  arr.add(i);
                  arr.add(hs.get(target - nums.get(i)));
                  break;
              }else{
                  hs.put(nums.get(i),i);
              }
          }
          return arr;   
      }
  
}
