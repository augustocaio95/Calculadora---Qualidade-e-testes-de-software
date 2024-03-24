/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoratestes;


import org.junit.jupiter.api.Test;


/**
 *
 * @author caio_
 */
public class CalculadoraJunitTest {
    @Test
    public void SomarDoisNumerosPositivos(){
        Soma calc = new Soma();
        int soma = calc.somar(3, 7);
       
    }
}
