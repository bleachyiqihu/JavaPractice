package com.bleachyiqihu.javapractice.generic.PrimeNum;

/**
 * Created by Paul on 2018-12-24
 */
class Solution {
    int sumOfPrimeNum(int a, int b) {
        int sum = 0;
        for(int i = a ; i <= b; i++) {
            sum += isPrime(i);
        }
        return sum;
    }

    private int isPrime(int n) {
        if(n == 2) {
            return 2;
        }
        if(n < 2 || n % 2 == 0) {
            return 0;
        }
        for(int i = 3; i <= Math.sqrt(n); i ++) {
            if(n % i == 0)
                return 0;
        }
        return n;
    }
}
