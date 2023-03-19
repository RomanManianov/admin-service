package hah.admin.enitiy;

import hah.streamer.entity.StreamerEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "admins")
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "username")
    public String userName;

    public String role;

    public String code;

    public String superAdminCode;

    //todo: написать дто и сущность для связей
//    @ManyToMany
//    public List<StreamerEntity> streamers;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "active")
    public boolean isActive;
}
