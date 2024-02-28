/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Implementacion_Service;

import entity.Amparo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface AmparoService {
    
        List<Amparo> listarAmparos();



    Optional<Amparo> buscarPorCodigo(int codigo);
}
