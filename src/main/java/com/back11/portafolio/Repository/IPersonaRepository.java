package com.back11.portafolio.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.back11.portafolio.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    List<Persona> findAll();
    
}
