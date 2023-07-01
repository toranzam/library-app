package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // int 는 null 표현이 불가능 Integer 는 null 표현이 가능함

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
