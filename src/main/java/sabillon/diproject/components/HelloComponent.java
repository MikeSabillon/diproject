package sabillon.diproject.components;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HelloComponent {

	public HelloComponent() {
		log.info("Hello Component Initialized");
	}

}
