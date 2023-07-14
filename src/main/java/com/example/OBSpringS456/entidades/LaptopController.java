package com.example.OBSpringS456.entidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    //atributes
    private LaptopRepository laptopRepository;

    //cosntructores


    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    //CRUD methods

    @GetMapping("/laptop")
    public List<LaptopEntidad> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/laptop")
    public LaptopEntidad create(@RequestBody LaptopEntidad laptopEntidad){
    return laptopRepository.save(laptopEntidad);
    }
}
