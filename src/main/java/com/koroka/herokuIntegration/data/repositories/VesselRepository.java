package com.koroka.herokuIntegration.data.repositories;

import com.koroka.herokuIntegration.data.entities.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepository extends JpaRepository<Vessel, Long> {
}
