package com.wiley.springBootNew.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorId;
    private String AuthorName;
    private String email;

    @OneToMany(targetEntity = Book.class,fetch = FetchType.LAZY,cascade= CascadeType.ALL)
   @JoinColumn(name = "authod_Id",referencedColumnName ="authorId" )
    private List<Book> book;

}
