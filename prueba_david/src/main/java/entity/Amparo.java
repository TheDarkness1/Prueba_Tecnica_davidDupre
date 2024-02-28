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
@Table(name = "Amparo")
@Setter
@Getter
public class Amparo {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "codigo")
    private int codigo;
    @Column (name = "nombre")
    private String nombre;
}
