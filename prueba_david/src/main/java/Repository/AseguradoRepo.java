/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import entity.Asegurado;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface AseguradoRepo extends CrudRepository<Asegurado, Integer>{
    
    Optional<Asegurado> findByTipoIdentificacionAndNumeroIdentificacion(int tipo_Identificacion, int numero_Identificacion);
    
}
