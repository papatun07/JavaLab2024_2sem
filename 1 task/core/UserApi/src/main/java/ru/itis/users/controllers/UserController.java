package ru.itis.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.users.entities.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List<User> getAllBooks() {

        User user1 = User.builder()
                .username("Aleks_chugunov")
                .password("025879")
                .direction("north")
                .build();

        User user2 = User.builder()
                .username("Aleks_Kuznecov")
                .password("0987654")
                .direction("east")
                .build();

        User user3 = User.builder()
                .username("Cristiano_Ronaldo")
                .password("p34563")
                .direction("west")
                .build();

        User user4 = User.builder()
                .username("Renal_Gilyaziev")
                .password("p78uytde")
                .direction("south")
                .build();

        User user5 = User.builder()
                .username("Arut_papoyan")
                .password("p098764f")
                .direction("southwest")
                .build();

        return  List.of(user1, user2, user3, user4, user5);
    }
}
