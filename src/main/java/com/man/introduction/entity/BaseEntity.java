package com.man.introduction.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들도 칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class) // JPA에게 해당 Entity는 Auditing 기능을 사용한다고 알려줌
@Getter
public class BaseEntity {

    @CreationTimestamp // insert 시 자동으로 현재 시간이 들어감
    //다른 방법 : @PrePersist
    @Column(updatable = false) // update 시에는 값이 들어가지 않음
    private LocalDateTime createdTime;

    @UpdateTimestamp // update 시 자동으로 현재 시간이 들어감
    @Column(insertable = false) // insert 시에는 값이 들어가지 않음
    private LocalDateTime updatedTime;

}
