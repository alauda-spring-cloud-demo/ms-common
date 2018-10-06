package demo.ms.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "authorities")
@Entity
@Getter
@Setter
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String authority;
}
