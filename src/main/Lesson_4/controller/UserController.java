package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
