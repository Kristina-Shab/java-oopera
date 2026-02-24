import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        System.out.println(title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActorToShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер и так участвует в спектакле. Рассмотрите другую кандидатуру.");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surnameReplacedActor) {
        Actor replacedActor = getActorBySurname(surnameReplacedActor);
        if (replacedActor == null) {
            System.out.println("Актер с такой фамилией в спектакле не задействован.");
            return;
        }
        addActorToShow(newActor);
        listOfActors.remove(replacedActor);
    }

    private Actor getActorBySurname(String surname) {
        for (Actor actor : listOfActors) {
            if (surname.equals(actor.getSurname())) {
                return actor;
            }
        }
        return null;
    }
}
