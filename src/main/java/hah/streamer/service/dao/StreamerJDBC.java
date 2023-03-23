package hah.streamer.service.dao;

import hah.common.dto.AdminStreamerLinkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StreamerJDBC {

    private final JdbcTemplate jdbcTemplate;

    public void addNewAdminStreamerLink(AdminStreamerLinkDto linkDto) {
        jdbcTemplate.execute(addNewAdminStreamerLinkScript(linkDto));
    }

    private String addNewAdminStreamerLinkScript(AdminStreamerLinkDto linkDto) {
        return """
                insert into wc_hub.admins_streamers
                (super_admin_code, admin_code, streamer_code, created_at, active)
                values('getSuperAdminCode', 'getAdminCode', 'getStreamerCode', 'getCreatedAt', isActive);
                """
                .replace("getAdminCode", linkDto.getAdminCode())
                .replace("getSuperAdminCode", linkDto.getSuperAdminCode())
                .replace("getStreamerCode", linkDto.getStreamerCode())
                .replace("getCreatedAt", linkDto.getCreatedAt().toString())
                .replace("isActive", String.valueOf(linkDto.isActive()));
    }
}
