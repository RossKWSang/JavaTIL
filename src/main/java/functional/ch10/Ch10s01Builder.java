package functional.ch10;


import functional.ch10.model.User;

/**
 * 대표적인 생성 패턴 <br>
 * 객체의 생성에 대한 로직과 표현에 대한 로직을 분리 <br>
 * 객체의 생성 과정을 유연하게 함 <br>
 * 객체의 생성 과정을 정의하고 싶거나 필드가 많아 Constructor가 복잡해질 때 유용
 * */
public class Ch10s01Builder {
    public static void main(String[] args) {
        User user = User.builder(1, "Alice")
                .with(builder -> {
                    builder.emailAddress = "alice@email.com";
                    builder.isVerified = true;
                }).build();

        System.out.println(user);
    }
}
