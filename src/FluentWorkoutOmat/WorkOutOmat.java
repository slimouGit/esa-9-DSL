package FluentWorkoutOmat;

public class WorkOutOmat {
    public static void main(String[] args){
        new Workout(Workout.Level.BEGINNER)
                .practice(Workout.Practice.KNEE_BENDS)
                .finishPractice(false)
                .practice(Workout.Practice.PUSH_UPS)
                .finishPractice(false)
                .practice(Workout.Practice.SIT_UPS)
                .finishPractice(true);
    }
}
