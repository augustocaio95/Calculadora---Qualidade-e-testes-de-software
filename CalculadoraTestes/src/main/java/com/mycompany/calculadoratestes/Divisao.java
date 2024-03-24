/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoratestes;

/**
 *
 * @author caio_
 */
public class Divisao {

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por 0");
            return Double.NaN;
        } else {
            return a / b;
        }
    }
}
