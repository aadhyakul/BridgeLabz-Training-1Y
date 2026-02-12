import java.util.StringTokenizer;
public class demo1 {
public static void main(String[] args) {
String str = "Java is easy";
StringTokenizer st = new StringTokenizer(str);
while(st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}