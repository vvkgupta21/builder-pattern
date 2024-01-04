package problem_1

data class UserModelExample1(
    val firstName: String,
    val middleName: String?, // optional
    val lastName: String,
    val address: AddressModelExample1,
    val contact: ContactModelExample1?, // optional
    val company: CompanyModelExample1?, // optional
    val educations: List<EducationalModelExample1>
)