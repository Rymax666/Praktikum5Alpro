package Praktikum;
/*
 * Rymax666
 * Fuck Everyone Else!
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        System.out.print("Masukkan String : ");
        String KAMUSEGALANYAA = scan.next();


        for (int i = 0; i < KAMUSEGALANYAA.length(); i++){
            bt.NewData(KAMUSEGALANYAA.charAt(i));
        }

        bt.printInOrder();
        bt.printPreOrder();
        bt.printPostOrder();

        System.out.println();

        bt.printInOrderAscii();
        bt.printPostOrderAscii();
        bt.printPreOrderAscii();
    }
}
