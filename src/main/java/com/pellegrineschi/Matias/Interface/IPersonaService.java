package com.pellegrineschi.Matias.Interface;

import com.pellegrineschi.Matias.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar una objeto pero lo traemos por id
    public void deletePersona(Long id);
    
    //burcar una persona por id
    public Persona findPersona(Long id);
    
}
