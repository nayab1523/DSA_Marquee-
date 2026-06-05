public class primeNumbers {

        public static boolean primeNumber(int n){
            if(n==1){
                return false;
            }
            for(int i=1;i<=Math.sqrt(n);i++){
                if(i%n==0){
                    return false;
                }

            }
            return true;
        }
        public static void main(String[] args){
            System.out.println( primeNumber(15));
        }
    }


