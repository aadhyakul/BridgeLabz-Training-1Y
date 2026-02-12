import java.util.Scanner;
class userInputarray{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:");
int n=sc.nextInt();
int []arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
}
}