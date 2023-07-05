package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer s = new StringBuffer(scanner.nextLine());
        boolean change;
        do {
            change = false;
            for (int i=2; i< s.length(); i++) {
                if (s.charAt(i-2) == s.charAt(i-1) && s.charAt(i-1) == s.charAt(i)) {
                    change = true;
                    s.delete(i-2, i+1);
                    System.out.println("-> "+s);
                }
            }
        } while(change);
    }
}