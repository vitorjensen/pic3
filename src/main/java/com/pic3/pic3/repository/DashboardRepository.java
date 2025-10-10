package com.pic3.pic3.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class DashboardRepository {

    @PersistenceContext
    private EntityManager em;

    public Long countTotalItens() {
        return ((Number) em.createNativeQuery("SELECT COUNT(*) FROM tb_produto").getSingleResult()).longValue();
    }

    public Long countAlugueisAtivos() {
        return ((Number) em.createNativeQuery("SELECT COUNT(*) FROM tb_aluguel WHERE alu_status = 'LOCADO'").getSingleResult()).longValue();
    }

    public Long countFornecedores() {
        return ((Number) em.createNativeQuery("SELECT COUNT(*) FROM tb_fornecedor").getSingleResult()).longValue();
    }

    public Long countCliente() {
        return ((Number) em.createNativeQuery("SELECT COUNT(*) FROM tb_cliente").getSingleResult()).longValue();
    }

}
