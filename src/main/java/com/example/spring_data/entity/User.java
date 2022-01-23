package com.example.spring_data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinTable(name = "authorities",
joinColumns = {@JoinColumn(name = "id",referencedColumnName ="authorities_id")},
inverseJoinColumns = {@JoinColumn(name ="authorities_id" ,referencedColumnName = "id")})
private List<Role> role;
private String username;
private String password;
private Integer enabled;
}
