package org.spring.changhf.config;

import org.junit.Test;
import org.spring.changhf.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot MessageConfiguration 测试 - {@link DemoConfiguration}
 *
 */
public class DemoConfigurationTest {

    @Test
    public void testGetMessageBean() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfiguration.class);
        assertEquals("message configuration", ctx.getBean("message"));
    }
}
