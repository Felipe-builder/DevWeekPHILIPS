package com.dio_class.devweek.Repository;

import com.dio_class.devweek.Entity.FaixaEtaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaixaEtariaRepository extends JpaRepository<FaixaEtaria, Long> {
}
