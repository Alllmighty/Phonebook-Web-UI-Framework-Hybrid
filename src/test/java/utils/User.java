package utils;

import dto.UserDTO;
import dto.UserDTOLombok;
import dto.UserDTOWith;

public class User {

    static String email = ConfigurationProperties.getProperty("email");
    static String password = ConfigurationProperties.getProperty("password");

    public static UserDTO userDTO = new UserDTO(email, password);

    public static UserDTOWith userDTOWith = new UserDTOWith()
            .withEmail(email)
            .withPassword(password);

    public static UserDTOLombok userDTOLombok = UserDTOLombok.builder()
            .email(email)
            .password(password)
            .build();
}
