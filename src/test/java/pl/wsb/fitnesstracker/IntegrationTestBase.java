package pl.wsb.fitnesstracker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.fitnesstracker.training.api.Training;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.List;

/**
 * The type Integration test base.
 */
@SpringBootTest
@AutoConfigureMockMvc
public abstract class IntegrationTestBase {

    @Autowired
    private JpaRepository<User, Long> userRepository;

    @Autowired
    private JpaRepository<Training, Long> trainingRepository;

    /**
     * Clean up.
     */
    @AfterEach
    void cleanUp() {
        cleanDatabase();

    }

    private void cleanDatabase() {
        trainingRepository.deleteAll();
        userRepository.deleteAll();
    }

    /**
     * Sets up.
     */
    @BeforeEach
    public void setUp() {

        cleanDatabase();

    }

    /**
     * Persist training training.
     *
     * @param training the training
     * @return the training
     */
    protected Training persistTraining(Training training) {
        return trainingRepository.save(training);
    }

    /**
     * Existing user user.
     *
     * @param user the user
     * @return the user
     */
    protected User existingUser(User user) {

        return userRepository.save(user);
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    protected List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Create all trainings list.
     *
     * @param trainings the trainings
     * @return the list
     */
    protected List<Training> createAllTrainings(List<Training> trainings) {

        trainings.forEach(training -> trainingRepository.save(training));
        return trainings;
    }

    /**
     * Gets all trainings.
     *
     * @return the all trainings
     */
    protected List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }


}
