public class AveragePercentMarks {
    public static void main(String[] args){
        int Maths = 94;
        int Physics = 95;
        int Chemistry = 96;
        int average = (Maths + Physics + Chemistry) / 3;
        float AveragePercentMarks = (average / 100.0f) * 100;
        System.out.println("Sam's Average Percent Marks in PCM is: " + AveragePercentMarks);
    }
}
