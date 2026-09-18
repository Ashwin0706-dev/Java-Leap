package com.example.boot1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.boot1.service.BankService;
import com.example.boot1.model.Users;
import java.util.List;

@RestController

public class BankController {
    @Autowired
    BankService bankService;
    @GetMapping("/users")
    public List<Users> getUsers(){
        return bankService.getUsers();
    }
    @PostMapping("/save")
    public String addUser(@RequestBody Users user){
        return bankService.saveUser(user);
    }
@DeleteMapping("/delete")
    public String delUsers(@RequestBody Users user){
        return bankService.DelUser(user);
    }

    @PutMapping("/delete")
    public String UpdateUsers(@RequestBody Users user){
        return bankService.DelUser(user);
    }
}