public class Cinema {
        String[][] seats;

        // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
        // Sæder, der ikke er reserveret, har værdien "O"
        public Cinema(int rows, int seatsPerRow) {
            this.seats = new String[rows][seatsPerRow];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < seatsPerRow; j++) {
                    this.seats[i][j] = "O";
                }
            }
            this.seats[0][0] = "X"; //Har flyttet denne linje ned da jeg først skal oprette mit array.
        }

        public int getRows() {
            return seats.length;
        }

        public int getSeats() {
            return seats[0].length;
        }

        // If the seat is not yet reserved, it's value is O.
        // In that case, change the value to X and return true.
        // If the seat is already reserved, return false.
        public boolean reserve(int row, int seat) {
            if (seats[row][seat].equals("O")) {
                seats[row][seat] = "X";
                return true;
            }
            return false;
        }

        public boolean cancelReservation(int row, int seat) {
            if (seats[row][seat].equals("X")) {  // rettet til stort X
                seats[row][seat] = "O";
                return true;
            }
            return false;
        }

        public String toString() {
            String result = ""; //Lavet om til en tom streng, da jeg ikke kan returner til null.
            for (int i = 0; i < seats.length; i++) {
                result += "|";
                for (int j = 0; j < seats[i].length; j++) {
                    result += seats[i][j] + "|";
                }
                result += "\n";
            }
            return result;
        }
    }