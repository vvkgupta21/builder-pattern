package problem_1

data class AddressModelExample1(
    val line1: String,
    val city: String,
    val state: String,
    val country: String,
    val pinCode: Int,
    var line2: String? = null,
)