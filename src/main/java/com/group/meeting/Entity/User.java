package com.group.meeting.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="user")
public class User
{
    @Id
    @Column(name="user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;

    @Column(name="user_name", length = 255)
    private String username;

    @Column(name="address", length = 255)
    private String address;

    @Column(name="mobile", length = 20)
    private int telephone;

    private String Email;

}