package com.dimevision.repository;

import com.dimevision.model.entity.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Investor, Integer> {
}