package pt.isec.pd.boxoffice.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isec.pd.boxoffice.web_service.model.Reserva;
import pt.isec.pd.boxoffice.web_service.model.Utilizador;

import java.util.List;

public interface UtilizadorRepository extends JpaRepository<Utilizador, Integer> {

    //TODO se nao der mete a query

    List<Utilizador> findByUsernameAndPassword(String username, String password);

    List<Utilizador> findByUsername(String username);
}
