package ru.averinaoy.api.Lesson_4.controller;

import ru.averinaoy.api.Lesson_4.model.Student;

public class StudentCreator implements UserCreator<Student>{
    @Override
    public Student createUser(String firstName, String secondName, String lastName) {
        return new Student(1, firstName, secondName, lastName);
    }
}