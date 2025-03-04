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

    // 회원 등록 메서드
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

    // 회원 조회 메서드
    public UserDto getUserById(Long id) {
        // 데이터베이스에서 ID에 해당하는 회원을 조회
        User user = userRepository.findById(id)
                // 회원이 존재하지 않을 경우 RuntimeException을 발생시킴.
                .orElseThrow(() -> new RuntimeException("User not found"));
        // 조회한 User 객체를 UserDto 객체로 변환하여 반환함.
        return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
