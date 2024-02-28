/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicempl;

import Implementacion_Service.AmparoService;
import Repository.AmparoRepo;
import entity.Amparo;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Usuario
 */
@Service
public class AmparoServmpl implements AmparoService {
    @Autowired
    private AmparoRepo repo;
    
    public List<Amparo> listarAmaparo(){
    return (List<Amparo>)this.repo.findAll();
    }
    
    @Override
    public Optional<Amparo> buscarPorCodigo(int codigo) {
    return this.repo.findByCodigo(codigo);
    }

    @Override
    public List<Amparo> listarAmparos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
