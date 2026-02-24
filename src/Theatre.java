public class Theatre {
    public static void main(String[] args) {
        Actor ivan = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor nik = new Actor("Николай", "Семенов", Gender.MALE, 150);
        Actor vera = new Actor("Вера", "Макарова", Gender.FEMALE, 173);
        Director max = new Director("Максим", "Хоменко", Gender.MALE, 5);
        Director mila = new Director("Людмила", "Дойнова", Gender.FEMALE, 25);
        MusicAuthor leo = new MusicAuthor("Леонид", "Миронов", Gender.MALE);
        Choreographer lina = new Choreographer("Каролина", "Метелкина", Gender.FEMALE);

        Show show = new Show("Цирк на сцене", 120, max);
        Ballet ballet = new Ballet("Чиполлино", 180, mila, leo,
                "Чиполлино вместе со своими друзьями танцуют танец на базарной площади.", lina);
        Opera opera = new Opera("Юнона и авось", 70, mila, leo,
                "Мне сорок, но успокоенья нет", 2);

        show.addActorToShow(ivan);
        show.addActorToShow(nik);
        ballet.addActorToShow(ivan);
        ballet.addActorToShow(vera);
        opera.addActorToShow(vera);
        opera.addActorToShow(nik);

        show.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();
        show.replaceActor(vera, "Петров");
        show.printListOfActors();
        opera.replaceActor(ivan, "Мульт");

        ballet.printLibretto();
        opera.printLibretto();
    }
}
