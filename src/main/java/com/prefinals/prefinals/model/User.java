import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "userID")
    private int userID;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
}