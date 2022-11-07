package chapter_IV;

public class Exercise_04_24 {
    public static void main(String[] args) {
        String firstCity = "Legnica";
        String secondCity = "Chorzów";
        String thirdCity = "Alwernia";
        String temp = "";

        System.out.println("Cities: " + firstCity + ", " + secondCity + ", " + thirdCity);

        while(firstCity.compareTo(secondCity)>0||secondCity.compareTo(thirdCity)>0||firstCity.compareTo(thirdCity)>0) {
            if (firstCity.compareTo(secondCity) > 0) {
                temp = firstCity;
                firstCity = secondCity;
                secondCity = temp;
            }
            if (secondCity.compareTo(thirdCity) > 0) {
                temp = secondCity;
                secondCity = thirdCity;
                thirdCity = temp;
            }
            if (thirdCity.compareTo(firstCity) < 0) {
                temp = thirdCity;
                thirdCity = firstCity;
                firstCity = temp;
            }
        }

        System.out.println("Sorted cities: " + firstCity + ", " + secondCity + ", " + thirdCity);

    }
}
