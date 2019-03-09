package com.bleachyiqihu.javapractice.jdbc;

/**
 * Created by Paul on 2019-03-09
 */
public class Main {
    public static void main(String[] args) {
        QueryMySql queryMySql = new QueryMySql();
        System.out.println(queryMySql.selectAndUpdate(1));
    }
}
