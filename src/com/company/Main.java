package com.company;

import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Task1_1();
        Task1_2();
        Task1_4();
        Task1_5();
        Task1_6();
        Task1_7();
        Task1_8();
        Task1_11();
        Fraction aF = new Fraction(2,7);
        Fraction bF = new Fraction(6,-7);
        System.out.println(aF.sumFractionTo(bF));
        System.out.println(aF.sumFraction(aF, bF));

        System.out.println(aF.subFractionTo(bF));
        System.out.println(aF.subFraction(aF, bF));

        System.out.println(aF.multiFractionTo(bF));
        System.out.println(aF.multiFraction(aF, bF));

        System.out.println(aF.divFractionTo(bF));
        System.out.println(aF.divFraction(aF, bF));
        MyClass obj1 = new MyClass(), obj2 = new MyClass();
        obj1.f();
        obj2.f();
        obj1.f();

        int n;
        n = sc.nextInt();
        Fraction[] a = new Fraction[n];
        for(int i = 0; i < n; i++) {
            a[i] = new Fraction(1, i+1);
        }
        for (Fraction f: a){
            System.out.print(f);
            System.out.print("; ");
        }
        B a1 = new B();
        int b = a1.f(5.0);
        int c = a1.f(7.0);
        Test.s();
    }
    //Module1 ↓
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

        System.out.println(x >= 3 && x <= 8);

        x = sc.nextDouble();

        System.out.println((x >= -3 && x <= 5) || (x >= 9 && x <= 15));

        x = sc.nextDouble();

        System.out.println((!(x >= -2) || !(x <= 3)) && (!(x >= 6) || !(x <= 9)));

        a = sc.nextInt();

        System.out.println(a > 99 && a % 5 == 0 && a < 1000);

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
        else System.out.println(c == -d);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a%2==0){
            System.out.println(b % 2 == 0 || c % 2 == 0);
        }
        else{
            System.out.println(b % 2 == 0 && c % 2 == 0);
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

        String s = x * x + y * y < 1 ? "YES" : "NO";
        System.out.println (x>0 ? y>0 ? x<1 && y<1 ? "YES" : "NO": s : s);
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

        if ((a<b) && (b<c)) System.out.println(a+" "+b+" "+c);
        else if ((a<c) && (c<b)) System.out.println(a+" "+c+" "+b);
        else if ((b<a) && (a<c)) System.out.println(b+" "+a+" "+c);
        else if ((b<c) && (c<a)) System.out.println(b+" "+c+" "+a);
        else if ((c<a) && (a<b)) System.out.println(c+" "+a+" "+b);
        else if ((c<b) && (b<a)) System.out.println(c+" "+b+" "+a);

        ad = sc.nextDouble();
        bd = sc.nextDouble();
        x = -bd/ad;
        if (ad<=0 && bd<=0)System.out.println("no such x");
        else if(ad>=0 && bd>0)System.out.println("any x");
        else if(ad>0 && bd<0)System.out.printf(Locale.ROOT, "x<%.1f or x>%.1f", -x, x);
        else System.out.printf(Locale.ROOT , "%.1f<x<%.1f", -x, x);

        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println(days[1]);
            case 2 -> System.out.println(days[2]);
            case 3 -> System.out.println(days[3]);
            case 4 -> System.out.println(days[4]);
            case 5 -> System.out.println(days[5]);
            case 6 -> System.out.println(days[6]);
            case 7 -> System.out.println(days[7]);
            case 8 -> System.out.println(days[8]);
            case 9 -> System.out.println(days[9]);
            case 10 -> System.out.println(days[10]);
            case 11 -> System.out.println(days[11]);
            case 12 -> System.out.println(days[12]);
            default -> System.out.println(days[0]);
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
        else if ((a<=c) && (c<=b)) System.out.println(a+" "+c+" "+b);
        else if ((b<=a) && (a<=c)) System.out.println(b+" "+a+" "+c);
        else if (b<=c) System.out.println(b+" "+c+" "+a);
        else if (a<=b) System.out.println(c+" "+a+" "+b);
        else System.out.println(c+" "+b+" "+a);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a+b<=c || a+c<=b || b+c<=a || a+b+c<=0){
            System.out.println("impossible");
        }
        else{
            max = Math.max(a, b);
            if(c > max) max=c;
            min = Math.min(a, b);
            if(c < min) min = c;
            mid = a+b+c-max-min;
            d = min*min+mid*mid;
            e = max*max;
            if(d > e) System.out.println("acute");
            else if(d < e) System.out.println("obtuse");
            else System.out.println("right");

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

        sum = 0;
        while (true){
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
        int minch = (Math.min(a, c)), minzn = ((a >= c) ? d : b);
        int maxch = (Math.max(a, c)), maxzn = ((a >= c) ? b : d);
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
    private static void Task1_8(){

        boolean eq = false;
        int x = sc.nextInt();
        int[] mas = new int[x];
        for (int i = 0; i < x; i++){
            mas[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        for (int i = 0; i < x; i++) {
            if (mas[i] == b) {
                eq = true;
                System.out.println(i + 1);
                break;
            }
        }
        if (!eq) {
            System.out.println("NO");
        }

        int k = sc.nextInt();
        int summ=0;
        x = 0;
        while (k>0){
            int n = sc.nextInt();
            if (n%2==0){
                summ=summ+n;
                x++;
            }
            k--;
        }
        if (x>0){
            System.out.println(summ);
        }
        else {
            System.out.println("NO");
        }

        k = sc.nextInt();
        float sum=0;
        float xf = 0;
        while (k>0){
            int n = sc.nextInt();
            if (n%2!=0){
                sum=sum+n;
                xf++;
            }
            k--;
        }
        if (xf>0){
            sum=sum/xf;
            System.out.printf("%.2f",sum);
        }
        else {
            System.out.println("NO");
        }

        int n = sc.nextInt();
        int[] result = new int[n];
        int val = 4;
        for (int i = 0; i < n; i++, val += 3) {
            result[i] = val;
            System.out.print(result[i] + " ");
        }

        k = sc.nextInt();
        int[] arr = new int [k];
        for (int i=0;i<k; i++){
            x = sc.nextInt();
            arr[i]=x;
        }
        for(int i = 0; i < k/2; i++){
            int v = arr[i];
            int j = k - 1 - i;
            arr[i] = arr[j];
            arr[j] = v;
        }
        for (int i = 0; i<k; i++){
            System.out.print(arr[i]+" ");
        }

        int j = sc.nextInt(), count, maxcount = 1, min;
        n = -1;
        int[] a = new int[j];
        if (j != 1) {
            for (int i = 0; i < j; i++) {
                a[i] = sc.nextInt();
            }
            min = a[0];
            for (int i = 0; i < j; i++) {
                count=0;
                for (k = i; k < j; k++) {
                    if (a[i] == a[k]) {
                        count += 1;
                    }
                }
                if (maxcount < count) {
                    maxcount = count;
                    n = a[i];
                }
                if (min>a[i]){
                    min = a[i];
                }
            }
            if (maxcount==1){
                System.out.println(min);
            }
            else {
                System.out.println(n);
            }
        }
        else {
            a[0] = sc.nextInt();
            System.out.println(a[0]);
        }

        n = sc.nextInt();
        a = new int [n];
        for (j=0; j < n; j++){
            a[j] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            if (a[i] < 0){
                System.out.print(a[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0){
                System.out.print(a[i] + " ");
            }
        }

        int N = sc.nextInt();
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(N));
        System.out.println(sb.reverse());

        N = sc.nextInt();
        arr = new int[N+1];
        arr[0] = 1;
        for(int i = 1; i < N; i++){
            arr[sc.nextInt()] = 1;
        }
        for(int i = 1; i < N+1; i++){
            if(arr[i] == 0) System.out.println(i);
        }

        N = sc.nextInt();
        int num = 1;
        for(int i = 0; i < N; i++){
            for(j = 0; j < N; j++){
                if(i == j) {
                    System.out.print(num + " ");
                    num+=N+1;
                }
            }
        }

        N = sc.nextInt();
        num = 1;
        for(int i = 1; i < N+1; i++){
            num*=i;
        }
        System.out.println(num);

        n = sc.nextInt();
        int aa = sc.nextInt();
        b = sc.nextInt();
        int bb = b-1;
        int c = sc.nextInt();
        int d = sc.nextInt(), dd = d-1;
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=i+1;
        }
        for(int i = aa-1; i < (b+aa)/2; i++){
            int temp = arr[i];
            arr[i] = arr[bb];
            arr[bb--] = temp;
        }
        for(int i = c-1; i < (d+c)/2; i++){
            int temp = arr[i];
            arr[i] = arr[dd];
            arr[dd--] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            if(i%2==0) System.out.print(x + " ");
        }

        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            if(x%2==0) System.out.print(x + " ");
        }

        sum = 0;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(sc.nextInt()>0) sum++;
        }
        System.out.println(sum);

        sum = 0;
        n = sc.nextInt();
        arr = new int[n];
        if(n == 0) {
            System.out.println(0);
            return;
        }
        arr[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > arr[i-1]) sum++;
        }
        System.out.println(sum);

        int max;
        n = sc.nextInt();
        arr = new int[n];
        arr[0] = sc.nextInt();
        max = arr[0];
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);

        n = sc.nextInt();
        sum = 1;
        arr = new int[n];
        arr[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > arr[i-1]) sum++;
        }
        System.out.println(sum);
    }
    //Task1_9 ↓
    public static int SumOfDigits(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i != 0; i = i / 10){
            sum = sum + i % 10;
        }
        return (sum);
    }
    public static int SumOfSeven(int a, int b){
        if(b < a || b < 10) return 0;
        int sum = 0;
        int st = (a % 7 == 0) ? (a == 0) ? 7 : a : (a + 7 - (a % 7));
        if(a % 7 == 0) st = a;
        int start = (st / 10 == 0) ? st + 7 : st;
        while(start <= b && start < 100){
            sum += SumOfDigits2(start);
            start += 7;
        }
        return sum;
    }
    public static int SumOfDigits2(int x){
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x/=10;
        }
        return sum;
    }
    public static int SumOfThirteen(int x){
        int num = 0;
        while(x > 0) if (SumOfDigits() % 13 == 0) num++;
        return num;
    }
    public static int SumOfDigits3(int x){
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x/=10;
        }
        return sum;
    }
    public static void BinFraction(double x, int n){
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < n; i++){
            x *= 2;
            str.append((int)(x));
            x %= 1;
        }
        System.out.println(str);
    }
    public static double avgOf4Digit(int[] arr){
        double sum = 0; int k = 0;
        for (int j : arr) {
            if (j >= 1000 && j < 10000) {
                sum += j;
                k++;
            }
        }
        if(k == 0) return -1;
        return sum / k;
    }
    public static int[] minToBegin(int[] arr){
        int min_ind = 0, min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                min_ind = i;
            }
        }
        for(int i = min_ind; i > 0; i--) arr[i] = arr[i - 1];
        arr[0] = min;
        return arr;
    }
    public static double segmentLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3){
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x3, y3, x1, y1);
    }
    public static int min(int x1, int x2, int x3, int x4){
        return (x1 <= x2 && x1 <= x3 && x1 <= x4) ? x1 : (x2 <= x1 && x2 <= x3 && x2 <= x4) ? x2 : (x3 <= x1 && x3 <= x2 && x3 <= x4) ? x3 : x4;
    }
    //Task1_9 ↑
    private static void Task1_11(){
        int n = sc.nextInt(); int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();
        System.out.println(m + " " + n);
        for(int j = 0; j < m; j++){
            for(int i = n - 1; i >= 0; i--)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }

        n = sc.nextInt();
        int[][] mas = new int[n][n];
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                if(i + j + 1== n) {
                    mas[i][j] = 1;
                }
                else {
                    if (i + j + 1 < n) {
                        mas[i][j] = 0;
                    }
                    else {
                        mas[i][j] = 2;
                    }
                }
            }
        }
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //4 задание
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        int i = 0, j = 0;
        for ( int k = 0; k < n * m; ++k, ++j ) {
            if ( k != 0 && k % m == 0 ) {
                ++i;
                j = 0;
                System.out.println();
            }
            arr[i][j] = i * j;
            System.out.format("%4d",arr[i][j]);
        }

        n = sc.nextInt();
        m = sc.nextInt();
        mat = new int[n][m];
        int val = 0;
        for(i = 0; i < n; i++){
            if(i % 2 == 0)
                for (j = 0; j < m; j++)
                    mat[i][j] = val++;
            else
                for (j = m - 1; j >= 0; j--)
                    mat[i][j] = val++;
        }
        for(i = 0; i < n ; i++){
            for(j = 0; j < m; j++)
                System.out.printf("%3d", mat[i][j]);
            System.out.println();
        }

        n = 2 * sc.nextInt() + 1;
        mat = new int[n][n];
        perimeter(mat);
        val = (n-2)*(n-2)-1;
        i = 0;
        j = n - 2;
        while(val > 0){
            while(mat[i + 1][j] == 0)
                mat[++i][j] = val--;
            while(mat[i][j - 1] == 0)
                mat[i][--j] = val--;
            while(mat[i - 1][j] == 0)
                mat[--i][j] = val--;
            while(mat[i][j + 1] == 0)
                mat[i][++j] = val--;
        }
        for (int[] ints : mat) {
            for (int y = 0; y < mat.length; y++)
                System.out.printf("%3d", ints[y]);
            System.out.println();
        }

        //3 задание
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < n; ++i){
            for(j = 0; j < n; ++j){
                if(a[i][j] != a[j][i]){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
    public static void perimeter(int[][] mat){
        int n = mat.length;
        int val = n*n-1;
        for(int i = 0; i < n; i++)
            mat[i][n-1] = val--;
        for(int j = n - 2; j >= 0; j--)
            mat[n-1][j] = val--;
        for(int i = n - 2; i >= 0; i--)
            mat[i][0] = val--;
        for(int j = 1; j < n - 1; j++)
            mat[0][j] = val--;
    }
    private static void VC(){
        int n = sc.nextInt();
        int[] digits = new int[10];
        while(n > 0){
            digits[n % 10]++;
            if(digits[n % 10] > 1) {
                System.out.println("YES");
                return;
            }
            n /= 10;
        }
        System.out.println("NO");

        int a = sc.nextInt();
        int b = sc.nextInt();
        n = 0;
        while(a != 0 && b != 0){
            while(a > b) {
                a -= b;
                n++;
            }
            while(b >= a) {
                b -= a;
                n++;
            }
        }
        System.out.println(a + " " + n);

        a = sc.nextInt();
        b = sc.nextInt();
        n = 0;

        for(int i = a; i <= b; i++){
            if(checkSimple(i)) {
                System.out.print(i + " ");
                n++;
            }
        }
        if(n == 0) System.out.println(n);

        int c = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        int a1 = 0, b1 = 0, c1 = 0;
        int k = 0;
        StringBuilder str = new StringBuilder();
        while(a*a1 <= n)
        {
            if(a*a1 + b*b1 + c*c1 == n) {
                str.append(a1).append(" ").append(b1).append(" ").append(c1).append("\n");
                k++;
            }
            b1 = 0;
            while(a*a1 + b*b1 <= n){
                if(a*a1 + b*b1 + c*c1 == n) {
                    str.append(a1).append(" ").append(b1).append(" ").append(c1).append("\n");
                    k++;
                }
                c1 = 0;
                while(a*a1 + b*b1 + c*c1 <= n){
                    if(a*a1 + b*b1 + c*c1 == n) {
                        str.append(a1).append(" ").append(b1).append(" ").append(c1).append("\n");
                        k++;
                    }
                    c1++;
                }
                b1++;
            }
            a1++;
        }
        System.out.println(k + "\n" + str);

        int x = sc.nextInt();
        int max = x;
        k = 1;
        while(x != 0){
            x = sc.nextInt();
            if(x == max) k++;
            if(x > max) {
                max = x;
                k = 1;
            }
        }
        System.out.println(k);

        x = sc.nextInt();
        k = 1;
        max = k;
        boolean rises = true;
        while(x != 0){
            int xx = sc.nextInt();
            if(xx == 0) break;
            if(rises){
                if(xx > x){
                    k++;
                    if(k > max) max = k;
                }
                else if(xx < x){
                    k = 2;
                    rises = false;
                }
                else k = 1;
            }
            else{
                if(xx < x){
                    k++;
                    if(k > max) max = k;
                }
                else if(xx > x){
                    k = 2;
                    rises = true;
                }
                else k = 1;
            }
            x = xx;
        }
        System.out.println(max);
    }
    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
    //Module1 ↑
    //Module2 ↓

    //Module2 ↑
}

class Vector2D{
    public double vX;
    public double vY;
    public static int count;
    public Vector2D(){
        this.vX = 1;
        this.vY = 1;
        count += 1;
    }
    public Vector2D(double prX, double prY) {
        this.vX = prX;
        this.vY = prY;
        count += 1;
    }
    public Vector2D(Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
        count += 1;
    }
    public void print() {
        System.out.printf(Locale.US, "(%.2f, %.2f)%n", this.vX, this.vY);
    }
    public double length() {
        return Math.sqrt(Math.pow(this.vX, 2) + Math.pow(this.vY, 2));
    }
    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized() {
        double len = length();
        this.vX /= len;
        this.vY /= len;
    }
    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }
}

class Fraction{
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }


    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        if (denominator < 0){
            this.numerator *= -1;
        }
    }

    private int gcd(int numerator, int denominator){
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private int gcd2(int a, int b){
        if (b == 0) return a;
        else return gcd2(b, a%b);
    }

    private void normalization(){
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    public boolean properFraction(){ //проверка правильности дроби
        return (Math.abs(numerator) < denominator);
    }

    public int getIntegerPart(){ // выделение целой части
        return (numerator / denominator);
    }

    public Fraction fractionalPart(){ // выделение дробной части
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions(){ // результат деления в виде десятичной дроби
        return (double) numerator / denominator;
    }

    public String toString(){ // вывод дроби на печать
        return numerator + "/" + denominator;
    }
    //Сложение
    public Fraction sumFractionTo(Fraction obj){
        return new Fraction(this.numerator * obj.denominator + obj.numerator * this.denominator, this.denominator * obj.denominator);
    }
    public Fraction sumFraction(Fraction obj1, Fraction obj2){
        return new Fraction(obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }
    //Вычитание
    public Fraction subFractionTo(Fraction obj){
        return new Fraction(this.numerator * obj.denominator - obj.numerator * this.denominator, this.denominator * obj.denominator);
    }
    public Fraction subFraction(Fraction obj1, Fraction obj2){
        return new Fraction(obj1.numerator * obj2.denominator - obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }
    //Умножение
    public Fraction multiFractionTo(Fraction obj){
        return new Fraction(this.numerator * obj.numerator, this.denominator * obj.denominator);
    }
    public Fraction multiFraction(Fraction obj1, Fraction obj2){
        return new Fraction(obj1.numerator * obj2.numerator, obj1.denominator * obj2.denominator);
    }
    //Деление
    public Fraction divFractionTo(Fraction obj){
        return new Fraction(this.numerator * obj.denominator, this.denominator * obj.numerator);
    }
    public Fraction divFraction(Fraction obj1, Fraction obj2){
        return obj1.divFractionTo(obj2);
    }
}

class MyClass extends Point{
    public static int count;

    void f(){
        count += 1;
        System.out.print(count + " ");

    }

}