package com.back11.portafolio.Entity;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    @Size(min = 1, max = 50, message = "no cumple con longitud")
    private String nombre;

    @Nonnull
    @Size(min = 1, max = 50, message = "no cumple con longitud")
    private String apellido;

    
    @Size(min = 1, max = 50, message = "no cumple con longitud")
    private String img;

}
