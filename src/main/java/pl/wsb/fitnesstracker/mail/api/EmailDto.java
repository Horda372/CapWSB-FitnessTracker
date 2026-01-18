package pl.wsb.fitnesstracker.mail.api;

/**
 * The type Email dto.
 */
public record EmailDto(String toAddress, String subject, String content) {

}
