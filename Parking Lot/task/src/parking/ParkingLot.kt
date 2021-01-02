package parking

import java.lang.StringBuilder

data class ParkingLot(val size: Int) {
    val spots = ArrayList<Car?>(size)

    init {
        repeat(size) {
            spots.add(null)
        }
    }

    fun getRegistrationNumbersByColor(color: String): String {
        val response = StringBuilder()
        for (c in spots) {
            if (c?.color.equals(other = color, ignoreCase = true)) {
                response.append("${c?.registrationNumber}, ")
            }
        }
        return if (response.isEmpty()) {
            "No cars with color $color were found."
        } else {
            response.removeSuffix(", ").toString()
        }
    }

    fun getSpotsByColor(color: String): String {
        val response = StringBuilder()
        for ((i, c) in spots.withIndex()) {
            if (c?.color.equals(other = color, ignoreCase = true)) {
                response.append("${i + 1}, ")
            }
        }
        return if (response.isEmpty()) {
            "No cars with color $color were found."
        } else {
            response.removeSuffix(", ").toString()
        }
    }

    fun getSpotsByRegistrationNumber(registrationNumber: String): String {
        val response = StringBuilder()
        for ((i, c) in spots.withIndex()) {
            if (c?.registrationNumber.equals(other = registrationNumber, ignoreCase = true)) {
                response.append("${i + 1}, ")
            }
        }
        return if (response.isEmpty()) {
            "No cars with registration number $registrationNumber were found."
        } else {
            response.removeSuffix(", ").toString()
        }
    }

}