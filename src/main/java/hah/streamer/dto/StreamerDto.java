package hah.streamer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.time.LocalDateTime;

@Getter
@Setter
public class StreamerDto {
    private String donate;
    private String role;
    private String adminCode;
    private String username;
    private String code;
    private String name;
    private Integer age;
    private File photo;
    private LocalDateTime regDate;
    private String inviter;
    private String singleUserPassword;
    private String donateBalance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;
}
