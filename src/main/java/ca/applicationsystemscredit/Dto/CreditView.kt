package ca.applicationsystemscredit.Dto

import ca.applicationsystemscredit.Entity.Credit
import java.io.ObjectInputFilter
import java.math.BigDecimal
import java.util.*

data class CreditView(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallment: Int,
    val status: ObjectInputFilter.Status,
    val emailCustomer: String?,
    val incomeCostumer: BigDecimal?
){
    constructor(credit: Credit): this (
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCostumer = credit.customer?.income

    )

}