public class SwitchStatementDemo {
    public static void main(String[] args) {
        // Declare Day Variable (Integer)
        int dayOfWeek = 4; // Represents Thursday

        // Switch Statement for Day of the Week
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday: Start of the week!");
                break;
            case 2:
                System.out.println("Tuesday: Keep going!");
                break;
            case 3:
                System.out.println("Wednesday: Halfway there!");
                break;
            case 4:
                System.out.println("Thursday: Almost there.");
                break;
            case 5:
                System.out.println("Friday: Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday: Enjoy your weekend!");
                break;
            case 7:
                System.out.println("Sunday: Time to relax!");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        // Declare Grade Variable (Character)
        char studentGrade = 'B';

        // Switch Statement for Grade Evaluation
        switch (studentGrade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair effort, keep improving!");
                break;
            case 'D':
                System.out.println("Needs more work.");
                break;
            case 'F':
                System.out.println("Failed. Try again!");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
