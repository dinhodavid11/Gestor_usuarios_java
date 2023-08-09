package proyecto.gestor_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.gestor_usuarios.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}