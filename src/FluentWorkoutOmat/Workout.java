package FluentWorkoutOmat;

public class Workout {
    private Level level;
    private boolean lastPractice;

    public Workout(Level level) {
        this.level = level;
    }

    public enum Level {
        BEGINNER(5), PRACTICED(10), PROFESSIONAL(20);
        private final int repeats;

        Level(int repeats) {
            this.repeats = repeats;
        }
    }

    public enum Practice {
        PUSH_UPS("push ups"), KNEE_BENDS("knee bends"), SIT_UPS("sit ups");
        private final String cheer;

        Practice(String cheer) {
            this.cheer = cheer;
        }
    }

    public Workout perform(Practice practice) {
        System.out.println("now start with " + practice.cheer + ", tschakka!");
        this.perform(practice.cheer);
        return this;
    }

    private synchronized void perform(String cheer) {
        this.practice(cheer);
        this.doBreak();
        this.practice(cheer);
        this.doBreak();
        this.practice(cheer);
    }

    public Workout practice(Practice practice){
        switch(practice){
            case KNEE_BENDS:
                this.perform(Practice.KNEE_BENDS);
        }
        switch(practice){
            case SIT_UPS:
                this.perform(Practice.SIT_UPS);
        }
        switch(practice){
            case PUSH_UPS:
                this.perform(Practice.PUSH_UPS);
        }
        return this;
    }

    private void practice(String cheer) {
        for (int i = 1; i <= this.level.repeats; i++) {
            System.out.println(cheer);
            this.timeOut(1000);
        }
    }

    private void doBreak() {
        System.out.println("short relaxation break");
        this.timeOut(10000);
        System.out.println("now keep going");
        this.timeOut(3000);
    }

    private void timeOut(int time) {
        try {
            this.wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Workout finishPractice(boolean workoutIsFinishedForToday) {
        if(workoutIsFinishedForToday){
            System.out.println("your workout is fineshed for today, you already look like an Adonis!");
        }else{
            System.out.println("ready for the next practice?");
            this.doBreakBetweenPractices(3000);
        }
        return this;
    }

    private synchronized void doBreakBetweenPractices(int time){
        this.timeOut(time);
    }
}
