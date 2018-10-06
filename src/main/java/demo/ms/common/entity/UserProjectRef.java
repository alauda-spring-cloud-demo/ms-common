package demo.ms.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="user_project_ref")
@Entity
@Getter
@Setter
public class UserProjectRef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="project_id")
    private Long projectId;

    @Column(name="user_id")
    private Long userId;

}
