import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

    public static void main(String[] args) throws Exception{

        final Dotenv dotenv = Dotenv.load();
        final String botToken = dotenv.get("BOT_TOKEN");

        JDA bot = JDABuilder.createDefault(botToken).
            setActivity(Activity.playing("IntelliJ IDEA")).build();

    }
}
