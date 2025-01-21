package luisloor.api.repositorios;
import luisloor.api.modelos.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<topicos, Integer> {
}
