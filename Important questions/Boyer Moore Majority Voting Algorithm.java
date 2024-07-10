/*
	This algorithm works on the fact that if an element occurs more than N/2 times, it means that the remaining elements other than this would definitely be less than N/2. 
	So let us check the proceeding of the algorithm.

	First, choose a candidate from the given set of elements if it is the same as the candidate element, increase the votes. 
	Otherwise, decrease the votes if votes become 0, select another new element as the new candidate.
	Intuition Behind Working :
	When the elements are the same as the candidate element, votes are incremented whereas when some other element is found 
	(not equal to the candidate element), we decreased the count. This actually means that we are decreasing the priority of 
	winning ability of the selected candidate, since we know that if the candidate is in majority it occurs more than N/2 times
	and the remaining elements are less than N/2. We keep decreasing the votes since we found some different element(s) than the candidate element. 
	When votes become 0, this actually means that there are the equal  number of votes for different elements, which should not be the case for the element to be the 
	majority element. So the candidate element cannot be the majority and hence we choose the present element as the candidate and continue the same till all the elements
	get finished. The final candidate would be our majority element. We check using the 2nd traversal to see whether its count is greater than N/2. If it is true, 
	we consider it as the majority element.
 */

/* NOTE
	First for loop is to get the number with max number of occurences.
	Second for loop is used to confirm if that number occured more the N/2 times. 
 */

import java.io.*;

class BMmV{

// Function to find majority element
    public static int findMajority(int[] nums)
	{
		int count = 0, candidate = -1;

		// Finding majority candidate
		for (int index = 0; index < nums.length; index++) {
			if (count == 0) {
				candidate = nums[index];
				count = 1;
			}
			else {
				if (nums[index] == candidate)
				count++;
				else
				count--;
			}
		}

		// Checking if majority candidate occurs more than
		// n/2 times
		count = 0;
		for (int index = 0; index < nums.length; index++) {
		if (nums[index] == candidate)
			count++;
		}
		if (count > (nums.length / 2))
		return candidate;
		return -1;

		// The last for loop and the if statement step can
		// be skip if a majority element is confirmed to
		// be present in an array just return candidate
		// in that case
	}
// Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
        int majority = findMajority(arr);
        System.out.println(" The majority element is : " + majority);
    }
}
