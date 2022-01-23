package com.example.spring_data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authorities")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "authority")
    private String name;
//    @ManyToMany(mappedBy = "role", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private List<User> users;
}
