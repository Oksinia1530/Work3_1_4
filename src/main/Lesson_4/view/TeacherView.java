package ru.averinaoy.api.Lesson_4.view;

import ru.averinaoy.api.Lesson_4.model.Teacher;
import ru.averinaoy.api.Lesson_4.presenter.UserPresenter;

import java.util.List;


public class TeacherView implements UserView<Teacher> {
    private final UserPresenter<Teacher> presenter = new UserPresenter<>();
    @Override
    public void display(List<Teacher> list) {
        presenter.printOnConsole(list);
    }
}
