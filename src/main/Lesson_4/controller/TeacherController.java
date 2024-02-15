package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.Teacher;

public class TeacherController implements UserController<Teacher> {
    private final UserCreator<Teacher> teacherCreator;

    public TeacherController(UserCreator<Teacher> teacherCreator) {
        this.teacherCreator = teacherCreator;
    }

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return teacherCreator.createUser(firstName, secondName, lastName);
    }
}
