package com.supertinder.poc.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userAuthId;

    @Column(name = "User_Name")

    private String userName;

    @Column(name = "User_Password")
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserAuth userAuth = (UserAuth) o;
        return userAuthId != null && Objects.equals(userAuthId, userAuth.userAuthId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
