/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package org.elliot.reto.service;



import java.math.BigDecimal;



/**

 *

 * @author mastermind

 */

public interface RentService {



    double DSCTO_RENT_VALUE = 0.50;



    public BigDecimal calculateRentFromAmount(BigDecimal amount);

}