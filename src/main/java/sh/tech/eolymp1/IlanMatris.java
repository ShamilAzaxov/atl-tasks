package sh.tech.eolymp1;

public class IlanMatris{

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i<arr.length;i++){
            if (i%2==1){
                for (int j=arr.length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
