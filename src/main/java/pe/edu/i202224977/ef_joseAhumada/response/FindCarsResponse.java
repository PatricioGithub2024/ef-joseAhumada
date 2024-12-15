package pe.edu.i202224977.ef_joseAhumada.response;

import pe.edu.i202224977.ef_joseAhumada.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
