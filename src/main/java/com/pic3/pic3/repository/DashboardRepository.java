package com.pic3.pic3.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DashboardRepository extends CrudRepository<Object, Long> {
    @Query(value = "SELECT COUNT(*) FROM tb_produto", nativeQuery = true)
    Long getTotalItens();


}
