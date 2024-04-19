package com.yobrunox.ejercicios_2.servic;

import com.yobrunox.ejercicios_2.dto.BotDTO;
import com.yobrunox.ejercicios_2.modles.Bot;
import com.yobrunox.ejercicios_2.modles.Empresa;
import com.yobrunox.ejercicios_2.repository.BotRepository;
import com.yobrunox.ejercicios_2.repository.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service()
@AllArgsConstructor
public class BotService {

    private final BotRepository botRepository;
    private final EmpresaRepository empresaRepository;


    public Bot addBot(BotDTO botDTO){
        //Antes de agregar el bot debe haber una empresa
        //Por eso agregamos una por default
        Empresa empresaTemp = empresaRepository.findById(botDTO.getIdEmpresa()).orElse(null);

        Bot bot = new Bot(botDTO.getNombre(),botDTO.getLenguaje(),botDTO.getPrecio(),botDTO.getVersion(),botDTO.getFechaLanzamiento(),empresaTemp);
        //bot.setNombre(botDTO.getNombre());
        //bot.setLenguaje(botDTO.getLenguaje());
        //bot.setPrecio(botDTO.getPrecio());
        //bot.setVersion(botDTO.getVersion());
        //bot.setFechaLanzamiento(botDTO.getFechaLanzamiento());
        //bot.setEmpresa(empresaTemp);

        return botRepository.save(bot);
    }

}
