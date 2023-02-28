package hah.adminEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "admins")
public class adminsEntity {

    @Id
    public Long id;

    @Column(name = "username")
    public String userName;

    public String role;

    //todo: написать дто для связей
//    public List<StreamerEntity> streamers;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "is_active")
    public boolean isActive;
}
