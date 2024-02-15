package ru.averinaoy.api.Lesson_4.model;

import static jdk.internal.net.http.common.Utils.isValidName;

public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }


    public void setFirstName(String firstName) {

        if(isValidName(firstName)){
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Ошибка в имени");
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if(isValidName(secondName)){
            this.secondName = secondName;
        } else {
            throw new IllegalArgumentException("Ошибка в отчестве");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(isValidName(lastName)){
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Ошибка в фамилии");
        }
    }

     @Override
    public String toString() {
        return "User{" +
                "firstName='" + getFirstName()+ '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
