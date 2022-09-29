package Com.IncSilence.BACK_TFG.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.IncSilence.BACK_TFG.entity.Trabajador;

public interface TrabajadorDao extends JpaRepository<Trabajador, Long> {
    
}
