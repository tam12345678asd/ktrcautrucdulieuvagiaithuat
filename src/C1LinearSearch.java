public class C1LinearSearch {

//     LinearSearch(a, x)
//     n ← length(a)

//     FOR i ← 0 TO n - 1 DO
//         IF a[i] = x THEN
//             RETURN i
//         END IF
//     END FOR

//     RETURN -1
// END ALGORITHM
    

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; // Trả về vị trí tìm thấy
            }
        }
        return -1; // Không tìm thấy
    }
}