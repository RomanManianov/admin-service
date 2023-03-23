package hah.common.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class AdminStreamerLinkDto {
    private String superAdminCode;
    private String adminCode;
    private String streamerCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;
}
