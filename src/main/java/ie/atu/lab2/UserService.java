package ie.atu.lab2;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class UserService {
    private final EmailService emailService;
    private String name;
    private String email;


    public UserService() {
        emailService = new EmailService();
    }

    public String registerUser(String username, String email)
    {
       return emailService.sendEmail(email, " hello! " + username);
    }
}
