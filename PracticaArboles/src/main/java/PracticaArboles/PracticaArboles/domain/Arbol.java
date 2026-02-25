/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaArboles.PracticaArboles.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbol;

    private String nombreComun;
    private String tipoFlor;
    private Integer durezaMadera;
    private Double alturaPromedio;
    private String rutaImagen;
}