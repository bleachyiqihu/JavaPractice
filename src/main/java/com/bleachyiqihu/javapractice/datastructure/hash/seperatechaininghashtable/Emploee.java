package com.bleachyiqihu.javapractice.datastructure.hash.seperatechaininghashtable;

/**
 * Created by Paul on 2018-10-27
 */
public class Emploee {
    private String name;
    private double salary;
    private int seniority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Emploee && name.equals(((Emploee) obj).name);
    }
}
