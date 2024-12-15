package pe.edu.i202224977.ef_joseAhumada.service;

import pe.edu.i202224977.ef_joseAhumada.dto.CarDetailDto;
import pe.edu.i202224977.ef_joseAhumada.dto.CarDto;
import pe.edu.i202224977.ef_joseAhumada.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;


}
