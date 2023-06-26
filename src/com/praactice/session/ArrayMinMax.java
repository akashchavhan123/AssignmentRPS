package com.praactice.session;

public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[] = {400,35,4,5};
        int value=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>value){
                System.out.println(value+"is maximum");
            }
            else {
                System.out.println("minimum");
            }
        }
    }
}
