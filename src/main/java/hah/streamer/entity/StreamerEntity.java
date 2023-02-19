package hah.streamer.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.io.File;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "streamer")
public class StreamerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String userName;

    public String code;

    public String name;

    public Integer age;

    public File photo;

    @Column(name = "reg_date")
    public String regDate;

    public String inviter;

    @Column(name = "single_use_password")
    public String singleUserPassword;

    @Column(name = "donate_balance")
    public String donateBalance;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "is_active")
    public boolean isActive;
}
