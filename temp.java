/*You are given an array of positive integers nums and want to erase a subarray containing unique elements. 
The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, 
that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

 

Example 1:

Input: nums = 5
4 2 4 5 6
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
*/
import java.util.*;
class temp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        int i=j;
        List<List<Integer>> mainls=new ArrayList<>();
        while(j<n){
            i=j;
            List<Integer> ls=new ArrayList<>();
            while(i<n){
                if(!ls.contains(arr[i])){
                    ls.add(arr[i]);
                    i++;
                }else{
                    mainls.add(ls);
                    //ls.clear();
                    i=n;
                }
            }
            j++;
        }
        System.out.println(mainls);
    }
}