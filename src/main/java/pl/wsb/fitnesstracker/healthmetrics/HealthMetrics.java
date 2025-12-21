package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.persistence.*;
import lombok.Getter;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;

/**
 * The type Health metrics.
 */
/* Entity class representing health metrics.
 * To be implemented with appropriate fields and methods.
 */
@Entity
@Table(name = "Health_Metrics")
@Getter
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column
    private Double weight;

    @Column
    private Double height;

    @Column(name = "heart_rate")
    private Integer heartRate;

    /**
     * Instantiates a new Health metrics.
     */
    public HealthMetrics() {
    }

    /**
     * Instantiates a new Health metrics (Constructor)
     *
     * @param user      the user
     * @param date      the date
     * @param weight    the weight
     * @param height    the height
     * @param heartRate the heart rate
     */
    public HealthMetrics(User user, LocalDate date, Double weight, Double height, Integer heartRate) {
        this.user = user;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }


}
