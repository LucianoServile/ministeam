package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Juego;

@Repository
public interface IJuegosRepository extends JpaRepository<Juego, Integer>{

}
