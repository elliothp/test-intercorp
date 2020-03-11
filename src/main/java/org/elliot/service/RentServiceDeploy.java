/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package org.elliot.reto.service;



import java.math.BigDecimal;

import java.math.RoundingMode;

import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;



/**

 *

 * @author mastermind

 */

@Singleton

@Slf4j

public class RentServiceDeploy implements RentService {



    @Override

    public BigDecimal calculateRentFromAmount(BigDecimal amount) {

        BigDecimal result = amount.multiply(new BigDecimal(DSCTO_RENT_VALUE));

        result = result.setScale(2, RoundingMode.HALF_UP);

        return result;

    }

}