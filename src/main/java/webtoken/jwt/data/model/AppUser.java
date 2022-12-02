package webtoken.jwt.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
//jason web token is a way for application to transmit information and communication with each other.
// Jwt is used to provide authentication and authorization
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser  {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
private String name;
    private  String userName;
    private  String email;
    private String password;
@ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

}

