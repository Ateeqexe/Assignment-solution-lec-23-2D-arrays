import javax.swing.*;
import java.util.*;
class Solution {
    //Q1  find the given element in a matrix and return its row and column.
    void Answer1(int[][] mat, int x) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("row: " + i);
                    System.out.println("column: " + j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }

    //Q2 convert a 1D a sorted Array of size n8m into a 2D Sorted Array of n rows and m columns.
    void Answer2(int[] arr, int n, int m) {
        int k = 0;
        int ansmat[][] = new int[n][m];
        Arrays.sort(arr);
        for (int i = 0; i < ansmat.length; i++) {
            for (int j = 0; j < ansmat[i].length; j++) {
                ansmat[i][j] = arr[k];
                k++;
            }
        }
        printmatrix(ansmat);
    }
//Q3 calculate the sum of the elements of a given matrix for the given range of row and columns.
    void Answer3(int [][]mat,int str,int enr,int stc,int enc){
        int sum=0;
        for(int i=str;i<=enr;i++){
            for(int j=stc;j<=enc;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println("the sum in given range is "+sum);
    }
    // Q4 REVERSE EACH ROW OF A MATRIX
    void Answer4(int [][]mat) {
        for (int i = 0; i < mat.length; i++) {
                      Reverse(mat[i]);
        }
        printmatrix(mat);
    }

        void Reverse(int[]arr) {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
            void printmatrix(int mat[][]) {
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of rows and columns");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //for Q1
       /* System.out.println("Enter the no. to be searched");
        int x=sc.nextInt();*/
        // for Q2
        /*System.out.println("enter the value of n and m");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[]=new int[n*m];
        System.out.println("enter "+(n*m)+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }*/
        //For Q3
       /* System.out.println("enter the start and end range of rows and columns");
        int str=sc.nextInt();
        int enr=sc.nextInt();
        int stc=sc.nextInt();
        int enc=sc.nextInt();*/
        Solution obj = new Solution();
        //obj.Answer1(mat,x);
        //obj.Answer2(arr,n,m);
       //obj.Answer3(mat,str,enr,stc,enc);
        obj.Answer4(mat);
    }
}