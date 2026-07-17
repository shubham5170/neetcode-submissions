/*
This is done via binary search where maximum number of k we can keep is maximum number of array
In that case number of hours take will be length of array
Minimum k we can keep is 1 and in that case hours required will be sum of element.
Initially by mistake I assumed it has to be smallest elemnt but its not true. We can take 1 also
Reason why it is har capped at max elemnt is because beyond that hours wont improve
Now about if condition, by calculating mid k and then hours, and if reached lower than target or equal to
It means that number can still be answer because maybe that the max improvement we can do
So keep kmax = k, to keep that number in answer
but if we cannot reach numbe of hours, we definitely have to increase k
*/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int  n = piles.length;
        int kmin = 1;
        int kmax = piles[n-1];

        while(kmin<kmax)
        {
            int k = (kmin+kmax)/2;
            System.out.println(kmin+":"+k+":"+kmax);
            int hact = 0;
            for(int pile: piles) 
            if(pile%k==0)
            hact+=(pile/k);
            else hact+= ((pile/k)+1);

            if(hact<=h) kmax=k;
            else kmin=k+1;
        }

       return kmin; 
    }
}
