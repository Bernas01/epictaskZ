package br.com.fiap.epictaskz.taks;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Table(name = "car")
@Entity
@Data
public class Car {

    @Id
    private UUID id;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @Min(1886) // Ano do primeiro carro
    @Max(2024) // Ano atual
    private int year;

    @Min(0)
    private double price;
}