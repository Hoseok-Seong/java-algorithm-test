package section8.q4;

// 가장 기초 방법
// public class Main {
//     public int recursive(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         else if (n == 2) {
//             return 1;
//         } 
//         else {
//             return recursive(n-1) + recursive(n-2);
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         Main m = new Main();

//         int n = 45;

//         for (int i=1; i<n+1; i++) {
//             System.out.print(m.recursive(i) + " ");
//         }
//     }
// }

// 배열에 저장하여 개선
// public class Main {
//     static int[] arr;

//     public int recursive(int n) {
//         if (n == 1) {
//             return arr[n] = 1;
//         }
//         else if (n == 2) {
//             return arr[n] = 1;
//         } 
//         else {
//             return arr[n] = recursive(n-1) + recursive(n-2);
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         Main m = new Main();

//         int n = 45;

//         arr = new int[n+1];

//         m.recursive(n);

//         for (int i=1; i<n+1; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// 메모이제이션
public class Main {
    static int[] arr;

    public int recursive(int n) {
        if (arr[n] > 0) return arr[n];

        if (n == 1) {
            return arr[n] = 1;
        }
        else if (n == 2) {
            return arr[n] = 1;
        } 
        else {
            return arr[n] = recursive(n-1) + recursive(n-2);
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();

        int n = 45;

        arr = new int[n+1];

        m.recursive(n);

        for (int i=1; i<n+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}