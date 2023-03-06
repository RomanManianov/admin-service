package hah.streamer.logic;

import hah.streamer.entity.StreamerEntity;
import hah.streamer.service.dao.StreamerDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllStreamersOperation {

    private final StreamerDaoAdapter streamersDaoAdapter;

    public List<StreamerEntity> getAllStreamersByAdminCode(String adminCode) {
        return streamersDaoAdapter.getAllStreamersByAdminCode(adminCode);
    }
}