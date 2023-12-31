package ca.applicationsystemscredit.Repository

import ca.applicationsystemscredit.Entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>
