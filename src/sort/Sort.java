/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author dell
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] a = {1,5,3,2,7,4,6};
        s.insertionSort(a);
        s.prints(a);
    }
    
    public void bubbleSort(int[] a){
        if(a.length <= 1){
            return;
        }else{
            int max = a[0];
            for (int j = a.length-1; j >= 0; j--) {
                for (int i = 0; i < j; i++) {
                if(a[i+1] <a[i]){ 
                    int x = a[i];
                    a[i] = a[i+1];
                    a[i+1] = x;
                }
                if(a[i] > max){
                    max = a[i];
                }
            }
            }
        }
    }
    
    public void selectionSort(int[] a){
        if(a.length <= 1){
            return;
        }else{
            for (int i = a.length-1; i >= 0; i--) {
                int max = i;
                for (int j = 0; j < i; j++) {
                    if(a[j] > a[max]){
                        max = j;
                    }           
                }
                int x = a[i];
                a[i] = a[max];
                a[max] = x;
                
            }
        }
    }
    
    public void insertionSort(int[] a){
        if(a.length <= 1){
            return;
        }else{
            for (int i = 1; i < a.length; i++) {
                System.out.println(i);
                for(int k = i ; k>= 0; k--){
                    if(a[k] < a[k-1]){
                        int x = a[k];
                        a[k] = a[k-1];
                        a[k-1] = x;
                    }else{
                        break;
                    }
                }
            }
        }
    }
    
    
    public void prints(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    
}
