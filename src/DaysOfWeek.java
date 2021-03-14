public enum DaysOfWeek {

    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public static void getWorkingHours(DaysOfWeek d){
        switch (d){
            case Monday:
                System.out.println("Увы, сегодня только понедельник, осталось работать 40 часов");
                break;
            case Tuesday:
                System.out.println("Уже вторник, но до конца еще далеко, осталось работать 32 часа");
                break;
            case Wednesday:
                System.out.println("Среда - это маленькая пятница, осталось работать 24 часа");
                break;
            case Thursday:
                System.out.println("Четверг! Выходные совсем близко, осталось работать 16 часов");
                break;
            case Friday:
                System.out.println("Пятница! бокалы уже звенят, но трогать их еще нельзя, осталосб работать 8 часов");
                break;
            case Saturday:
                System.out.println("Суббота - выходной, осталосб работать 0 часов");
                break;
            case Sunday:
                System.out.println("Воскресенье, работать все еще не нужно, осталось 0 часов");
                break;
        }
    }
}
