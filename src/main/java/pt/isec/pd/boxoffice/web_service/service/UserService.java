package pt.isec.pd.boxoffice.web_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.isec.pd.boxoffice.web_service.model.Reserva;
import pt.isec.pd.boxoffice.web_service.model.Utilizador;
import pt.isec.pd.boxoffice.web_service.repository.ReservaRepository;
import pt.isec.pd.boxoffice.web_service.repository.UtilizadorRepository;

import java.util.List;

@Service
public class UserService
{
    private UtilizadorRepository userRepository;
    private ReservaRepository reserveRepository;


    @Autowired
    public UserService(UtilizadorRepository userRepository, ReservaRepository reserveRepository)
    {
        this.userRepository = userRepository;
        this.reserveRepository = reserveRepository;
    }

    public Utilizador createUser(Utilizador user)
    {
        user.setId(null);
        return userRepository.save(user);
    }

    public Utilizador deleteUser(Integer id)
    {
        Utilizador curUser = userRepository.findById(id).get();
        userRepository.deleteById(id);
        return curUser;
    }
    public boolean checkUserLogIn(String username, String password)
    {
        List<Utilizador> user = userRepository.findByUsernameAndPassword(username, password);
        if(user.size() > 0){
            return true;
        }
        return false;
    }

    public List<Utilizador> getAllUsers()
    {
        return userRepository.findAll();
    }

    public List<Reserva> getPaidReservations(String username) {
        return reserveRepository.findByPagoAndId_utilizador(true, userRepository.findByUsername(username).get(0).getId());

    }

    public List<Reserva> getWaitPaidReservations(String username) {
        return reserveRepository.findByPagoAndId_utilizador(false, userRepository.findByUsername(username).get(0).getId());

    }




/*
    public List<Contact> getContactsByEmail(String email)
    {
        return contactRepository.findByEmail(email);
    }

    public List<Contact> getContactsByPhoneNumber(String phoneNumber)
    {
        return contactRepository.findByPhoneNumber(phoneNumber);
    }

    public List<Contact> getAllPortugueseContacts()
    {
        return contactRepository.findPortuguesePhoneNumbers();
    }*/
}

