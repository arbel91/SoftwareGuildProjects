/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigdecimalpractice;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author PTGIN
 */
public class app {
    public static void main(String[] args) {
        //5*5=25
        BigDecimal susan = new BigDecimal("5" );
        BigDecimal Thomas = new BigDecimal ("5"); 
        System.out.println(susan.multiply(Thomas));
        //1.49 + 8.51 = 10.00
        BigDecimal Sam = new BigDecimal ("1.49");
        BigDecimal Meji = new BigDecimal ("8.51");
        System.out.println(Sam.add(Meji));       
        //10.00 * .625 = 6.3 you need to round this one
        BigDecimal James = new BigDecimal("10.00");
        BigDecimal Samuel = new BigDecimal(".625");
        System.out.println(James.multiply(Samuel).setScale(1, RoundingMode.HALF_UP));       
        //$200.00 with 6.257 % tax added to it = 212.51
        BigDecimal taxRate = new BigDecimal("6.257");
        BigDecimal cost = new BigDecimal("200.00");
        BigDecimal taxInPercent = taxRate.divide(new BigDecimal("100"));
        BigDecimal tax = cost.multiply(taxInPercent);
        BigDecimal Total = cost.add(tax).setScale(2, RoundingMode.HALF_UP);
        System.out.println(Total);
        
    }
}
