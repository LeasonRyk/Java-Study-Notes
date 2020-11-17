/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

/**
 *
 * @author Leason Rykaart
 */
public class sorting {
    
    public static void main(String[] args) {
        int[] arr = {5,10,67,24,17,25,68,12,18,36,20,94,39} ;
        arr = selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
    
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
     public static int[] selectionSort(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
     }
            
        return arr;
}
    
   
}


