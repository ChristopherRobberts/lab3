import java.util.Arrays;

/**
 * Created by Chris on 2017-09-14.
 */
public class BubbleSort {

    public static void main(String[] args){
        int [] a = {8, 7, 5, 4, 2, 1, 7};
        int N = a.length;
        int R = N - 2;
        boolean swapped = true;
        System.out.println(Arrays.toString(a));

        while(R >= 0 && swapped){
            swapped = false;

            for(int i = 0; i < R; i++){
                if (a[i] > a[i + 1]){
                    swapped = true;
                    swap(a, a[i], a[i + 1]);
                }
            }
            R = R - 1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int [] a, int x, int y){
        //System.out.println(x + " " + y);
        int exchange = a[x];
        a[x] = a[y];
        a[y] = exchange;
    }
}
