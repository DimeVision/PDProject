package com.dimevision.repository;

import com.dimevision.model.entity.Startup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dimevision
 * @version 0.1
 */

public interface StartupRepository extends JpaRepository<Startup, Long> {
}
