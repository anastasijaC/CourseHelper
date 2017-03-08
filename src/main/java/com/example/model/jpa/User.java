package com.example.model.jpa;

import com.sun.corba.se.pept.transport.ContactInfo;
import org.hibernate.usertype.UserType;

import javax.persistence.*;

/**
 * Created by Anastasija on 3/8/2017.
 */
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    public String username;

    public String password;

    public String email;

    @Enumerated(EnumType.STRING)
    public UserType type;

    @OneToOne
    public ContactInfo contactInfo;

}