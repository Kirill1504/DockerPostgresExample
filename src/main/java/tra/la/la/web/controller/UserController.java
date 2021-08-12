package tra.la.la.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tra.la.la.service.UserService;
import tra.la.la.web.dto.UserDto;

@RestController
@Slf4j
@RequiredArgsConstructor
@Tag(name = "Пользователи")
public class UserController {

    private final UserService service;

    @Operation(summary = "Добавить пользователя")
    @PostMapping
    public ResponseEntity<UserDto> add(@RequestBody UserDto userDto) {
        log.debug("Получен запрос на создание пользователя {}", userDto);
        userDto = service.save(userDto);
        log.debug("Пользователь сохранен. ID пользователя: {}", userDto.getId());
        return ResponseEntity.ok(userDto);
    }
}
