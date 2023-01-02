package pt.isec.pd.boxoffice.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pt.isec.pd.boxoffice.web_service.model.Espetaculo;

import java.util.List;

public interface EspetaculoRepository  extends JpaRepository<Espetaculo, Integer> {
    @Query("SELECT s FROM Espetaculo s WHERE s.data_hora > ?1 AND s.data_hora < ?2")
    List<Espetaculo> findByData_horaBetweenDateStartAndDateEnd(String dateStart, String dateEnd);

}
