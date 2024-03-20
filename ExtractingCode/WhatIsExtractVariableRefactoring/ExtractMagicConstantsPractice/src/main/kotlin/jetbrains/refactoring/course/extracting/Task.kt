package jetbrains.refactoring.course.extracting

private const val speed = 299792458.0

private const val waveLength = 6.62607015e-34

fun calculatePhotonEnergy(waveLength: Double): Double {
    val frequency = speed / waveLength
    return waveLength * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (speed * speed)
}

fun main() {
    val photonEnergy = calculatePhotonEnergy(0.5e-6)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
