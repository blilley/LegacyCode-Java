import java.util.List;

public class EmailGenerator {

    public String generate() {
        UserRepository userRepo = new UserRepository();
        StringBuilder emailText = new StringBuilder();
        EmailGreetingGenerator greetingGenerator = new EmailGreetingGenerator();

        List<String> userNames = userRepo.getAllUserNames();

        emailText.append(greetingGenerator.generate());
        emailText.append("  The users for this month are:");
        emailText.append("<br/>");

        for (String name : userNames){
            emailText.append("      ");
            emailText.append(name);
            emailText.append("<br/>");
        }
        emailText.append("Thank you,");
        emailText.append("<br/>");
        emailText.append("Your System");

        return emailText.toString();
    }
}
