import java.util.*;

public class ArrayChallenger {

    private ArrayChallenger(){}

    public static String arrayChallenge(Integer[] arr){
        StringBuilder result= new StringBuilder();
        for(int i=0;i<arr.length;i+=2){
            boolean flag=true;
            for(int j=arr.length-1;j>=0;j-=2){
                if (Objects.equals(arr[i], arr[j]) && Objects.equals(arr[i + 1], arr[j - 1]) && i != j -1) {
                    flag = false;
                    break;
                }
            }
            if(flag) result.append(arr[i]).append(" ").append(arr[i + 1]).append(" ");
        }
        result = new StringBuilder(result.toString().trim().replace(" ", ","));
        if(result.toString().equals("")) result = new StringBuilder("yes");
        return result.toString();
    }


}
