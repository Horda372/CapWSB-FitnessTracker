package pl.wsb.fitnesstracker.mail.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The type Mail config.
 */
@Configuration
@EnableConfigurationProperties(MailProperties.class)
class MailConfig {

}
