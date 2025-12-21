package pl.wsb.fitnesstracker.training.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Training repository.
 */
public interface TrainingRepository extends JpaRepository<Training, Long> {
}
