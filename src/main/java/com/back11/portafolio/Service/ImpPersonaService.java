package com.back11.portafolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back11.portafolio.Entity.Persona;
import com.back11.portafolio.Interface.IPersonaService;
import com.back11.portafolio.Repository.IPersonaRepository;


@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    /* (non-Javadoc)
     * @see com.back11.portafolio.Interface.IPersonaService#savePersona(com.back11.portafolio.Entity.Persona)
     */
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    
    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

}
