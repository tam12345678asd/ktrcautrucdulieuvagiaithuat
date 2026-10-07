
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println();
            System.out.println("      BAI TAP THUAT TOAN");
            System.out.println("1. Tim kiem tuyen tinh (Linear Search)");
            System.out.println("2. Sap xep noi bot (Bubble Sort)");
            System.out.println("3. Tinh giai thua (De quy)");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    linearSearch(sc);
                    break;

                case 2:
                    bubbleSort(sc);
                    break;

                case 3:
                    factorial(sc);
                    break;
                case 0:
                    System.out.println("Da thoat .");
                    break;

                default:
                    System.out.println("khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }
    //bai 1//

    public static void linearSearch(Scanner sc) {

        System.out.println();
        System.out.println("CAU 1: LINEAR SEARCH");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri can tim: ");
        int x = sc.nextInt();

        int result = C1LinearSearch.linearSearch(a, x);

        if (result != -1) {
            System.out.println(
                    "Tim thay " + x + " tai vi tri " + (result + 1)
            );
        } else {
            System.out.println(
                    "Khong tim thay " + x + " trong mang."
            );
        }
    }


//bai 2//

    public static void bubbleSort(Scanner sc) {

        System.out.println();
        System.out.println("CAU 2: BUBBLE SORT ");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        C2BubbleSort.bubbleSort(a);

        System.out.println("Mang sau khi sap xep:");

        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

//bai3//
   
    public static void factorial(Scanner sc) {

        System.out.println();
        System.out.println("CAU 3: FACTORIAL");

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Khong the tinh giai thua so am.");
            return;
        }

        long result = C3Factorial.factorial(n);

        System.out.println(n + "! = " + result);
    }
}

    