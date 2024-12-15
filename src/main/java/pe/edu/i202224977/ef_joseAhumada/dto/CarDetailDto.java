package pe.edu.i202224977.ef_joseAhumada.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public record CarDetailDto(Integer carId,
                           String make,
                           String model,
                           Integer year,
                           String vin,
                           String licensePlate,
                           String ownerName,
                           String ownerContact,
                           @JsonFormat(pattern = "yyyy-MM-dd")
                           Date purchaseDate,
                           Integer mileage,
                           String engineType,
                           String color,
                           String insuranceCompany,
                           String insurancePolicyNumber) {
}
