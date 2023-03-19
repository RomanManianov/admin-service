package hah.streamer.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.File;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "streamers")
@Accessors(chain = true)
public class StreamerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String adminCode;

    @Column(name = "username")
    public String username;

    public String role;

    public String code;

    public String superAdminCode;

    public String name;

    public Integer age;

    public File photo;

    @Column(name = "registration_date")
    public LocalDateTime regDate;

    public String inviter;

    @Column(name = "single_use_password")
    public String singleUserPassword;

    @Column(name = "donate_balance")
    public String donateBalance;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "active")
    public boolean isActive;
}
