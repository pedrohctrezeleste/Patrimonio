package github.com.pedrohctrezeleste.Patrimonio.Patrimonio.repository;


import github.com.pedrohctrezeleste.Patrimonio.Patrimonio.model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*
public class PatrimonioRepository {

}
*/

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {

}

