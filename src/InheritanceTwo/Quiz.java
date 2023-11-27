package InheritanceTwo;

public class Quiz {
    String topic;
    int totalNumOfQuestions;
    double score;

    public Quiz(String topic, int totalNumOfQuestions, double score) {
        this.topic = topic;
        this.totalNumOfQuestions = totalNumOfQuestions;
        this.score = score;
    }

    public void takeQuiz(){
        System.out.println("Taking the " + topic + " quiz");
    }
}
