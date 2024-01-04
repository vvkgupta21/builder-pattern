package BuilderPattern

import getContact
import problem_1.AddressModelExample1
import problem_1.CompanyModelExample1
import problem_1.ContactModelExample1
import problem_1.EducationalModelExample1

class UserExample5 {
    class User private constructor(
        val firstName: String,
        val middleName: String?, // optional
        val lastName: String,
        val address: AddressModelExample1,
        val contact: ContactModelExample1?, // optional
        val company: CompanyModelExample1?, // optional
        val educations: List<EducationalModelExample1>,
    ) {

        class Builder {
            var firstName: String? = null
            var middleName: String? = null // optional
            var lastName: String? = null
            var address: AddressModelExample1? = null
            var contact: ContactModelExample1? = null // optional
            var company: CompanyModelExample1? = null // optional
            var educations: List<EducationalModelExample1>? = null

            fun setFirstName(firstName: String) {
                this.firstName = firstName
            }

            fun setMiddleName(middleName: String) {
                this.middleName = middleName
            }

            fun setLastName(lastName: String) {
                this.lastName = lastName
            }

            fun setAddress(address: AddressModelExample1) {
                this.address = address
            }

            fun setContact(contact: ContactModelExample1) {
                this.contact = contact
            }

            fun setCompany(company: CompanyModelExample1) {
                this.company = company
            }

            fun setEducations(educations: List<EducationalModelExample1>) {
                this.educations = educations
            }

            fun build(): User {
                return User(
                    firstName!!,
                    middleName,
                    lastName!!,
                    address!!,
                    contact,
                    company,
                    educations!!
                )
            }
        }
    }
}

    fun main() {
        val contact = getContact()

        val userBuilder = UserExample5.User.Builder()
        userBuilder.setFirstName("Abhishek")
        userBuilder.setLastName("Saxena")
        userBuilder.setContact(contact)

        val user = userBuilder.build() // <- user object is built here
    }