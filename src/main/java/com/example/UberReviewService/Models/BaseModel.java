package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class) // this annotation is providing a class to triggers when the below entity gets updated or created , it monitors the lifecyle of the entity
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate // only handle it for object creation
    @Column(nullable = false)
    protected Date createdAt;

    @Temporal(TemporalType.TIMESTAMP) // this annotation will tell the format in which we want to store
    @Column(nullable = false)
    @LastModifiedDate   // only handle it when object modified
    protected Date updatedAt;
}
