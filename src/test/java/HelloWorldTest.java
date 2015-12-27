import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test(){
       assertThat("Hello World",is("Hello World"));
       assertThat(new HelloWorld().beenCalled(),is("Hello World"));
    }

    @Test
    public void should_be_mocked(){
        HelloWorld helloWorld = mock(HelloWorld.class);
        when(helloWorld.beenCalled()).thenReturn("Leave me alone.");

        assertThat(helloWorld.beenCalled(), is("Leave me alone."));
    }
}
