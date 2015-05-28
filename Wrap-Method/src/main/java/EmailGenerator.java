public class EmailGenerator
{
    public String generate()
    {
        StringBuilder emailText = new StringBuilder();

        emailText.append("Dear Bob");
        emailText.append("<br/>");
        emailText.append("  We are generating an email");
        emailText.append("<br/>");
        emailText.append("Thank You,");
        emailText.append("<br/>");
        emailText.append("The Team");

        return emailText.toString();
    }
}
