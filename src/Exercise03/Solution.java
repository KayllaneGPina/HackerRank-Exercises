package Exercise03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }

    /* Flags
    * - : Justifica à esquerda
    * 15 : é o tamanho do campo
    * s : caracteres de conversão (String)
    * 0 : força os valores a seres preenchidos com zeros
    * 3 : tamanho do campo
    * d : caracteres de conversão (int)
    * n : pula uma linha
    * */
}
