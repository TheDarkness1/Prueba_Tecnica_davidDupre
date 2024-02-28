/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Implementacion_Service;

import entity.Asegurado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 */
public interface AseguradoService {
    /**
     * Obtiene una lista de todos los asegurados disponibles.
     *
     * @return Lista de asegurados.
     */
    List<Asegurado> listarAsegurado();

    /**
     * Busca un asegurado por su tipo y número de identificación.
     *
     * @param tipo   Tipo de identificación del asegurado.
     * @param numero Número de identificación del asegurado.
     * @return Una instancia de Optional que contiene el asegurado si se encuentra, o vacío si no.
     */
    Optional<Asegurado> buscarPorTipoYNumero(int tipo, int numero);
}
