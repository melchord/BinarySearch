/**
 * Class which will hold the binary search algorithm and all logic related to
 * finding the target number in an array.
 * @author - Melchor Dominguez
 * @version 10 - 28 - 2019
 */
public class binSearch{
    
    /**
     * Function which will take in a sorted array of integers as well as a target 
     * integer. 
     * @param array - sorted array of integers
     * @param target - integer to find within the array
     * @return -1 - if number not found. 
     *         # - position where the number was found
     *          
     */
    public static int binarySearch(int[] array, int target){
        //start the binary search at the front and back of the array
        return binaryHelp(array, target, 0, array.length - 1);
    }
    
    /**
     * Helper function to step through the binary search algorithm
     * @param array - sorted array of integers
     * @param target - integer to find within the array
     * @param front - front end of the array to check between
     * @param back - back end of the array to check between
     * @return -1  -if number is not found.
     *          # - position where the number was found
     */
    public static int binaryHelp(int[] array, int target, int front, int back){
        if(front > back){
            return -1; //no value was ever found.
        }

        int mid = (front + back)/2; // find middle position in the array

        if(array[mid] < target){//middle value is less than the target value
            return binaryHelp(array, target, front + 1, back);
        }else if(array[mid] > target){//middle value is greater than target 
            return binaryHelp(array, target, front, back - 1);
        }
        return mid;//Niether greater than or less than, so it must be equal.
    }

}
