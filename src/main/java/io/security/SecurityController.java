package io.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

  @GetMapping("/")
  public ResponseEntity<String> index() {
    return ResponseEntity.ok("Root");
  }
}
