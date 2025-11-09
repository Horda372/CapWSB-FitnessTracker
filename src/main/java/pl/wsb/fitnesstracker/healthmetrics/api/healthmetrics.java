package pl.wsb.fitnesstracker.healthmetrics.api;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Healthmetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class healthmetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User userID;

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "height", nullable = false)
    private int height;

    @Column(name = "heartRate", nullable = false)
    private int heartRate;

    public healthmetrics(int weight, int height, int heartRate) {
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }
}