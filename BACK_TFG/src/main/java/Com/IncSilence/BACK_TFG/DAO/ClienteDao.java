package Com.IncSilence.BACK_TFG.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import Com.IncSilence.BACK_TFG.entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long>{
    
}
