class ladder{
    public static void main(String[] args){
        int stars=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            if(i%2==0){
                stars+=2;
            }
            System.out.println();
        }
    }
}