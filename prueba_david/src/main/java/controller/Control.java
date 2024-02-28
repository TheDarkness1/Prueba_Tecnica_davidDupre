/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Implementacion_Service.AmparoService;
import Implementacion_Service.AseguradoService;
import Implementacion_Service.PrimaService;
import entity.Asegurado;
import entity.EntradaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@ResquestMapping("")
public class Control {
    
    @Autowired
    private AseguradoService aseguradoService;
    
    @Autowired
    private PrimaService primaservice;
    
    @Autowired
    private AmparoService amparoservice;
    
    @Autowired
    private PolizaService polizaservice;
    
    @GetMapping("/buscarAsegurado/{tipo_Identificacion}/{Numero_identificacion}")
        public ResponseEntity<?> buscarAseguradoPorTipoYNumero(
            @PathVariable int Tipo_Identificacion,
            @PathVariable int Numero_Identificacion) {
        Optional<Asegurado> asegurado = aseguradoService.buscarPorTipoYNumero(Tipo_Identificacion, Numero_Identificacion);

        if (asegurado.isPresent()) {
            return ResponseEntity.ok(asegurado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
        
    @GetMapping("/liquidacion")
    public ResponseEntity<?> liquidacion(@ResquestBody EntradaDTO entradaDTO){
                if( entradaDTO.getNumero_Identificacion() 0 &&
                entradaDTO.getNumero_Identificacion() > 0 &&
                entradaDTO.getValorAsegurado() > 0) {
        if (aseguradoService.buscarPorTipoYNumero(entradaDTO.getTipo_Idendificacion(), entradaDTO.getNumero_Identificacion()).ispresent()){
            SalidaDTO salidaDTO = PolizaService.calcularPoliza(
            entradaDTO.getTipo_Identificacion(),
            entradaDTO.getNumero_Identificacion(),
            entradaDTO.getValorAsegurado()
            );
        try{
            return ResponseEntity.ok(salidaDTO.toJSON());
        } catch (JsonProcesssingException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la liquidación");
        }
      }
    }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la liquidación");
    }
    
    @GetMapping("/listarAsegurados")
    public ResponseEntity<?> listarAsegurados(){
        List<Asegurado> listaAsegurados= this.asegServ.listarAsegurados();
        return ResponseEntity.ok(listaAsegurados);
            }
    
    @GetMapping("/listarPrima")
    public ResponseEntity<?> listarPrima(){
                List<Prima> listaPrima =this.primaService.listarPrimas();
                return ResponseEntity.ok(listaPrima);
            }
    @GetMapping("/ListarAmparo")
    publicResponseEntity<?> listarAmparo(){
        list<Amparo>ListaAmparos = this.amaparoService.listarAmparo();
        return ResponseEntity.ok(listaAmparos);
            }
    
    
}

    private static class Optional<T> {

        public Optional() {
        }
    }
}
