package tra.la.la.web.mapper;

import org.mapstruct.Mapper;
import tra.la.la.entity.User;
import tra.la.la.web.dto.UserDto;

@Mapper
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
