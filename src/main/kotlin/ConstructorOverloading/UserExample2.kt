package ConstructorOverloading

import problem_1.AddressModelExample1
import problem_1.CompanyModelExample1
import problem_1.ContactModelExample1
import problem_1.EducationalModelExample1
import java.lang.foreign.AddressLayout


class UserExample2 {
    private val firstName: String
    private val lastName: String
    private val address: AddressModelExample1
    private val educations: List<EducationalModelExample1>
    constructor(
        firstName: String,
        lastName: String,
        address: AddressModelExample1,
        educations: List<EducationalModelExample1>
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.educations = educations
    }

    constructor(
        firstName: String,
        middleName: String,
        lastName: String,
        address: AddressModelExample1,
        educations: List<EducationalModelExample1>
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.educations = educations
    }
    constructor(
        firstName: String,
        middleName: String,
        lastName: String,
        address: AddressModelExample1,
        company: CompanyModelExample1?,
        educations: List<EducationalModelExample1>
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.educations = educations
    }
    constructor(
        firstName: String,
        lastName: String,
        address: AddressModelExample1,
        contact: ContactModelExample1?,
        educations: List<EducationalModelExample1>
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.educations = educations
    }
}

//The users will be created with the overloaded constructor solves the readability issue to some extent but depends a lot on the parameters of the constructor.

//There are issues with the overloaded constructors
//
//You must produce all the possible permutations and combinations of the constructors.
//It is difficult to manage a lot of constructors.
//It is difficult to add or remove parameters from the constructors as it would affect a lot of them at once which can lead to compilation errors.
//It violates the Don’t Repeat Yourself (DRY) software principle as a lot of code is repeated in the constructors.
//Users can get overwhelmed with so many constructors and can get confused about which one to use.