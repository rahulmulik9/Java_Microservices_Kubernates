package com.rahul.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
  /* @Column(updatable = false)
     It tells JPA to exclude that column from the SQL UPDATE statement. The column is only written during INSERT.
     Used on createdAt and createdBy so they are set once and never changed.

     @Column(insertable = false)
     It tells JPA to exclude that column from the SQL INSERT statement.
     The column is only written during UPDATE. Used on updatedAt and updatedBy so they are only set when a record is modified.

    @CreatedDate / @LastModifiedDate → automatically fills timestamp (Spring handles this itself, no extra setup needed)
    @CreatedBy / @LastModifiedBy → automatically fills who did it, but Spring doesn't know who the current user is on its own — so it asks your AuditorAware<String> bean for that value.
    */

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    //createdBy handled by AuditAware
    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;
}