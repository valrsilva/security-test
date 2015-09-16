package br.com.vrosendo.securitytest.repository;

import br.com.vrosendo.securitytest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by valdeci on 30/08/2015.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(@Param("username") String username);

}
