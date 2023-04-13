package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter // lombok으로 사용한 것이다.
public class HelloData {
    private String username;
    private int age;
}
