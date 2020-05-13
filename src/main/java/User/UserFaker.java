package User;

import com.github.javafaker.Faker;

/**
 * Created by neste on 13.05.2020.
 */
public class UserFaker {

    public static User defaultUser(){
        User user = new User();
        user.setUserName("Igor");
        user.setEmail("nest@gmail.com");
        user.setPassword("qwerty");
        return user;
    }

    public static User randomUser() {
        Faker faker = new Faker();
        User user = new User();
        user.setUserName(faker.name().firstName());
        user.setEmail(faker.name().lastName() + "@gmail.com");
        user.setPassword("qwerty");
        return user;
    }
}
