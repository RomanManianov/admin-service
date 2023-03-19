package hah.admin.enitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "super_admin")
public class SuperAdminEntity {

    @Id
    public Long id;

    @Column(name = "username")
    public String userName;

    public String role;

    public String adminCode;

    //todo: написать дто и сущность для связей
//
//    @OneToMany
//    public List<StreamerEntity> streamers;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "is_active")
    public boolean isActive;
}
