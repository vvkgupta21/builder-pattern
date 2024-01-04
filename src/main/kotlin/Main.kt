import problem_1.*

// Builder design is a creational design that allow to create complex object step by step. This allows to create
// several type or representation of an object using the same constructor code.
fun main(args: Array<String>) {

    val address  = getAddress()
    val contact = getContact()
    val educations = getEducations()
    val company = getCompany()


    val user1 = UserModelExample1(
        "Abhishek",
        null,
        "Saxena",
        address,
        contact,
        company,
        educations,
    )

    println(user1)
}

public fun getAddress(): AddressModelExample1{
    val line1 = "123 Main Street"
    val city = "Cityville"
    val state = "State"
    val country = "Country"
    val pinCode = 12345
    val line2 = "Apartment 456"
    return AddressModelExample1(line1, city, state, country, pinCode, line2)
}

public fun getContact(): ContactModelExample1 {
    // Replace these values with actual data
    return ContactModelExample1(
        twitterHandle = "@user",
        githubHandle = "githubuser",
        phoneNumber = "123-456-7890",
        email = "user@example.com"
    )
}

public fun getCompany(): CompanyModelExample1? {
    // Replace this value with the actual company name
    return CompanyModelExample1(name = "ABC Corporation")
}

public fun getEducation(): EducationalModelExample1 {
    // Replace these values with actual data
    return EducationalModelExample1(
        school = "University of ABC",
        yearOfPassing = 2022,
        degree = "Bachelor of Science in Computer Science"
    )
}

public fun getEducations(): List<EducationalModelExample1>  {
    // You can create a list of education instances based on your needs
    return listOf(
        getEducation(),
        EducationalModelExample1("High School XYZ", 2018, "High School Diploma")
    )
}





