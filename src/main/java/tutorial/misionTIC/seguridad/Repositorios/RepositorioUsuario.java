package tutorial.misionTIC.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.Query; //Guia 4.2
import tutorial.misionTIC.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
    // Guia 4.2:
    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);
}