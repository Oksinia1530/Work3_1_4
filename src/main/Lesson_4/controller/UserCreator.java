package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.User;
public interface UserCreator <T extends User>{
    T createUser(String firstName, String secondName, String lastName);
}