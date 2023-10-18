import java.util.*;
class Roman {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a roman number");
        String s=scan.nextLine();
        romanToInt(s);
    }
    public static void romanToInt(String S) {
        int num1 = 0, num2 = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I':
                case 'i': num2 = 1; break;
                case 'V':
                case 'v': num2 = 5; break;
                case 'X':
                case 'x': num2 = 10; break;
                case 'L':
                case 'l': num2 = 50; break;
                case 'C':
                case 'c': num2 = 100; break;
                case 'D':
                case 'd': num2 = 500; break;
                case 'M':
                case 'm': num2 = 1000; break;
            }
            if (4 * num2 < num1) num1 -= num2;
            else num1 += num2;
        }
        System.out.println(num1);
    }
}