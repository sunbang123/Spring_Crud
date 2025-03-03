/*
    MVC Model
    Entity UserDto
    데이터 전송 객체 (Data Transfer Object)
    클라이언트와 서버 간의 데이터 전달을 담당
*/
package studio.aroundhub.spring_crud.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
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

    // Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
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
