package test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer s = new StringBuffer(scanner.nextLine());
        boolean change;
        char c;
        do {
            change = false;
            for (int i=2; i< s.length(); i++) {
                if (s.charAt(i-2) == s.charAt(i-1) && s.charAt(i-1) == s.charAt(i)) {
                    change = true;
                    c = s.charAt(i);
                    if (c != 'a') {
                        s.setCharAt(i - 2, (char)(c-1));
                    }
                    s.delete(i-1-(c == 'a'?1:0), i+1);
                    System.out.println("-> "+s+(c == 'a'?"":", "+c+c+c+" is replaced by "+ (char)(c-1)));
                }
            }
        } while(change);
    }
}
