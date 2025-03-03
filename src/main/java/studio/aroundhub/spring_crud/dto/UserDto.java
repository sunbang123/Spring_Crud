/*
    MVC Model
    Entity UserDto
    데이터 전송 객체 (Data Transfer Object)
    클라이언트와 서버 간의 데이터 전달을 담당
*/
package studio.aroundhub.spring_crud.dto;

import lombok.Getter;
import lombok.Setter;

public class UserDto {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    // 기본 생성자
    public UserDto() {}

    // 모든 필드를 포함한 생성자
    public UserDto(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // 로그 출력
    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
