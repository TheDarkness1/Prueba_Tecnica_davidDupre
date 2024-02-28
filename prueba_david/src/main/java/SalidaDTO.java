package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.AmparoDTO;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalidaDTO {
    
    this.liquidacion = null;
    }

    private int tipo_Identificacion;
    private int numero_Identificacion;
    private int valorAsegurado;
    private List<AmparoDTO> liquidacion;
    private float valorTotal;

    public String toJSON() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    List<SalidaDTO> listaSalidaDTO = Collections.singletonList(this);
    return mapper.writeValueAsString(listaSalidaDTO);
    
}
