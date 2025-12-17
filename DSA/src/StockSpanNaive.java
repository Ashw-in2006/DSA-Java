// import java.util.*;

// public class StockSpanNaive {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int span[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             span[i] = 1; 
//             for (int j = i - 1; j >= 0; j--) {
//                 if (arr[j] <= arr[i]) {
//                     span[i]++;
//                 } else {
//                     break; 
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(span[i] + " ");
//         }
//     }
// }


import java.util.*;
public class StockSpanNaive {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<=i;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }System.out.print(count+" ");
        }
    }  
}