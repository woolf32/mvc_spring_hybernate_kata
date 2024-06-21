package com.nikolaypodlesnykh.spring.mvc.hibernate.dao;

import com.nikolaypodlesnykh.spring.mvc.hibernate.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    private List <User> employees = new ArrayList<User>();
    {
        employees = new ArrayList<>();

        employees.add(new User(1,"Ivan","Sidorov","HR",54323));
        employees.add(new User(2,"Alex","Ivanov","IT",235456));
        employees.add(new User(3,"Tanya","Porem","LG",53563));
        employees.add(new User(4,"Eugeniy","Surkov","IT",767465));
        employees.add(new User(5,"Nikolay","Petrov","HR",53743));
    }

    @Override
    public List<User> getAllEmployees() {
        return employees;
    }


}
