package ie.atu.lab2;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class User
{
    private String name;
    private String email;
}
