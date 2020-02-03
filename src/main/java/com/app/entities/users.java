package com.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "users",schema = "public")
public class users implements Serializable {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    @Column(name="name")
    String name;
    @Column(name="surname")
    String surname;
    @Column(name="username")
    String username;
    @Column(name="password")
    int password;


}
