package com.tsystems.javaschool.tasks.pyramid;

import java.util.List;
import java.util.Collections;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        // TODO : Implement your solution here
        // checking if the input is empty or contains null
       
		if (inputNumbers.isEmpty() || inputNumbers.contains(null)) {
			 throw new CannotBuildPyramidException(); }



        Collections.sort(inputNumbers);   
         int numberow=numberRow(inputNumbers);

         if (numberow==-1) throw new CannotBuildPyramidException();

         int numberCol = 2 * numberow - 1;



 int[][] pyramid = new int[numberow][numberCol];

 // building the pyramid
 int posicionNumber = 0;
 for (int i = 0; i < pyramid.length; i++) {
     int TopNumber = numberow - i - 1;
     int countOfNumbers = i + 1;
     for (int j = TopNumber; countOfNumbers > 0; j = j + 2) {
         pyramid[i][j] = inputNumbers.get(posicionNumber);
         posicionNumber++;
         countOfNumbers--;
     }
 }
 return pyramid;

}

/**
 * @param input
 * @return
 */
private static int numberRow(List<Integer> input){
    
    int	Size = input.size();
		double resultsqr = (Math.sqrt(1+ 8 * Size) - 1)/2;
		if(resultsqr == Math.ceil(resultsqr)) return (int)resultsqr;
		
		return -1;
}




}
    }


}
