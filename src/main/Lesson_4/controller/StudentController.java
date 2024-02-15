package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.Student;

public class StudentController implements UserController<Student> {
    private final UserCreator<Student> studentCreator;

    public StudentController(UserCreator<Student> studentCreator) {
        this.studentCreator = studentCreator;
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return studentCreator.createUser(firstName, secondName, lastName);
    }
}
