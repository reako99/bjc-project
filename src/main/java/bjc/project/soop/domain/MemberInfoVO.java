package bjc.project.soop.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
@Table(name="member_info")
public class MemberInfoVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String profileImage;
    private Date birth;
    private String address;
    private String phone;
    private String email;
}
