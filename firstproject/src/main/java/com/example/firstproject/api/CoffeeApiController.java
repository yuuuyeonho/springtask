package com.example.firstproject.api;

import com.example.firstproject.entity.Coffee;
import com.example.firstproject.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeApiController {

    private final CoffeeService coffeeService;

    @GetMapping("/api/coffees")
    public List<Coffee> index(){
        return coffeeService.index();
    }
}
