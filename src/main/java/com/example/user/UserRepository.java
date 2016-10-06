package com.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jason, Moon
 * @since 2016-10-06
 */
@Repository
public interface UserRepository extends JpaRepository<LoginUserDetails, Long> {
    LoginUserDetails findByLoginId(String loginId);
}
