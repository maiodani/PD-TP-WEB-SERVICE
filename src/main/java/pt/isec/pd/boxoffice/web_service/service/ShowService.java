package pt.isec.pd.boxoffice.web_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.isec.pd.boxoffice.web_service.model.Espetaculo;
import pt.isec.pd.boxoffice.web_service.repository.EspetaculoRepository;

import java.util.List;

@Service
public class ShowService{
    private EspetaculoRepository espetaculoRepository;

    @Autowired
    public ShowService(EspetaculoRepository espetaculoRepository){
        this.espetaculoRepository = espetaculoRepository;
    }

    public List<Espetaculo> getShows(String dateStart, String dateEnd) {
        return null;
    }
}
