class SumPrimeComp{
    public static void main(String[] args){
        int m[][] = {{4,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
        int primeSum = 0;
        int compSum = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                boolean isComp = false;
                // loop to check whether prime or composite
                for(int k=2; k<m[i][j]; k++){
                    if(m[i][j] != 2 && m[i][j] % k == 0){
                        isComp = true;
                        break;
                    }
                }
                if(isComp == true){
                    compSum += m[i][j];
                } else {
                    primeSum += m[i][j];
                }
            }
        }

        System.out.println("Sum of all primes: " + primeSum);
        System.out.println("Sum of all composites: " + compSum);
    }
}