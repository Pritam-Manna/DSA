class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int m = rolls.length;
        int total = mean * (m+n);
        int m_total = 0;
        int n_total = 0;
        int res[] = new int[n];


        for(int item : rolls){
            m_total += item;
        }

        n_total = total - m_total;

        if(n_total >= n && n_total <= n*6){
            int i=0;
            while(n!=0){
                res[i] = (int) Math.ceil(((double) n_total/n));
                n--;
                n_total -= res[i];
                i++;
            }
            return res;
        }

        return new int [0];
    }
}