import java.util.Scanner;

public class reversestring {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    char[] s = str.toCharArray();

    int left = 0;
    int right = s.length - 1;

    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }

    System.out.println("Reversed String: " + new String(s));

    sc.close();
}

}
