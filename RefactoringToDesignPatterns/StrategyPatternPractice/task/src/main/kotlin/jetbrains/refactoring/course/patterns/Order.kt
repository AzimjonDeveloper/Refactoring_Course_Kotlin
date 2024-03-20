package jetbrains.refactoring.course.patterns

import java.time.LocalDate

data class Order(public val totalAmount: Double, public val date: LocalDate) {
}
