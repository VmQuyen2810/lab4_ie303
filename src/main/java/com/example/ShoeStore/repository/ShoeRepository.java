package com.example.ShoeStore.repository;

import com.example.ShoeStore.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
}
