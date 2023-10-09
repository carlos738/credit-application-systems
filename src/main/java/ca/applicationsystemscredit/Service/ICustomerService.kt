package ca.applicationsystemscredit.Service.impl

import ca.applicationsystemscredit.Entity.Customer

interface ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}