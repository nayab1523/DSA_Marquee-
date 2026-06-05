import java.util.Scanner;



class Celciustofar {
    public static double celciustofahrenheit(int celcius){

        double fahr=(1.8*celcius)+32;
        System.out.println(fahr);
        return fahr;
    }
    public static void main(String[] args){

        celciustofahrenheit(90);

    }
}
