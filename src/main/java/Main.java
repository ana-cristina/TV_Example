import java.util.Scanner;


public class Main {

    /*

    Se da un numar intreg n, cuprins intre 1000 si 99999. Sa se verifice daca suma cifrelor lui n este un numar prim.
    Programul va intoarce un string astfel:
    daca n nu este in intervalul mentionat, se va afisa un mesaj de eroare;
    DA/NU daca respecta cerinta sau nu.

     */


    static Boolean isPrim(Integer n){

        Integer nr = 0 ;
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                nr++;
            }
        }
        if(nr == 0 && n >= 2)
            return true;
        else return false;

    }

    static String calculeaza(Integer n){
        String result ;
        if(n >=1000 && n <=99999){
            Integer nr = n, sum = 0;
            int c;
            while(nr>0){
                c = nr % 10;
                nr = nr / 10;
                sum = sum + c;
            }
            if(isPrim(sum))
                result = "DA";
            else result =  "NU";
        }else{
            result = "Numarul nu este valid";
        }
        return  result;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myInt is: " + myInt);
        System.out.println("result is: " + calculeaza(myInt));
    }
}
