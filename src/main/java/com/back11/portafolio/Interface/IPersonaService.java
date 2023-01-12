package com.back11.portafolio.Interface;

import java.util.List;
import com.back11.portafolio.Entity.Persona;


public interface IPersonaService {

    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
    
}
