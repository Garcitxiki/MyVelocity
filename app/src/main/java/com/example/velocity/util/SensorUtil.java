package com.example.velocity.util;

public class SensorUtil {
    public static String stateCalculator(double speed) {
        if (isBetween(speed, 0, 1)) {
            return "ESTADO PARADO";
        }
        if (isBetween(speed, 1, 4)) {
            return "ESTADO CAMIANDO";
        }
        if (isBetween(speed, 4, 6)) {
            return "ESTADO MARCHANDO";
        }
        if (isBetween(speed, 6, 12)) {
            return "ESTADO CORRIENDO";
        }
        if (isBetween(speed, 12, 25)) {
            return "ESTADO SPRINT";
        }
        if (isBetween(speed, 25, 170)) {
            return "ESTADO VEH. MOTOR TERRESTRE";
        }
        return "ESTADO VEH. MOTOR AÉREO";

    }

    private static boolean isBetween(double x, int lower, int upper) {
        return lower <= x && x < upper;
    }
}
