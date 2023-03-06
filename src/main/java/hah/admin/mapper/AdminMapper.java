package hah.admin.mapper;

import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AdminMapper {

    public AdminEntity map(AdminDto adminDto) {
        return new AdminEntity()
                .setUserName(adminDto.userName())
                .setRole(adminDto.getRole())
                .setSuperAdminCode(adminDto.getSuperAdminCode())
                .setCreatedAt(LocalDateTime.now())
                .setUpdatedAt(LocalDateTime.now())
                .setActive(true);
    }
}
