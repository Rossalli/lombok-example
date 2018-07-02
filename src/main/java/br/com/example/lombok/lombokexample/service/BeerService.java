package br.com.example.lombok.lombokexample.service;

import org.springframework.stereotype.Service;

import br.com.example.lombok.lombokexample.model.BeerWithLombok;
import br.com.example.lombok.lombokexample.model.constants.Style;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerService {

    public void test() {

        BeerWithLombok beer = BeerWithLombok.builder()
                .name("Budweise")
                .style(Style.PILSNER)
                .build();

        log.info(beer.getName());

    }
}
