import java.util.Scanner;

public class Number_prime_20 {
    public static boolean isPrime(int n){
        boolean check =true;
        if(n <2){
            check =false;
        }else {
            for (int i =2 ;i<Math.sqrt(n);i++){
                if(n % i == 0){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void Prime_20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng  số  nguyên tố  cần  tìm");
        int number =sc.nextInt();
        int count =1;
        int N =2;

        while(count < number){
            if(isPrime(N)){
                System.out.println(N+"");
            }
            N++;
            count++;
        }
    }

    public static void main(String[] args) {
        Prime_20();
    }
}
