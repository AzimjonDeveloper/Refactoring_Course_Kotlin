package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]

    val transportationServiceFactory = TransportationServiceFactory()

    transportationServiceFactory.getTransportation(transportName).drive()
}
