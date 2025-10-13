package House;

class House {
    private int floors;

    public House(int floors) {
        if(floors <= 0) throw new IllegalArgumentException("Количество этажей должно быть больше нуля");
        this.floors = floors;
    }

    public String getFormattedDescription() {
        String ending;

        // Определяем правильное окончание
        int lastDigit = floors % 10;
        int lastTwoDigits = floors % 100;

        // Исключения для чисел 11-14
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            ending = "этажами";
        } else {
            switch (lastDigit) {
                case 1:
                    ending = "этажом";
                    break;
                case 2:
                case 3:
                case 4:
                    ending = "этажами";
                    break;
                default:
                    ending = "этажами";
            }
        }

        return "дом с " + floors + " " + ending;
    }

}
