public class Season {

    enum Seasons {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) {
        determineSeason(Seasons.SUMMER);

    }
    static void determineSeason (Seasons season) {
        switch (season) {
            case WINTER:
            case FALL:
                System.out.println("Cold season");
                break;
            case SPRING:
            case SUMMER:
                System.out.println("Warm season");
                break;
            default:
                System.out.println("Default");
            }
        }

    }

