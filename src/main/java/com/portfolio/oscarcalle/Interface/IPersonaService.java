package com.portfolio.oscarcalle.Interface;

import com.portfolio.oscarcalle.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Listar personas
    public List<Persona> getPersona();
    
    //Guardar un entidad de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
