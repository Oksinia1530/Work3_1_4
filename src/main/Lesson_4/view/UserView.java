package ru.averinaoy.api.Lesson_4.view;
import ru.averinaoy.api.Lesson_4.model.User;

import java.util.List;

public interface UserView <T extends User>{

    void display(List<T> list);
}
