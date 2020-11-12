/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 컴알_hw4;

/*//확장 유클리드 알고리즘
import java.util.Scanner;
public class Main {
    static long x, y, gcd, temp;
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long p = 1000000007;

        long[] factorial = new long[N+1];
        factorial[0] = 1;
        factorial[1] = 1;
      
        for(int i=2; i<=N; i++) factorial[i] = (factorial[i-1]*i)%p;
        long denominator = (factorial[K]*factorial[N-K])%p;

        euclidean(p, denominator);
        long result = ((factorial[N]%p)*(y%p))%p;
        if(result<0) result += p;
        System.out.println(result);
    }

    public static void euclidean(long B, long p){
        if(B%p>0){
            euclidean(p, B%p);
            temp = y;
            y = x - (B/p)*y;
            x = temp;
        }else{
            x = 0;
            y = 1;
            gcd = p;
        }
    }
    
}*/
//페르마의 소정리
import java.util.Scanner;

public class Main {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long p = 1000000007;

        long[] factorial = new long[N+1];
        factorial[0] = 1;
        factorial[1] = 1;

        for(int i=2; i<=N; i++) factorial[i] = (factorial[i-1]*i)%p;
        long denominator = (factorial[K]*factorial[N-K])%p;

        long index = p-2;
        long fermatNum = 1;
        while(index > 0){
            if(index%2==1){
                fermatNum *= denominator;
                fermatNum %= p;
            }
            denominator = (denominator*denominator)%p;
            index /= 2;
        }
        long result = ((factorial[N]%p)*(fermatNum%p))%p;
        System.out.print(result);
    }
}
