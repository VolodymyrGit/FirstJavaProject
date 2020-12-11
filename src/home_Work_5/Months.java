package home_Work_5;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    int numberOfDays;
    Seasons season;

    Months(int numberOfDays, Seasons season) {
        this.numberOfDays = numberOfDays;
        this.season = season;
    }


    public int getNumberOfDays() {
        return numberOfDays;
    }


    public Seasons getSeason() {
        return season;
    }


    public static int checkIfThereIsSuchAMonth(String string) {
        int i = 0;
        for (Months m : Months.values()) {
            if (string.toUpperCase().equals(m.name())) {
                i = 1;
                System.out.println("There is such a month of the year - " + m.name());
            }
        }
        if (i == 0) {
            System.out.println("There is no such month in the year - " + string);
        }
        System.out.println();
        return i;
    }


    public Months displayWhetherTheMonthEnteredFromTheConsoleHasAnEvenNumberOfDays() {
        if (numberOfDays % 2 == 0) {
            System.out.println(name() + " - This month has an even number of days - " + numberOfDays);
        } else {
            System.out.println(name() + " - This month has an odd number of days - " + numberOfDays);
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsThatHaveAnEvenNumberOfDays() {
        for (Months m : Months.values()) {
            if (m.numberOfDays % 2 == 0) {
                System.out.println(m.name() + " - This month has an even number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsThatHaveAnOddNumberOfDays() {
        for (Months m : Months.values()) {
            if (m.numberOfDays % 2 != 0) {
                System.out.println(m.name() + " - This month has an odd number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsWithTheSameNumberOfDays() {
        for (Months m : Months.values()) {
            if (numberOfDays == m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- Month with the same number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsThatHaveFewerDays() {
        for (Months m : Months.values()) {
            if (numberOfDays > m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- This month has fewer days - " + m.numberOfDays);
            }
        }
        if (numberOfDays == 28) {
            System.out.println("February alone can have 28 days");
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsThatHaveMoreDays() {
        for (Months m : Months.values()) {
            if (numberOfDays < m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- This month has more days - " + m.numberOfDays);
            }
        }
        if (numberOfDays == 31) {
            System.out.println("31 - This is the largest number of days");
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayAllMonthsWithTheSameSeason() {
        for (Months m : Months.values()) {
            if (season == m.season && !name().equals(m.name())) {
                System.out.println(m + "- This month is from the same season - " + m.season);
            }
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayTheNextSeason() {
        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i]) && i != 3) {
                System.out.println("Next season is - " + seasons[i + 1]);
            } else if (season.equals(seasons[i]) && i == 3) {
                System.out.println("Next season is - " + seasons[0]);
            }
        }
        System.out.println();
        return valueOf(name());
    }


    public Months displayThePreviousSeason() {
        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i]) && i != 0) {
                System.out.println("Previous season is - " + seasons[i - 1]);
            } else if (season.equals(seasons[i]) && i == 0) {
                System.out.println("Previous season is - " + seasons[3]);
            }
        }
        System.out.println();
        return valueOf(name());
    }

}


