package pl.wsb.fitnesstracker.statistics.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Statistics repository.
 */
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
