package dao;

import com.tienda.Tienda.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
