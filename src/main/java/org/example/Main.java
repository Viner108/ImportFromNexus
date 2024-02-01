package org.example;


import com.company.Company;
import com.lib.Unit;


public class Main {
    public static void main(String[] args) {
        Army army=new Army(null);
        army.getUnit().getRow();
        Company company=new Company(new Unit(1,2));
    }
}