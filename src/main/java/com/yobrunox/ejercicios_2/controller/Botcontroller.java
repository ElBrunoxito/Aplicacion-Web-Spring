package com.yobrunox.ejercicios_2.controller;

import com.yobrunox.ejercicios_2.dto.BotDTO;
import com.yobrunox.ejercicios_2.modles.Bot;
import com.yobrunox.ejercicios_2.repository.BotRepository;
import com.yobrunox.ejercicios_2.servic.BotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/AguilarBot")
public class Botcontroller{

    private final BotService botService;

    public Botcontroller(BotService botService) {
        this.botService = botService;
    }

    @PostMapping("/EspinozaAdd")
    public ResponseEntity<Bot> addBot(@RequestBody BotDTO botDTO){
        return new ResponseEntity<>(botService.addBot(botDTO), HttpStatus.CREATED);
    }

}
