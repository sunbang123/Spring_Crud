/*
    MVC Controller
    Controller UserController
    사용자 요청 처리
    서비스 레이어와 상호작용하여 응답 반환
*/
package studio.aroundhub.spring_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studio.aroundhub.spring_crud.dto.UserDto;
import studio.aroundhub.spring_crud.entity.User;
import studio.aroundhub.spring_crud.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired // UserService 의존성 주입 (객체 생성 없이도 비즈니스 로직 처리 가능!)
    private UserService userService;

    // 회원가입 요청을 처리하는 메서드
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
        // 로깅 추가
        System.out.println("API 요청에서 수신한 데이터: " + userDto);

        // userDto를 사용하여 등록된 User 객체를 로컬 변수로 저장.
        User registeredUser = userService.registerUser(userDto);

        // HTTP 200 응답과 성공 메세지를 반환
        return ResponseEntity.ok("회원가입 성공 (User registered successfully)");
    }
}