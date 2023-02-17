package hah.adminEntity;
import hah.streamer.Entity.StreamerEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "admins")
public class adminsEntity {

    public Long id;

    @Column(name = "username")
    public String userName;

    public String role;

    public List<StreamerEntity> streamers;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "is_active")
    public boolean isActive;
}
