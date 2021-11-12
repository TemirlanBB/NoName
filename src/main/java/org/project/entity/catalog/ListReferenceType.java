package org.project.entity.catalog;

import lombok.Getter;
import lombok.Setter;
import org.project.entity.base.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class ListReferenceType extends BaseEntity {

    private String title;
}
