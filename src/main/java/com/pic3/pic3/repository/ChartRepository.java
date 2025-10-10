package com.pic3.pic3.repository;

import com.pic3.pic3.dto.AluguelMesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.pic3.pic3.model.Aluguel;

import java.util.List;

@Repository
public interface ChartRepository extends JpaRepository<Aluguel, Long> {

    @Query(value = """
        SELECT 
            MONTH(alu_data_inicial) AS mes,
            COALESCE(SUM(alu_valor), 0) AS total
        FROM tb_aluguel
        WHERE YEAR(alu_data_inicial) = YEAR(CURRENT_DATE())
        GROUP BY MONTH(alu_data_inicial)
        ORDER BY MONTH(alu_data_inicial)
        """, nativeQuery = true)
    List<Object[]> getAlugueisPorMes();
}
