package src.barking_dog;

    public class BarkingDog {

        public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (barking) {
                return hourOfDay < 8 || hourOfDay > 22;
            }

            return false;
        }
    }
