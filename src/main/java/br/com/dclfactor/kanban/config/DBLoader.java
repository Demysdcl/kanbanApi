package br.com.dclfactor.kanban.config;

import br.com.dclfactor.kanban.task.StatusEnum;
import br.com.dclfactor.kanban.task.Task;
import br.com.dclfactor.kanban.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DBLoader implements CommandLineRunner {

    @Autowired
    private TaskRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(Arrays.asList(
                new Task(null, "Vue JS", "Estudar Vue para ser feliz e viver!!! <3", StatusEnum.TODO),
                new Task(null, "React JS", "Estudar React e sofrer um pouco!!! <3", StatusEnum.TODO),
                new Task(null, "Angular whatever", "Estudar Angular... e ficar para traz!!! <3", StatusEnum.DONE),
                new Task(null, "Kotlin", "Logo estará batendo sua porta", StatusEnum.TODO),
                new Task(null, "Go", "Vamos lá", StatusEnum.TODO),
                new Task(null, "Java", "Só os melhores", StatusEnum.TODO),
                new Task(null, "Javascript", "Pode salvar sua carreira", StatusEnum.DONE),
                new Task(null, "PWA", "Se você não sabe o que é, é melhor procurar saber", StatusEnum.DOING),
                new Task(null, "Elixir", "Mais uma para tentar tirar o C de circulação", StatusEnum.DOING),
                new Task(null, "Web Assemble", "Promete a melhor perfomance no browser", StatusEnum.DONE),
                new Task(null, "ELM", "Quer ser a substituta do Javascript", StatusEnum.DOING),
                new Task(null, "Node JS", "Elevou o Javascript as alturas", StatusEnum.DONE),
                new Task(null, "Híbridos", "Vão morrer com a chegada do PWA e React Native", StatusEnum.DOING),
                new Task(null, "Android", "Só viverá em APPs extremamente nativos", StatusEnum.TODO),
                new Task(null, "Rust", "Promete velocidade para o sistema", StatusEnum.DOING),
                new Task(null, "Brave", "O browser que irá ser o mais popular em breve", StatusEnum.DOING),
                new Task(null, "Webstorm", "Por favor comprem uma licença para mim", StatusEnum.DONE),
                new Task(null, "Python", "Se consagrando na comunidade DEV", StatusEnum.DOING)
            ));
    }
}
