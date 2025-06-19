package com.example.ShoeStore.controller;

import com.example.ShoeStore.model.Shoe;
import com.example.ShoeStore.service.ShoeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoeController {
    private final ShoeService shoeService;

    public ShoeController(ShoeService shoeService) {
        this.shoeService = shoeService;
    }

    @GetMapping
    public List<Shoe> getAllShoes() {
        return shoeService.getAllShoes();
    }

}
