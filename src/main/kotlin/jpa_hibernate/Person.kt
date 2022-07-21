package jpa_hibernate

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "PERSON")
class Person {
    @Id
    var id: UUID = TODO("initialize me")

    val firstName: String
    val lastName: String


    val age: String

    @Column(name = "email_address", unique = true)
    val emailaddress: String
}