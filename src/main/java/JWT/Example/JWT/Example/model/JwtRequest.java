package JWT.Example.JWT.Example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {

    private String email;

    public String getEmail() {
        return email;
    }

    public JwtRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
