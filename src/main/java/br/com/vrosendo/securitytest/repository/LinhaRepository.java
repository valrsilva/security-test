package br.com.vrosendo.securitytest.repository;

import br.com.vrosendo.securitytest.entity.Linha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by valdeci on 30/08/2015.
 */
@Repository
public interface LinhaRepository extends JpaRepository<Linha, Long> {
}
