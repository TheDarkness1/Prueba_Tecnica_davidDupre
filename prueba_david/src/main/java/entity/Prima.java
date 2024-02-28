/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Prima")
@Setter
@Getter
public class Prima {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "codigoAmparo")
    private int codigoAmparo;

    @Column(name = "Edad_Minima")
    private int Edad_Minima;

    @Column(name = "Edad_Maxima")
    private int Edad_Maxima;

    @Column(name = "Porcentaje_Prima")
    private float Porcentaje_Prima;
}
