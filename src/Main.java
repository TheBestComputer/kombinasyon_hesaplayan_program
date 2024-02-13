
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n, r, carpim = 1, nCarpim = 1, nrCarpim = 1, faktoriyel;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N : ");
        n = scanner.nextInt();
        System.out.print("r : ");
        r = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
            carpim *= i;
            if(i <= r){
                nCarpim *= i;
            }
            if(i <= (n-r)){
                nrCarpim *= i;
            }
        }
        faktoriyel = carpim / (nCarpim * nrCarpim);
        System.out.println("Faktoriyel : " + faktoriyel);
    }
}
