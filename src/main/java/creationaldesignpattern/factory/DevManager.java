package creationaldesignpattern.factory;

public class DevManager extends HiringManager {
   protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
