package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "MEMBERS")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CREATED")
    private LocalDate accountCreationDate;

    @OneToMany(
            targetEntity = Loan.class,
            mappedBy = "member",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Loan> loans = new ArrayList<>();
}
