package bjc.project.soop.domain;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Setter
@Table(name="members")
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String password;
    private String role;
    private String enabled;

}
