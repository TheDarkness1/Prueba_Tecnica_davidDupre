/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Asegurado")
@Setter
@Getter
public class Asegurado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "tipo_Identificacion")
    private int tipo_Identificacion;
    
    @Column(name = "numero_Identificacion")
    private int numero_Identificacion;
    
    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "sexo")
    private int sexo;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    @Column(name = "fecha_Nacimiento")
    private Date fechaNacimiento;
    
    @Column(name ="listaAmparos")
    private int listaAmparos;
    
    @JsonIgnore
    public List<Integer> getListaAmparosAsList() {
        if (listaAmparos != null && !listaAmparos.isEmpty()) {
            return Arrays.stream(listaAmparos.split(","))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } else {
            return null;
        }
    }
      
}
