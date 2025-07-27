package com.example.memoryDB.user.controller;

import com.example.memoryDB.user.model.UserEntity;
import com.example.memoryDB.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PutMapping("")
    public UserEntity create(
        @RequestBody UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public UserEntity findOne(
            @PathVariable Long id
    ){
        var response = userService.findById(id);

        return response.get();
    }

    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ){
        // userService.delete(id);
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(
        @RequestParam int score
    ){
        return userService.filterScore(score);
    }
}
