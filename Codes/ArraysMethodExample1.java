import java.util.Arrays;
class ArraysMethodExample1{
public static void main(String[] args){
int[] arr={80,60,30,50};
System.out.println("original Array:");
System.out.println(arr);
System.out.println(Arrays.toString(arr));
int index=Arrays.binarySearch(arr,30);
System.out.println("index of 30:"+ index);
int[] arr2={10,20,30,40};
boolean isEqual= Arrays.equals(arr, arr2);
System.out.println("both arrays are equal:"+isEqual);
int[] arr3= new int[5];
Arrays.fill(arr3,7);
System.out.println("filled arrays");
System.out.println(Arrays.toString(arr3));
}
}