
package test;

import DAO.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernate {
    
    public static void main(String[] args) {
        
        PersonaDAO personadao = new PersonaDAO();
        
        personadao.listar();
        
        Persona persona = new Persona();
        
        persona.setIdPersona(6);
        
        persona = personadao.buscarPersonaxId(persona);
        
//        persona.setNombre("Alberto2");
//        persona.setApellido("Juarez2");
//        persona.setEmail("ab@go222ma");
//        persona.setTelefono("5322225");
        
//        personadao.insertar(persona);

//        personadao.modificar(persona);

//        personadao.elimianr(persona);
        
    }
    
}
