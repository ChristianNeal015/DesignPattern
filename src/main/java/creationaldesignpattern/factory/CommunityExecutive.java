package creationaldesignpattern.factory;

public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about building");
    }
}
