import java.util.Arrays;

public class Hashing_32_Lamps_Ilumination {
    public static void main(String[] args) {
        int arr[][] = {{1,7},{5,11},{7,9}};
        int points[] = {7,1,5,10,9,15};
        int ans[] = help(arr,points);
        System.out.print(Arrays.toString(ans));
    }

    private static int[] help(int[][] arr, int[] points) {
        int marked[] = new int[10001];
        for(int i=0;i<arr.length;i++){
            marked[arr[i][0]] += 1;
            marked[arr[i][1]+1] -= 1; 
        }
        for(int i=1;i<marked.length;i++){
            marked[i] += marked[i-1];
        }
        int ans[] = new int[points.length];
        for(int i=0;i<points.length;i++){
            ans[i] = marked[points[i]];
        }
        return ans;
    }
}
