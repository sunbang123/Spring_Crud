/*
    Service UserService
    비즈니스 로직 처리
    데이터 엑세스 레이어와 상호작용
*/

package studio.aroundhub.spring_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.aroundhub.spring_crud.dto.UserDto;
import studio.aroundhub.spring_crud.entity.User;
import studio.aroundhub.spring_crud.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserDto userDto){
        // 1. Dto에서 Entity로 변환
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        // 2. 변형된 Entity 저장
        return userRepository.save(user);
    }
}
