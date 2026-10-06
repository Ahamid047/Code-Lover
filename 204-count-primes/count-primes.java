class Solution {
    public int countPrimes(int n) {

        boolean[] isPrime = new boolean[n];

        // Initially assume every number is prime
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }

        // Mark multiples of prime numbers as false
        for(int i = 2; i * i < n; i++){

            if(isPrime[i]){

                for(int j = i * i; j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        // Count remaining prime numbers
        int ans = 0;

        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                ans++;
            }
        }

        return ans;
    }
}