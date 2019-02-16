package com.manyatkin.springioex.consumingrestfulwebservice;

import com.manyatkin.springioex.consumingrestfulwebservice.model.Quote;
import com.sun.org.apache.xpath.internal.operations.Quo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class ConsumingRestfulWebServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConsumingRestfulWebServiceApplication.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        logger.info(quote.toString());
    }

}

