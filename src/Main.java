import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int[] arr = new int[n];
        int iteration = arr[0];
        int max = arr[0], min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            iteration = Math.max(arr[i], iteration);
            if(arr[i] < iteration) {
                result = -1;
                break;
            }else {
                result = max - min;
            }
        }
        System.out.println(result);
    }
}