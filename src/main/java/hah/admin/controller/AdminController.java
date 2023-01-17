package hah.admin.controller;


import hah.admin.controller.api.AdminControllerApi;
import hah.streamer.dto.Streamer;
import hah.streamer.logic.GetAllStreamersOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController implements AdminControllerApi {
    private final GetAllStreamersOperation getAllStreamersOperation;

    @Override
    public ResponseEntity<List<Streamer>> getAllStreamers(Long id) {
        return ResponseEntity.ok(getAllStreamersOperation.getAllStreamersByAdminId(id));
    }
}
