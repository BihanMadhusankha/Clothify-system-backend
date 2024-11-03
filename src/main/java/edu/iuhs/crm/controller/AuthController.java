package edu.iuhs.crm.controller;

import edu.iuhs.crm.modle.Auth;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    @PostMapping
    Auth persist(@RequestBody Auth auth){
        log.info("Author{}",auth);
        return auth;
    }
}
