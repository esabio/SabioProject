/*
// Emma Sabio
// Project 1 Code Selection 
// 2/19/21
// Implementing algorithms and timing solutions 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SabioProject;
import java.util.*;
/**
 *
 * @author S538226
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static final int iters = 100;
    public static void main(String[] args) {
        
        
        // TODO code application logic 
        System.out.println(time(insertionSort));
        
       
        
        
        
        
    }   
        //insertion 
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int current_index = array[i];
            int x = i-1;
            while(x >= 0 && current_index < array[x]){
                array[x + 1] = array[x];
                x--;
            }
            array[x + 1] = current_index;
        }    
        
    }   
        
        
        
        
        //quicksort
    public static int divide(int[] array, int initial, int last){
        int num = last;
        int count = initial;
        for (int i = initial; i < last; i++){
            if(array[i] < array[num]){
                int x = array[count];
                array[count] = array[i];
                array[i] = x;
                count++;
            }
        }
        int x = array[num];
        array[num] = array[count];
        array[count] = x;
        
        //return count
        return count;
      
    }
    //
    public static void quickSort(int[] array, int initial, int last){
        if (last <= initial);
        int num = divide(array, initial, last);
        quickSort(array, initial, num - 1);
        quickSort(array, num + 1, last);
        
    }
        
    
    
        //quickSelect
    public static int halve(int [] array, int initial, int last){
        int num = array[last];
        int num_index = initial;
        for (int i = initial; i <= last; i++){
            if (array[i] < num){
                int x = array[i];
                array[i] = array[num_index];
                array[num_index] = x;
                num_index ++;
            }
            
        }
       int x = array[last];
       array[last] = array[num_index];
       array[num_index] = x;
       return num_index;
    }
    
    public static int quickSelect(int [] array, int initial, int last, int num){
        int halve = halve(array, initial, last);
        if(halve == num -1){
            return array[halve];
        }
        if(halve < num -1){
            return quickSelect(array, halve +1, last, num);
        }
        else{
            return quickSelect(array, initial, halve -1, num);
        }
    }
    //timing 
    public static float time(int [] array){
        long total = 0;
        long start, end;
        for (int i = 0; i < iters; i++){
            start = System.nanoTime();
            array[i] = 0;
            end = System.nanoTime();
            total += (end-start);
            //array[i].; remove
        }
        return total/(float)iters;
    }
    }
    
        
