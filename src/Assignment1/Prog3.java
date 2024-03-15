package Assignment1;
import java.util.*;
import java.lang.String;
public class Prog3 {
    public static void main(String[] args) {
        String[] str1 = {"horse", "dog", "cat", "horse", "dog"};
        String[] items = removeDups(str1);
        System.out.println(Arrays.toString(items));

    }

    static String[] removeDups(String[] inputString){
        String[] Arr = new String[0];
        for(int i = 0; i < inputString.length; i++){
            if(!hasItem(Arr, inputString[i])){
                //increase the size of the array
                String[] newSet = new String[Arr.length + 1];
                System.arraycopy(Arr, 0, newSet, 0, Arr.length);
                newSet[Arr.length] = inputString[i];
                Arr = newSet;
            }
        }
        return Arr;
    }

    static boolean hasItem(String[] arr, String item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null && arr[i].equals(item)){
                return true;
            }
        }
        return false;
    }
}
