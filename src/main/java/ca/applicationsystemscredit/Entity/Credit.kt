@file:Suppress("com.haulmont.jpb.NoArgsConstructorInspection")

package ca.applicationsystemscredit.Entity

import jakarta.persistence.*
import java.io.ObjectInputFilter
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*


@Entity
@Table(name = "Credit")
data class Credit (
    @Column(nullable = false, unique = true) var creditCode: UUID = UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
    @Enumerated val status: ObjectInputFilter.Status = ObjectInputFilter.Status.IN_PROGRESSE,
    @ManyToOne var customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null

)