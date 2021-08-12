package tra.la.la.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tra.la.la.entity.User;
import tra.la.la.repository.UserRepository;
import tra.la.la.service.UserService;
import tra.la.la.web.dto.UserDto;
import tra.la.la.web.mapper.UserMapper;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDto save(UserDto userDto) {
        User entity = repository.save(mapper.toEntity(userDto));
        return mapper.toDto(entity);
    }
}
