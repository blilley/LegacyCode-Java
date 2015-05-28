public class EmailGreetingGenerator {
    public String generate()
    {
        StringBuilder greetingText = new StringBuilder();
        greetingText.append("Attention:");
        greetingText.append("<br/>");

        return greetingText.toString();
    }
}
