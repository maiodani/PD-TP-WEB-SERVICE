package pt.isec.pd.boxoffice.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pt.isec.pd.boxoffice.web_service.model.Reserva;
import pt.isec.pd.boxoffice.web_service.model.Utilizador;

import java.util.List;

public interface ReservaRepository  extends JpaRepository<Reserva, Integer> {
    //TODO ver como meter parametros
    @Query("SELECT r FROM Reserva r WHERE r.pago = ?1 AND r.id_utilizador = ?2")
    List<Reserva> findByPagoAndId_utilizador(Boolean b, Integer id_utilizador);
}
