package com.api.cavaleiros.repositorio;

import com.api.cavaleiros.dominio.Cavaleiro;
import com.api.cavaleiros.dominio.DeusProtetor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CavaleiroRepository extends JpaRepository<Cavaleiro, Integer> {

    @Modifying
    @Transactional
    @Query("update Cavaleiro c set c.ataque = ?1 where c.id = ?2")
    void atualizarForca(Double novaForca, Integer id);

    boolean existsById(int id);

}
