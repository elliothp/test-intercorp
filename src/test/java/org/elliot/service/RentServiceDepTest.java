/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package org.elliot.reto.service;



import io.micronaut.test.annotation.MicronautTest;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;



/**

 *

 * @author mastermind

 */

@MicronautTest

@DisplayName("Test Unitario del calculo de Descuento de Renta")

public class RentServiceDepTest {



    @Inject

    RentService instance;



    /**

     * Test of calculateRentFromAmount method, of class RentServiceDeploy.

     */

    @DisplayName("Debe calcular el Descuento de Renta correctamente de todos los montos")

    @ParameterizedTest

    @CsvSource({"100,50.00", "90,45.00", "50,25.00", "150,75.00"})

    public void testCalculateRentFromAmount(String amountBase, String rentExpected) {

        System.out.println("calculateRentFromAmount");

        BigDecimal amount = new BigDecimal(amountBase);

        BigDecimal expResult = new BigDecimal(rentExpected);

        BigDecimal result = instance.calculateRentFromAmount(amount);

        Assertions.assertEquals(

                expResult,

                result

        );

    }



}