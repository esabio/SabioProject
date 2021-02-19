/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S538226
 */
import org.junit.Test;
import SabioProject.Main.insertionSort;
import SabioProject.Main.quickSort;
import SabioProject.Main.quickSelect;


public class TestClass {
    @Test
    public void insertionSortTest(){
        int[] input = {1, 2, 4, 7, 3, 5};
        insertionSort(input);
                
    }
    @Test
    public void quicSortTest(){
        int[] input = {2, 6, 7, 3, 5};
        quickSort(input);
    }
    @Test
    public void quickSelectTest(){
        int [] input = {2, 6, 7, 8, 9};
        quickSelect(input);
    }
    
    
}
