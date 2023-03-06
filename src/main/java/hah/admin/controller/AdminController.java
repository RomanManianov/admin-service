package hah.admin.controller;


import hah.admin.controller.api.AdminControllerApi;
import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import hah.admin.logic.CreateAdminOperation;
import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import hah.streamer.logic.CreateStreamerOperation;
import hah.streamer.logic.GetAllStreamersOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController implements AdminControllerApi {
    private final GetAllStreamersOperation getAllStreamersOperation;
    private final CreateStreamerOperation createStreamerOperation;
    private final CreateAdminOperation createAdminOperation;

    @Override
    public ResponseEntity<List<StreamerEntity>> getAllStreamers(String adminCode) {
        return ResponseEntity.ok(getAllStreamersOperation.getAllStreamersByAdminCode(adminCode));
    }

    @Override
    public ResponseEntity<StreamerEntity> createStreamer(StreamerDto streamerDto) {
        return ResponseEntity.ok(createStreamerOperation.process(streamerDto));
    }

    @Override
    public ResponseEntity<AdminEntity> createAdmin(AdminDto adminDto) {
        return ResponseEntity.ok(createAdminOperation.process(adminDto));
    }
}
