package com.pic3.pic3.repository;
import com.pic3.pic3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// --- Criando a "ponte" entre o banco de dados e o código, através dessa interface ---
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
