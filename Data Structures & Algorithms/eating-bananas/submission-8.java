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
