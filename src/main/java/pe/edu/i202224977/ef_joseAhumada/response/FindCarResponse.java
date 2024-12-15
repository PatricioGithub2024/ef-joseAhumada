package pe.edu.i202224977.ef_joseAhumada.response;

import pe.edu.i202224977.ef_joseAhumada.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
