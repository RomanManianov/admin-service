package hah.streamer.logic;

import hah.streamer.entity.StreamerEntity;
import hah.streamer.service.dao.StreamersDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllStreamersOperation {

    private final StreamersDaoAdapter streamersDaoAdapter;

    public List<StreamerEntity> getAllStreamersByAdminCode(String adminCode) {
        return streamersDaoAdapter.getAllStreamersByAdminCode(adminCode);
    }
}