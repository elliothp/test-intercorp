
package org.elliot.reto.controller;



import io.micronaut.http.MediaType;

import io.micronaut.http.annotation.*;

import io.micronaut.http.HttpHeaders;

import java.io.IOException;

import java.math.BigDecimal;

import javax.inject.Inject;



import lombok.extern.slf4j.Slf4j;

import org.elliot.reto.service.RentService;



@Slf4j

@Controller("/Rent")

public class RentController {



    @Inject

    RentService rentService;



    @Get(value = "/calculate/{amount}")

    @Consumes(MediaType.TEXT_PLAIN)

    @Produces(MediaType.APPLICATION_JSON)

    public String calculateRent(@QueryValue Double amount, final HttpHeaders headers) throws IOException {

        return "{\"Rent\":\"" + (rentService.calculateRentFromAmount(new BigDecimal(amount))) + "\"}";

    }

}