package pt.isec.pd.boxoffice.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isec.pd.boxoffice.web_service.model.Espetaculo;

import java.util.List;

public interface EspetaculoRepository  extends JpaRepository<Espetaculo, Integer> {
    //List<Espetaculo> findByData_horaBetweenDateStartAndDateEnd(String dateStart, String dateEnd);
    //TODO meter query
}
