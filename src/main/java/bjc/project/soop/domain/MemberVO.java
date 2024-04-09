package bjc.project.soop.domain;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="members")
public class MemberVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String password;
    private String role;
    private String enabled;

}
