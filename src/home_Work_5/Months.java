package home_Work_5;

/**
 * @Autor Volodymyr Melnyk
 * In enum, the months of the year are described as constants
 * And methods that this enum can perform
 */
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
    /**
     * Parameter numberOfDays of type int
     */
    int numberOfDays;
    /**
     * The season parameter that we take from another enum {@link Seasons}
     */
    Seasons season;

    /**
     * This is a constructor in which we assign values to parameters
     * @param numberOfDays prescribe how many days this month has
     * @param season prescribe from which season is this month
     */
    Months(int numberOfDays, Seasons season) {
        this.numberOfDays = numberOfDays;
        this.season = season;
    }

    /**
     * This is the method of getting the numberOfDays parameter
     * @return number of days
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * This is the method of getting the season parameter
     * @return season of the month
     */
    public Seasons getSeason() {
        return season;
    }

    /**
     * The method checks whether the text that comes to it
     * corresponds to one of the constants of the enum {@link Months}
     * If so, it displays: "There is such a month of the year - " + "name of the month"
     * and returns "true"
     * If not, it displays: "There is no such month in the year - " + "what the user entered"
     * and return false
     * @param string to check if there is such a month in the enum "Months"
     * @return boolean
     */
    public static boolean checkIfThereIsSuchAMonth(String string) {
        boolean isThereSuchAMonth = false;
        for (Months m : Months.values()) {
            if (string.toUpperCase().equals(m.name())) {
                System.out.println("There is such a month of the year - " + m.name());
                isThereSuchAMonth = true;
            }
        }
        if (!isThereSuchAMonth) {
            System.out.println("There is no such month in the year - " + string);
        }
        System.out.println();
        return isThereSuchAMonth;
    }

    /**
     * Indicates whether the month entered from the console has an even or odd number of days
     * @return Returns the same constant of the enum "Months" to which it was used
     */
    public Months displayWhetherTheMonthEnteredFromTheConsoleHasAnEvenNumberOfDays() {
        if (numberOfDays % 2 == 0) {
            System.out.println(name() + " - This month has an even number of days - " + numberOfDays);
        } else {
            System.out.println(name() + " - This month has an odd number of days - " + numberOfDays);
        }
        System.out.println();
        return this;
    }

    /**
     * This method displays all months with an even number of days
     * @return Returns the same constant of the enum "Months" to which it was used
     */
    public Months displayAllMonthsThatHaveAnEvenNumberOfDays() {
        for (Months m : Months.values()) {
            if (m.numberOfDays % 2 == 0) {
                System.out.println(m.name() + " - This month has an even number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return this;
    }

    /**
     * This method display all months that have an odd number of days
     * @return Returns the same constant of the enum "Months" to which it was used
     */
    public Months displayAllMonthsThatHaveAnOddNumberOfDays() {
        for (Months m : Months.values()) {
            if (m.numberOfDays % 2 != 0) {
                System.out.println(m.name() + " - This month has an odd number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return this;
    }

    /**
     * This method display all months with the same number of days
     * @return Returns the same constant of the enum "Months" to which it was used
     */
    public Months displayAllMonthsWithTheSameNumberOfDays() {
        for (Months m : Months.values()) {
            if (numberOfDays == m.numberOfDays && !name().equals(m.name())) {
                System.out.println(m.name() + "- Month with the same number of days - " + m.numberOfDays);
            }
        }
        System.out.println();
        return this;
    }

    /**
     * This method display all months that have fewer days
     * If the number of days = 28 then
     * output: "February alone can have 28 days"
     * @return Returns the same constant of the enum "Months" to which it was used
     */
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
        return this;
    }

    /**
     * This method display all months that have more days
     * If the number of days = 31 then
     * output: "31 - This is the largest number of days"
     * @return Returns the same constant of the enum "Months" to which it was used
     */
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
        return this;
    }

    /**
     * This method display all months with the same season
     * @return Returns the same constant of the enum "Months" to which it was used
     */
    public Months displayAllMonthsWithTheSameSeason() {
        for (Months m : Months.values()) {
            if (season == m.season && !name().equals(m.name())) {
                System.out.println(m + "- This month is from the same season - " + m.season);
            }
        }
        System.out.println();
        return this;
    }

    /**
     * This method display the next season
     * @return Returns the same constant of the enum "Months" to which it was used
     */
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
        return this;
    }

    /**
     * This method display the previous season
     * @return Returns the same constant of the enum "Months" to which it was used
     */
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
        return this;
    }

}


