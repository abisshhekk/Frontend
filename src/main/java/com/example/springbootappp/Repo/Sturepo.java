package com.example.springbootappp.Repo;

import com.example.springbootappp.Entity.Studentable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Sturepo extends JpaRepository<Studentable, Integer> {
}
