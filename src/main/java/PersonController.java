import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {
    private final List<Person> persons = new ArrayList<>();

    public PersonController() {
        persons.add(new Person( "alin","Bog",55));
        persons.add(new Person("mara","Sar",32));
    }

    @GetMapping
    public List<Person> getPersons() {
        return persons;
    }
    @GetMapping("/count")
    public int countPersons() {
        return persons.size();
    }
    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return persons.stream()
                .filter(p -> p.getId() == id).findFirst().orElse(null);
    }

}
