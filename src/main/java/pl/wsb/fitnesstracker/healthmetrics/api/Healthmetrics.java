package pl.wsb.fitnesstracker.healthmetrics.api;

import java.time.LocalDate;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "health_metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Healthmetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user_id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "height", nullable = false)
    private int height;

    @Column(name = "heartRate", nullable = false)
    private int heartRate;

}
