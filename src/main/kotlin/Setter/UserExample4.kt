package Setter

import getAddress
import getCompany
import getContact
import getEducations
import problem_1.AddressModelExample1
import problem_1.CompanyModelExample1
import problem_1.ContactModelExample1
import problem_1.EducationalModelExample1

class UserExample4 {

    var firstName: String? = null
    var middleName: String? = null // optional
    var lastName: String? = null
    var address: AddressModelExample1? = null
    var contact: ContactModelExample1? = null // optional
    var company: CompanyModelExample1? = null // optional
    var educations: List<EducationalModelExample1>? = null

    constructor()

    fun setFirstNameAndPerformLogic(firstName: String) {
        this.firstName = firstName
    }

    fun setMiddleNameAndPerformLogic(middleName: String) {
        this.middleName = middleName
    }

    fun setLastNameAndPerformLogic(lastName: String) {
        this.lastName = lastName
    }

    fun setAddressAndPerformLogic(address: AddressModelExample1) {
        this.address = address
    }

    fun setContactAndPerformLogic(contact: ContactModelExample1) {
        this.contact = contact
    }

    fun setCompanyAndPerformLogic(company: CompanyModelExample1) {
        this.company = company
    }

    fun setEducationsAndPerformLogic(educations: List<EducationalModelExample1>) {
        this.educations = educations
    }
}

fun main(){
    val address = getAddress()
    val contact = getContact()
    val company = getCompany()
    val educations = getEducations()

    val user = UserExample4()
    user.setFirstNameAndPerformLogic("Abhishek")
    user.setLastNameAndPerformLogic("Saxena")
    user.setAddressAndPerformLogic(address)
    user.setEducationsAndPerformLogic(educations)

    println("User Details:")
    println("First Name: ${user.firstName}")
    println("Middle Name: ${user.middleName}")
    println("Last Name: ${user.lastName}")
    println("Address: ${user.address}")
    println("Contact: ${user.contact}")
    println("Company: ${user.company}")
    println("Educations: ${user.educations}")
}