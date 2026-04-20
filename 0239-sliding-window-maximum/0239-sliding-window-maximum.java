class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;


        //initialize the dequeu and result arrray
        //deque store indices not value;

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n-k+1];

        //step 2 Setup deque for the first K elements


        for( int i = 0; i<k; i++){

            //remove all smaller elements from the back
            while(!deque.isEmpty() && nums[deque.peekLast()]<= nums[i]){

                deque.pollLast();

            }
            deque.offerLast(i);

        }

        //the front of the deque is the max of the first window
        result[0] = nums[deque.peekFirst()];

        // step 3  process the remaining elements;

        for ( int i = k; i<n; i++){
            
            //remove the element that has slid out of  the window

            if(deque.peekFirst() <=i-k) {
                deque.pollFirst();
            }

            //remove all the elements smaller than the incoming elemnet

            while(!deque.isEmpty() && nums[deque.peekLast()]<= nums[i] ){
                deque.pollLast();

            }

            //add current elemnent index;
            deque.offerLast(i);

            //the front of the dequeu is always the max of the window
            result[i-k+1] = nums[deque.peekFirst()];
        }

        return result;
    }
}