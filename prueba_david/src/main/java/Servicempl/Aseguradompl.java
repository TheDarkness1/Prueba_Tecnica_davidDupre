/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicempl;

import Implementacion_Service.AseguradoService;
import Repository.AseguradoRepo;
import Repository.PrimaRepo;
import entity.Asegurado;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Aseguradompl implements AseguradoService{
    @Autowired
    private AseguradoRepo aseguradoRepo;
    @Autowired
    private PrimaRepo primaRepo;

    @Override
    public List<Asegurado> listarAsegurado(){
        return (List<Asegurado>) this.aseguradoRepo.findAll();
    }
    
    @Override
    public Optional<Asegurado> buscarPorTipoYNumero(int tipo, int numero) {
        return this.aseguradoRepo.findByTipoIdentificacionAndNumeroIdentificacion(tipo, numero);
    }
}
