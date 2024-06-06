import java.util.*;
public class Largest1 {
    public static int Getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,11,12};
        System.out.println("largest value is"+Getlargest(numbers));
    }
}
