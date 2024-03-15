package Assignment1;
import java.util.Arrays;

/*
Create a class Prog5 and implement the given method which takes the two arrays of inputs
and combine the two arrays into single array.
public int[] combine(int[] a, int[] b);
Example: Input array a : [5,6,-4,3,1]
Input array b: [ 3,8,9,11]
Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
 */
public class Prog5 {
    public static void main(String[] args){
        int[] a = {5,6,-4,3,1};
        int [] b = {3,8,9,11};
        int [] output = combine(a,b);
        System.out.println(Arrays.toString(output));
    }

    static public int[] combine(int[] a, int[] b){
        int [] output = new int[a.length+b.length];
        System.arraycopy(a,0,output,0,a.length);
        System.arraycopy(b,0,output,a.length,b.length);
        return output;
    }
}
