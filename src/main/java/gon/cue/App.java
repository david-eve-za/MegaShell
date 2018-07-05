package gon.cue;

import java.io.File;
import java.util.Arrays;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        initializeLog4j();
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.getProperties().list(System.out);//<- show all properties
            //System.exit(0);

            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
            //System.exit(0);
        };
    }

    private static void initializeLog4j() {
        ConsoleAppender console = new ConsoleAppender(); // create appender
        // configure the appender
        String PATTERN = "%d [%p|%c|%C{1}] %m%n";
        console.setLayout(new PatternLayout(PATTERN));
        console.setThreshold(Level.ALL);
        console.activateOptions();
        // add appender to any Logger (here is root)
        Logger.getRootLogger().addAppender(console);

        FileAppender fa = new FileAppender();
        fa.setName("FileLogger");
        fa.setFile("INFO.log");
        fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
        fa.setThreshold(Level.ALL);
        fa.setAppend(true);
        fa.activateOptions();

        // add appender to any Logger (here is root)
        Logger.getRootLogger().addAppender(fa);
        // repeat with all other desired appenders
    }
}