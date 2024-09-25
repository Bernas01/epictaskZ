package br.com.fiap.epictaskz.taks;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, UUID> {
}