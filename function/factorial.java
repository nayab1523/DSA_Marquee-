public class factorial {
    public static long fact(int n){
        if(n==1||n==0){
            return 1;
        }
        long mul=1;
        for(int i=2;i<=n;i++){
            mul*=i;
        }
        return mul;
    }
    public static void main(String[] args){
        System.out.println(fact(25  ));

    }

}


