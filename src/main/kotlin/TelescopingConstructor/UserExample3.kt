package TelescopingConstructor

import problem_1.AddressModelExample1
import problem_1.CompanyModelExample1
import problem_1.ContactModelExample1
import problem_1.EducationalModelExample1

class UserExample3 {

    private val firstName: String
    private val lastName: String
    private var middleName: String? = null
    private var contact: ContactModelExample1? = null
    private var company: CompanyModelExample1? = null
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
    ) : this(firstName, lastName, address, educations) {
        this.middleName = middleName
    }

    constructor(
        firstName: String,
        lastName: String,
        address: AddressModelExample1,
        company: CompanyModelExample1?,
        educations: List<EducationalModelExample1>
    ) : this(firstName, lastName, address, educations) {
        this.company = company
    }

    constructor(
        firstName: String,
        lastName: String,
        address: AddressModelExample1,
        contact: ContactModelExample1,
        educations: List<EducationalModelExample1>
    ) : this(firstName, lastName, address, educations) {
        this.contact = contact
    }
    constructor(
        firstName: String,
        middleName: String,
        lastName: String,
        address: AddressModelExample1,
        contact: ContactModelExample1,
        company: CompanyModelExample1,
        educations: List<EducationalModelExample1>,
    ) : this(firstName, middleName, lastName, address, educations) {
        this.contact = contact
        this.company = company
    }
}