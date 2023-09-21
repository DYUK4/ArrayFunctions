import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];

        Random rand = new Random(0);
        for(int i = 0; i < n; i++){
            arr[i]= rand.nextInt(100);
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i < n; i++){

            for(int j = i+1; j < n; j++){

                if(arr[j]< arr[i]){
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+"\t");
        }

    }
}