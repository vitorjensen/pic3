package com.pic3.pic3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChartRepository extends JpaRepository<Aluguel, Long> {
@Query(value = """
SELECT DATE_FORMAT(a.alu_data_inicial, '%Y-%m') AS mes,
    SUM(a.alu_valor) AS total
    FROM tb_aluguel a
    GROUP BY DATE_FORMAT(a.alu_data_inicial, '%Y-%m')
    ORDER BY mes
    """, nativeQuery = true)
List<Object[]> getAlugueisPorMes();
}
