import java.util.Scanner;
class ContinueWithSwitch {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 3:
                    continue; 
            }
            System.out.println(i);
        }
    }
}