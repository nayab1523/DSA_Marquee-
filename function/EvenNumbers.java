public class EvenNumbers {

        public static int EvenNumber(int start,int end){
            int sum=0;
            for(int i=start;i<=end;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            return sum;
        }
        public static void main(String[] args){
            System.out.println(EvenNumber(1,10));

        }
    }


