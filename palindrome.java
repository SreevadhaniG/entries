import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length() == 0){
            System.out.println("True");
        }
        else{
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if(str.equals(sb.toString())){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}
