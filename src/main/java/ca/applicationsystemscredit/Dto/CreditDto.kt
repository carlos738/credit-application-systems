package ca.applicationsystemscredit.Dto

import ca.applicationsystemscredit.Entity.Credit
import ca.applicationsystemscredit.Entity.Customer
import jakarta.validation.constraints.Future
import org.jetbrains.annotations.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message "Invalid input") val creditValue: BigDecimal,
    @field:Future val dayFirstOfInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field:NotNull(message "Invalid input") val customerId: Long
){
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)

    )

}