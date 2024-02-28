/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Implementacion_Service;

import entity.Prima;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface PrimaService {
    
    /**
     * Obtiene una lista de todas las primas disponibles.
     *
     * @return Lista de primas.
     */
    List<Prima> listarPrima();

    /**
     * Busca primas por el código de amparo.
     *
     * @param codigoAmparo Código del amparo.
     * @return Lista de primas asociadas al código de amparo.
     */
    List<Prima> buscarPorCodigoAmparo(int codigoAmparo);
}
