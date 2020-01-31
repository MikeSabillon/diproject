package sabillon.diproject.components;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ByeComponent {

	public ByeComponent() {
		log.info("Bye component initialized");
	}

	public void sayGoodBye() {
		log.info("Bye dude!");
	}

}
