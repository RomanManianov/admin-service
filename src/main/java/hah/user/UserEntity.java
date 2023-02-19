package hah.user;
import hah.streamer.entity.StreamerEntity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String code;

    @Column(name = "donate_sum")
    public String donateSum;

    @Column(name = "max_donate")
    public String maxDonate;

    @Column(name = "last_donate")
    public String lastDonate;

    public List<StreamerEntity> streamers;

    @Column(name = "streamers_donate")
    public Map<StreamerEntity, String> streamersDonate;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "is_active")
    public boolean isActive;
}
