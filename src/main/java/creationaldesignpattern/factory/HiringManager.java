package creationaldesignpattern.factory;

public abstract class HiringManager {


        abstract Interviewer makeInterviewer();

        public void takeInterviewer() {
            Interviewer interviewer = this.makeInterviewer();
            interviewer.askQuestions();
 }
}
