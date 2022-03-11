package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Task1_1();
        //Task1_2();
        //Task1_4();
        //Task1_5();
        //Task1_6();
        //Task1_7();
    }
    private static int recursion(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n > 1 && n < 2) {
            return 0;
        }
        else {
            return recursion(n / 2);
        }
    }
    private static void Task1_1(){
        int a, b, c;
        //Задание 1.1
        System.out.println("Введите первое число");
        a = sc.nextInt();//Считываем первое число

        System.out.println("Введите второе число");
        b = sc.nextInt();//Считываем второе число

        c = a + b;
        System.out.println("c = " + c);
    }
    private static void Task1_2(){
        int a, b, n, res, h, m, s;
        //Задание 1.2
        System.out.println("Введите число N");
        n = sc.nextInt();//Считываем число N

        res = n % 10;

        System.out.println("Результат равен: " + res);

        res = 0;

        for (int i = 0; i < 3; i++){
            res += n % 10;
            n /= 10;
        }

        System.out.println("Сумма трехзначного числа равна: " + res);

        res = 0;

        res = ((n+1)%2 == 0) ? n+1 : n+2;
        System.out.println("Ближайшее четное число большее, чем N:" + res);

        a = sc.nextInt();

        b = sc.nextInt();

        n = sc.nextInt();

        a *= n;

        b *= n;

        if (b>99){
            a += b/100;
            b = b%100;
        }

        System.out.print(a + " ");
        System.out.print(b + "\n");

        System.out.println("Введите кол-во секунд: ");
        n = sc.nextInt();

        h = n/3600;

        n %= 3600;

        m = n/60;

        n %= 60;

        s = n;

        if (s >= 60){
            m += s/60;
            s %= 60;
        }

        if (m >= 60){
            h += m/60;
            m %= 60;
        }

        if (h >= 24){
            System.out.print(h%24 + ":");
        }
        else {
            System.out.print(h + ":");
        }


        if (m/10 == 0){
            System.out.print("0" + m + ":");
        }
        else {
            System.out.print(m + ":");
        }

        if (s/10 == 0){
            System.out.print("0"+ s);
        }
        else {
            System.out.print(s);
        }
    }
    private static void Task1_4(){
        //Задание 1.4
        int a;
        byte i, n;
        double nd;
        a = sc.nextInt();
        i = sc.nextByte();

        a = a >>> i;
        a = a << i;
        System.out.println(a);

        n = sc.nextByte();
        a = 1;
        a = a << n;
        System.out.println(a);

        a = sc.nextInt();
        i = sc.nextByte();
        a |= (1 << i);
        System.out.println(a);

        a = sc.nextInt();
        i = sc.nextByte();
        a ^= (1 << i);
        System.out.println(a);


        a = sc.nextInt();
        i = sc.nextByte();
        a &= (1 << i)-1;
        System.out.println(a);

        nd = sc.nextDouble();
        if (recursion(nd) == 1) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }
    }
    private static void Task1_5(){
        //Задание 1.5
        int a, b, c, d;
        double x, y;
        x = sc.nextDouble();

        if(x>=3 && x<=8){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        x = sc.nextDouble();

        if((x>=-3 && x<=5)||(x>=9 && x<=15)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        x = sc.nextDouble();

        if((x>=-2 && x<=3)||(x>=6 && x<=9)){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }

        a = sc.nextInt();

        if(a>99 && a%5==0 && a<1000){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(a==-b || a==-c || a==-d){
            System.out.println(true);
        }
        else if(b==-c || b==-d){
            System.out.println(true);
        }
        else if(c==-d){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a%2==0){
            if(b%2==0 || c%2==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        else{
            if(b%2==0 && c%2==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (x<2 && y<x && x*x+y*y>4 && y>0 ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (y<0.5 && y<Math.sin(x) && x>=0 && x<Math.PI && y>0 ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (x<0 ? y<2-x*x && y>x ? "YES" : "NO":y<2-x*x && y>0 ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (x<0 ? y>x*x-2 && y<-x ? "YES" : "NO":y>x*x-2 && y<x ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (y<0 ? x*x+y*y<1 && x<0 ? "YES" : "NO":x*x+y*y<1 && y>x ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (y<0 ? x*x+y*y<1 && y<x ? "YES" : "NO":x*x+y*y<1 && y>-x ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (x<0 ? y>2*x*x && y>1-x ? "YES" : "NO":x<1 && y>1-x ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (y>0 ? y<1 && x>0 && y>x-1 ? "YES" : "NO":x*x+y*y<1 && x>0 ? "YES" : "NO");

        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println (x>0 ? y>0 ? x<1 && y<1 ? "YES" : "NO": x*x+y*y<1 ? "YES" : "NO" : x*x+y*y<1 ? "YES" : "NO");
    }
    private static void Task1_6(){
        //Задание 1.6
        int n, a, b, c, d, sum, xi, max, min, mid, e;
        double ad,bd,x;

        n = sc.nextInt();

        if(n>=0 && n<10){
            System.out.println("DIGIT");
        }
        else if(n>=10 && n<100){
            System.out.println("NUM");
        }
        else{
            System.out.println("OTHER");
        }

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a<=b) && (b<=c)) System.out.println(a+" "+b+" "+c);
        else if ((b<=a) && (a<=c)) System.out.println(b+" "+a+" "+c);
        else if ((a<=c) && (c<=b)) System.out.println(a+" "+c+" "+b);
        else if ((c<=a) && (a<=b)) System.out.println(c+" "+a+" "+b);
        else if ((c<=b) && (b<=a)) System.out.println(c+" "+b+" "+a);
        else if ((b<=c) && (c<=a)) System.out.println(b+" "+c+" "+a);

        ad = sc.nextDouble();
        bd = sc.nextDouble();
        x = -bd/ad;
        if (ad<=0 && bd<=0)System.out.println("no such x");
        else if(ad>=0 && bd>0)System.out.println("any x");
        else if(ad>0 && bd<0)System.out.printf(Locale.ROOT, "x<%.1f or x>%.1f", -x, x);
        else System.out.printf(Locale.ROOT , "%.1f<x<%.1f", -x, x);

        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        n = sc.nextInt();

        switch(n){
            case 1:
                System.out.println(days[1]);
                break;
            case 2:
                System.out.println(days[2]);
                break;
            case 3:
                System.out.println(days[3]);
                break;
            case 4:
                System.out.println(days[4]);
                break;
            case 5:
                System.out.println(days[5]);
                break;
            case 6:
                System.out.println(days[6]);
                break;
            case 7:
                System.out.println(days[7]);
                break;
            case 8:
                System.out.println(days[8]);
                break;
            case 9:
                System.out.println(days[9]);
                break;
            case 10:
                System.out.println(days[10]);
                break;
            case 11:
                System.out.println(days[11]);
                break;
            case 12:
                System.out.println(days[12]);
                break;
            default:
                System.out.println(days[0]);
                break;
        }

        n = sc.nextInt();
        d = sc.nextInt();
        sum = 0;

        if(n>0 && n<13 && d>0 && d<=days[n]){
            for (int i = 0; i < n; i++) {
                sum += days[i];
            }
            sum += d;
            System.out.println(365-sum);
        }
        else{
            System.out.println(-1);
        }

        xi = sc.nextInt();
        int[] values = {100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while(xi >= values[i]) {
                xi -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.print(roman);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a<=b) && (b<=c)) System.out.println(a+" "+b+" "+c);
        else if ((b<=a) && (a<=c)) System.out.println(b+" "+a+" "+c);
        else if ((a<=c) && (c<=b)) System.out.println(a+" "+c+" "+b);
        else if ((c<=a) && (a<=b)) System.out.println(c+" "+a+" "+b);
        else if ((c<=b) && (b<=a)) System.out.println(c+" "+b+" "+a);
        else if ((b<=c) && (c<=a)) System.out.println(b+" "+c+" "+a);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a+b<=c || a+c<=b || b+c<=a || a+b+c<=0){
            System.out.println("impossible");
        }
        else{
            if(a > b) max = a;
            else max = b;
            if(c > max) max=c;
            if(a < b) min = a;
            else min = b;
            if(c < min) min = c;
            mid = a+b+c-max-min;
            d = min*min+mid*mid;
            e = max*max;
            if(d > e) System.out.println("acute");
            else if(d < e) System.out.println("obtuse");
            else if(d == e) System.out.println("right");

        }
    }
    private static void Task1_7(){

        int n = 1;
        int x = 0;

        while (n >= 0){
            n = sc.nextInt();
            x++;
        }
        System.out.println(x);

        n = 1;
        int sum = 0;
        while (n%5 != 0){
            n = sc.nextInt();
            if(n>10){
                sum += n;
            }
        }
        System.out.println(sum);

        n = 10;
        sum = 0;
        while (n>=10 && n<100){
            n = sc.nextInt();
            if(n<10 || n>=100) break;
            sum += n/10;
            sum += n%10;
        }
        System.out.println(sum);

        int a,b, quo, rem;
        a = sc.nextInt();
        b = sc.nextInt();
        quo = 0;
        rem = 0;
        while(a>0){
            a = a-b;
            if(a>=0){
                if(a<b && a!=0){
                    rem = a;
                    quo++;
                    break;
                }
                else{
                    quo++;
                }

            }
            else{
                rem = a+b;
                break;
            }
        }
        System.out.println(quo+" "+rem);

        int f;
        n = sc.nextInt();
        f = 0;
        while(n>0){
            n /= 2;
            f++;
        }
        System.out.println(f);

        n = sc.nextInt();
        sum = 0;
        while(n>25 && n<100){
            if(n%2==0){
                sum += n;
                n -= 2;
            }
            else{
                n -=1;
            }
        }
        System.out.println(sum);

        int count;
        n = sc.nextInt();
        count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        System.out.println(count);

        n = sc.nextInt();
        while(n>0){
            if((n%10)%2==0){
                n /= 10;
                if(n==0){
                    System.out.println("NO");
                    break;
                }
            }
            else{
                System.out.println(n%10);
                break;
            }
        }

        int min;
        n = sc.nextInt();
        min = n;
        while(n>0){
            if(n%10<min && n%10!=0){
                min = n%10;
            }
            n/=10;
        }
        System.out.println(min);

        int simple;
        n = sc.nextInt();
        n++;//8
        simple = 0;
        while(n<1010 && simple==0){
            for (int i = 2; i <= n; i++) {
                if(n==i){
                    simple = n;
                    break;
                }
                if (n%i==0) {
                    n++;
                    break;
                }
            }
        }
        System.out.println(simple);

        n = sc.nextInt();
        int k = n;
        while(n>0 && sc.nextInt() > 437){
            n--;
        }
        if(n == 0) System.out.println("No crash");
        else System.out.println("Crash " + (k-n+1));

        a = sc.nextInt();
        b = sc.nextInt();
        int aa = a;
        int bb = Math.abs(b);
        while(--bb > 0){
            a+=aa;
        }
        if(b < 0) a=-a;
        if(b == 0) a = 0;
        System.out.println(a);

        x = sc.nextInt();
        int y = 2;
        while(x-- > 0){
            System.out.print(y + " ");
            y+=2;
        }

        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();
        int minch = ((a >= c) ? c : a), minzn = ((a >= c) ? d : b);
        int maxch = ((a >= c) ? a : c), maxzn = ((a >= c) ? b : d);
        int ost = 10000 % minch;
        x = 10000 + ((ost == 0) ? minzn : (minch - ost + minzn));
        k = 0;
        while(x < 100000){
            if(x % maxch == maxzn) {
                System.out.print(x + " ");
                k++;
            }
            x+=minch;
        }
        if(k == 0) System.out.println(-1);

        sum = 0;
        x = sc.nextInt();
        while(x > 0){
            sum += x % 10;
            x/=10;
        }
        System.out.println(sum);

        x = sc.nextInt();
        while(x > 9){
            if(x % 10 == (x/10)%10) {
                System.out.println("YES");
                return;
            }
            x/=10;
        }
        System.out.println("NO");

        x = sc.nextInt();
        if (x<=1) {
            System.out.println("composite");
            return;
        }
        else if (x <=3) {
            System.out.println("prime");
            return;
        }
        else if (x%2==0 || x %3 ==0) {
            System.out.println("composite");
            return;
        }

        n = 5;
        while (n*n <=x){
            if (x % n ==0 || x % (n+2) == 0) {
                System.out.println("composite");
                return;
            }
            n=n+6;
        }
        System.out.println("prime");

        double ad = sc.nextDouble();
        double aad = 1;
        n = sc.nextInt();
        while(n > 0){
            if(n % 2 == 1){
                aad *= ad;
            }
            ad *= ad;
            n >>= 1;
        }
        System.out.println(aad);
    }
}