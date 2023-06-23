package ru.baskaeva.moneytransferservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.baskaeva.moneytransferservice.dto.ConfirmationDTO;
import ru.baskaeva.moneytransferservice.dto.TransferDataDTO;
import ru.baskaeva.moneytransferservice.services.TransferService;

@Slf4j
@CrossOrigin(origins = "${frontend.endpoint}", allowCredentials = "true")
@RestController
public class TransferController {
    @Autowired
    public TransferService service;

    @PostMapping("/transfer")
    private ResponseEntity<?> transfer(@RequestBody TransferDataDTO transferData) {
        log.info("{}", transferData);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/confirmOperation")
    private ResponseEntity<?> confirmOperation(@RequestBody ConfirmationDTO confirmation) {
        log.info("{}", confirmation);

        if(confirmation.getOperationId().equals(null))
            return (ResponseEntity<?>) ResponseEntity.internalServerError();

        return ResponseEntity.ok().build();
    }
}