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

    public Double receitaMensal() {
        return ((Number) em.createNativeQuery("""
            SELECT COALESCE(SUM(alu_valor), 0)
            FROM tb_aluguel 
            WHERE MONTH(alu_data_inicial) = MONTH(CURRENT_DATE()) 
              AND YEAR(alu_data_inicial) = YEAR(CURRENT_DATE())
        """).getSingleResult()).doubleValue();
    }

}
