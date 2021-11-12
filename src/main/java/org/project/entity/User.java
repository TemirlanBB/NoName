package org.project.entity;

import lombok.Getter;
import lombok.Setter;
import org.project.entity.base.BaseEntity;
import org.project.entity.catalog.ListReference;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sex")
    private ListReference sex;

}
