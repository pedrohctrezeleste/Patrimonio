package github.com.pedrohctrezeleste.Patrimonio.Patrimonio.service;

import github.com.pedrohctrezeleste.Patrimonio.Patrimonio.model.Patrimonio;
import github.com.pedrohctrezeleste.Patrimonio.Patrimonio.repository.PatrimonioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatrimonioService {

    @Autowired

    private PatrimonioRepository repository;

    public List<Patrimonio>listarTodos(){
        return repository.findAll();

    }

    public Optional<Patrimonio>BuscarPorId(Long Id){
        return repository.findById(Id);
    }

    public Patrimonio Salvar(Patrimonio patrimonio){
        return repository.save(patrimonio);
    }

    public void deletar(long Id){
        repository.deleteById(Id);
    }


}
