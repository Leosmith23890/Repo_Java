package firstproject;

public class StudentScore {
    public static void main(String[] args) {
double myScore = 151;
int maxScore=200;
System.out.println("Student score is " +myScore);
double score = (myScore/maxScore) *100;
if (score>100)
{System.out.println("Invalid student score is entered");}
else if (score>=91){
System.out.println("The student grade is Grade A" );}
else if (score>=81){
System.out.println("The student grade is Grade B" );}
else if (score>=71){
System.out.println("The student grade is Grade C" );}
else if (score>=61)
{System.out.println("The student grade is Grade D" );}
else if (score>=0)
{System.out.println("The student grade is Grade E" );}
else {
System.out.println("Invalid student score is entered");}
    }
}
