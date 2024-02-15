package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.Teacher;

public class TeacherCreator implements UserCreator<Teacher>{
    @Override
    public Teacher createUser(String firstName, String secondName, String lastName) {
        return new Teacher(firstName, secondName, lastName);
    }
}
