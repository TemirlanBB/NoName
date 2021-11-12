package org.project.entity.base;


import lombok.Getter;
import lombok.Setter;
import org.project.utils.Constants;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = Constants.DATE_TIME_SEC)
    private LocalDateTime createdTime;

    private LocalDateTime updateTime;

    public void prePersist() {
        this.createdTime = LocalDateTime.now();
    }

    public void preUpdate(){
        this.createdTime = LocalDateTime.now();
    }

}
