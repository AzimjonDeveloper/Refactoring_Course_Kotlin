package jetbrains.refactoring.course.patterns

class TransportationServiceFactory {
    fun getTransportation(transport: String) = when(transport) {
            ("Bicycle") -> Bicycle()
            ("Car") -> Car()
        else -> {Car()}
    }
}
