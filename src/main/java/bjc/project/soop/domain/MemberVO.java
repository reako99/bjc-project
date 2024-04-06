package bjc.project.soop.domain;


import jakarta.persistence.*;

@Entity
@Table(name="members")
public class MemberVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nickname;
    private String password;
    private String role;
    private boolean enabled;

}