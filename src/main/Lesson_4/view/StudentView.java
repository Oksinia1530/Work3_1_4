package ru.averinaoy.api.Lesson_4.view;

import ru.averinaoy.api.Lesson_4.model.Student;
import ru.averinaoy.api.Lesson_4.presenter.UserPresenter;

import java.util.List;

public class StudentView implements UserView<Student> {
    private final UserPresenter<Student> presenter = new UserPresenter<>();

    @Override
    public void display(List<Student> list) {
        presenter.printOnConsole(list);
    }
}
