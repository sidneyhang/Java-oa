package com.tinthon.repository;

import com.tinthon.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sidney on 2017/2/23.
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByAccount(String account);
}
