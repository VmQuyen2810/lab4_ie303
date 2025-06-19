package com.example.ShoeStore.service;

import com.example.ShoeStore.model.Shoe;
import com.example.ShoeStore.repository.ShoeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeService {
    private final ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }

    public List<Shoe> getAllShoes() {
        return shoeRepository.findAll();
    }


}
