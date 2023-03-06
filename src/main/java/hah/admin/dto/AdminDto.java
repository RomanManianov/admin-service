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
public record AdminDto(
        Long id,
        String userName,
        String role,
        String superAdminCode,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        boolean isActive
) {
    //todo: написать дто для связей
//    public List<StreamerEntity> streamers;
}
