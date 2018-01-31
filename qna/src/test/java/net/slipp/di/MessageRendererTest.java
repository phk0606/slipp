package net.slipp.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/di.xml"})
public class MessageRendererTest {
	@Autowired
	private MessageRenderer messageRenderer;

	@Test
	public void test() {
		messageRenderer.render();
	}

}
