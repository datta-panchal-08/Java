package com.example.JPAP02.repo;

import com.example.JPAP02.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
