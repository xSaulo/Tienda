package com.tienda.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="cliente") //objetos de registros asociados a la table de la base de datos
public class Cliente implements Serializable{
   private static final long serialVersionUID= 1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // java no va a generar el numero, que lo haga la base de datos
   private Long idCliente; //cuando estamos en el mundo de base de datos se separan palbars con :   en el mundo de clases y objetos La C mayuscula lo interpreta como el _ id_cliente (bd) idCliente (java)
   
   private String nombre;
   private String apellidos;
   private String correo;
   private String telefono;

    public Cliente() {
        
        
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
   
   
}
