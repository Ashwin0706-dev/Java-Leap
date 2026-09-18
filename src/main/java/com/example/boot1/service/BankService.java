package com.example.boot1.service;

import com.example.boot1.model.Users;
import org.springframework.stereotype.*;
import java.util.List;
import java.util.ArrayList;
@Service
public class BankService {
    static  List<Users> list=new ArrayList<>();

    public List<Users> getUsers(){
        return list;
    }

    public String saveUser(Users user){
        list.add(user);
        return "User added successfully";
    }

    public String DelUser(Users user) {
        list.remove(user);
        return "User with ID "+user+" is Deleted";
    }

    public String UpdateUser(Users user) {
        list.remove(user);
        return "User with ID "+user+" is Deleted";
    }
}