package studio.dboo.restapiwithspring.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EventTest {


    @Test
    public void builder() throws Exception {
        Event event = Event.builder()
                .name("inflearn")
                .description("REST API")
                .build();

        assertThat(event).isNotNull();
    }

    @Test
    public void javaBeanRule() throws Exception {
        Event event = new Event();
        event.setName("dboo");
        assertNotNull(event);
        assertThat(event.getName()).isEqualTo("dboo");
    }

    @Test
    public void builder_() throws Exception {
        Event event = Event.builder()
                .name("inflearn")
                .description("REST API")
                .build();

        assertNotNull(event);
    }

    @Test
    public void javaBeanRule_() throws Exception {
        Event event = new Event();
        String dboo = "dboo";
        event.setName(dboo);
        assertNotNull(event);
        assertEquals(event.getName(), dboo);
    }










}