/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/96/sorting-and-searching/774/
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion extends VersionControl{

    public int findFirstBadVersion(int n){
        int low=1, mid;
        int found = 0;
        while(found == 0){
            if(low>=n){
                if(!isBadVersion(low)){
                    found = n+1;
                }else{
                    found = low;
                }
            }else{
                mid = low + (n-low)/2;
                if(!isBadVersion(mid)){
                    low = mid+1;
                }else{
                    n = mid-1;
                }
            }
        }

        return found;
    }
}
