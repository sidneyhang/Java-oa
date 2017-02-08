package com.tinthon.repository;

import com.tinthon.beans.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sidney on 2017/2/7.
 */
public interface SpitterRepo extends JpaRepository<Spitter, Long> {
    Spitter findByUsername(String username);
}
