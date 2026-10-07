public class C2BubbleSort{
//  BubbleSort(a)
//     n ← length(a)

//     FOR i ← 0 TO n - 2 DO
//         FOR j ← 0 TO n - i - 2 DO

//             IF a[j] > a[j + 1] THEN
//                 temp ← a[j]
//                 a[j] ← a[j + 1]
//                 a[j + 1] ← temp
//             END IF

//         END FOR

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
}
