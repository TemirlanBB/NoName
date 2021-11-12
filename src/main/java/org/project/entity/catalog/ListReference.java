package org.project.entity.catalog;


import lombok.Getter;
import lombok.Setter;
import org.project.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class ListReference extends BaseEntity {

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", insertable = false, updatable = false)
    private ListReferenceType type;
}
