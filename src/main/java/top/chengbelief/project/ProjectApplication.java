package top.chengbelief.project;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        log.info("#              __  __              ___       ___                          __      __                     __     \n" + "#             /\\ \\/\\ \\            /\\_ \\     /\\_ \\                        /\\ \\  __/\\ \\                   /\\ \\    \n" + "#             \\ \\ \\_\\ \\      __   \\//\\ \\    \\//\\ \\      ___              \\ \\ \\/\\ \\ \\ \\    ___    _ __   \\_\\ \\   \n" + "#              \\ \\  _  \\   /'__`\\   \\ \\ \\     \\ \\ \\    / __`\\             \\ \\ \\ \\ \\ \\ \\  / __`\\ /\\`'__\\ /'_` \\  \n" + "#               \\ \\ \\ \\ \\ /\\  __/    \\_\\ \\_    \\_\\ \\_ /\\ \\L\\ \\             \\ \\ \\_/ \\_\\ \\/\\ \\L\\ \\\\ \\ \\/ /\\ \\L\\ \\ \n" + "#                \\ \\_\\ \\_\\\\ \\____\\   /\\____\\   /\\____\\\\ \\____/              \\ `\\___x___/\\ \\____/ \\ \\_\\ \\ \\___,_\\\n" + "#                 \\/_/\\/_/ \\/____/   \\/____/   \\/____/ \\/___/                '\\/__//__/  \\/___/   \\/_/  \\/__,_ /\n" + "#                                                                                                               \n" + "#     ");
        log.info("********************************************************启动成功********************************************************");
    }
}
