/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import entity.Amparo;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface AmparoRepo extends CrudRepository<Amparo, Integer>{
    Optional<Amparo> findByCodigo(int codigo);
    
}
