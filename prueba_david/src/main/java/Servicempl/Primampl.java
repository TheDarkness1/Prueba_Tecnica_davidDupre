/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicempl;

import Implementacion_Service.PrimaService;
import Repository.PrimaRepo;
import entity.Prima;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Primampl implements PrimaService{
    
    @Autowired
    private PrimaRepo repo;
    
    @Override
    public List <Prima> listarPrima(){
        return (List<Prima>) this.repo.findAll();
    }
    
    @Override
    public List<Prima> buscarPorCodigoAmparo(int codigoAmparo) {
        List<Prima> list = new ArrayList<>();
        for(Prima p : listarPrima()){
            if(codigoAmparo == p.getCodigoAmparo()){
                list.add(p);
            }
        }
        return list;
    }        
}
