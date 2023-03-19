package hah.admin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@RequiredArgsConstructor
public class AdminDto {
    private Long id;
    private String userName;
    private String code;
    private String role;
    private String superAdminCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;
    //todo: написать дто для связей
//    public List<StreamerEntity> streamers;
}
