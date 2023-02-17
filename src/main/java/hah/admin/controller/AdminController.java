package hah.admin.controller;


import hah.admin.controller.api.AdminControllerApi;
import hah.streamer.dto.StreamerDto;
import hah.streamer.logic.GetAllStreamersOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController implements AdminControllerApi {
    private final GetAllStreamersOperation getAllStreamersOperation;

    @Override
    public ResponseEntity<List<StreamerDto>> getAllStreamers(Long id) {
        return ResponseEntity.ok(getAllStreamersOperation.getAllStreamersByAdminId(id));
    }
}
