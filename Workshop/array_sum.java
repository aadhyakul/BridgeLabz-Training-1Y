import java.util.Scanner;
class array_sum{
public static void main (String[] args){
int sum=0;
Scanner sc=new Scanner(System.in);
int size= sc.nextInt();
int[] arr= new int[size];
for (int i=0; i<size;i++){
arr[i]=sc.nextInt();
}
for (int i:arr){
sum+=i;
}
System.out.println(sum);
}
}