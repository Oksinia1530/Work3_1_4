package ru.averinaoy.api.Lesson_4.presenter;

import ru.averinaoy.api.Lesson_4.model.User;

import java.util.List;

public class UserPresenter<T extends User> {
    public void printOnConsole(List<T> userList) {
        for (T user : userList) {
            System.out.println(user);
        }
    }
}


