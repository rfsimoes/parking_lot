package parking

import java.lang.StringBuilder
import java.util.*

private const val PARKING_LOT_NOT_CREATED = "Sorry, a parking lot has not been created."

fun main() {
    var parkSize = 0
    val sc = Scanner(System.`in`)
    var parkingLot = createPark(parkSize)
    var registrationNumber: String
    var color: String
    var spot: Int

    while (true) {
        val operation = sc.nextLine().split(" ")
        val command = operation[0]
        if (command == "park") {
            registrationNumber = operation[1]
            color = operation[2]
            println(park(registrationNumber, color, parkingLot, parkSize))
        } else if (command == "leave") {
            spot = operation[1].toInt()
            println(leave(spot, parkingLot))
        } else if (command == "exit") {
            break
        } else if (command.startsWith("create")) {
            parkSize = operation[1].toInt()
            parkingLot = createPark(parkSize)
        } else if (command == "status") {
            print(getParkStatus(parkingLot))
        } else if (command == "reg_by_color") {
            color = operation[1]
            println(registrationNumbersByColor(parkingLot, color))
        } else if (command == "spot_by_color") {
            color = operation[1]
            println(spotByColor(parkingLot, color))
        } else if (command == "spot_by_reg") {
            registrationNumber = operation[1]
            println(spotByRegistrationNumber(parkingLot, registrationNumber))
        }
    }
}

fun spotByRegistrationNumber(parkingLot: ParkingLot, registrationNumber: String): String {
    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }
    return parkingLot.getSpotsByRegistrationNumber(registrationNumber)
}

fun spotByColor(parkingLot: ParkingLot, color: String): String {
    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }
    return parkingLot.getSpotsByColor(color)
}

fun registrationNumbersByColor(parkingLot: ParkingLot, color: String): String {
    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }
    return parkingLot.getRegistrationNumbersByColor(color)
}

fun getParkStatus(parkingLot: ParkingLot): String {
    val status = StringBuilder()

    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }

    for (i in 0 until parkingLot.spots.size) {
        if (parkingLot.spots[i] != null) {
            status.append("${i + 1} ${parkingLot.spots[i]?.registrationNumber} ${parkingLot.spots[i]?.color}\n")
        }
    }
    if (status.isBlank()) {
        status.append("Parking lot is empty.\n")
    }
    return status.toString()
}

private fun createPark(parkSize: Int): ParkingLot {
    if (parkSize > 0) {
        val parkingLot = ParkingLot(parkSize)
        println("Created a parking lot with $parkSize spots.")
        return parkingLot
    }
    return ParkingLot(0)
}

fun leave(spot: Int, parkingLot: ParkingLot): String {
    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }

    if (parkingLot.spots[spot - 1] != null) {
        parkingLot.spots[spot - 1] = null
        return "Spot $spot is free."
    }
    return "There is no car in spot $spot."
}

private fun park(registrationNumber: String, color: String, parkingLot: ParkingLot, parkSize: Int): String {
    if (parkingLot.spots.isEmpty()) {
        return PARKING_LOT_NOT_CREATED
    }
    if (validRegistrationNumber(registrationNumber)) {
        for (i in 0 until parkSize) {
            val spotIsNotOccupied = parkingLot.spots[i] == null
            if (spotIsNotOccupied) {
                parkingLot.spots[i] = Car(registrationNumber, color)
                return "$color car parked in spot ${i + 1}."
            }
        }
        return "Sorry, the parking lot is full."
    }
    return ""
}

fun validRegistrationNumber(registrationNumber: String): Boolean {
    return !registrationNumber.contains(" ")
}
