/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicempl;

import Implementacion_Service.PrimaService;
import Implementacion_Service.AmparoService;
import Implementacion_Service.AseguradoService;
import entity.Amparo;
import entity.AmparoDTO;
import entity.Asegurado;
import entity.Prima;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class Polizampl {
    
    @Autowired
    private AmparoService amparoservice;
    @Autowired
    private AseguradoService aseguradoservice;
    @Autowired
    private PrimaService primaservice;
    
    public SalidaDTO calcularPoliza(int tipo, int numero, int valor){
        salidaDTO salidaDTO =new SalidaDTO();
       float valorTotal = 0;       
         
               Optional<Asegurado> asegurado = aseguradoservice.buscarPorTipoYNumero(tipo, numero);

        if (asegurado.isPresent()) {
            salidaDTO.setTipoIdentificacion(tipo);
            salidaDTO.setNumeroIdentificacion(numero);
            salidaDTO.setValorAsegurado(valor);

            List<Integer> amparos = asegurado.get().getListaAmparosAsList();
            List<Prima> list = new ArrayList<>();
            List<AmparoDTO> list2 = new ArrayList<>();

            for (int i : amparos) {
                list.addAll(primaService.buscarPorCodigoAmparo(i));
            }
            LocalDate fechaNacimiento = asegurado.get().getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Period periodo = Period.between(fechaNacimiento, LocalDate.now());
            int edad = periodo.getYears();

            for (Prima p : list) {
                if (p.getEdadMinima() < edad && p.getEdadMaxima() > edad) {
                    AmparoDTO amparoDTO = new AmparoDTO();
                    amparoDTO.setCodigoAmparo(p.getCodigoAmparo());

                    Optional<Amparo> amparo = amparoService.buscarPorCodigo(p.getCodigoAmparo());
                    if (amparo.isPresent()) {
                        amparoDTO.setNombreAmparo(amparo.get().getNombre());
                        amparoDTO.setValorPrima(p.getPorcentajePrima() * valor);
                        valorTotal += (p.getPorcentajePrima() * valor);
                    }
                    list2.add(amparoDTO);
                }
            }

            salidaDTO.setLiquidacion(list2.isEmpty() ? null : list2);
            salidaDTO.setValorTotal(valorTotal);
        }
        return salidaDTO;
    }
}

