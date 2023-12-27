package david.Springdockerawscicd.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Member
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
