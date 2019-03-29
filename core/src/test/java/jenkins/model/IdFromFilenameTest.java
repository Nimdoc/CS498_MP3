package jenkins.model;

import jenkins.model.IdStrategy;

import hudson.util.FormValidation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


@RunWith(PowerMockRunner.class)
public class IdFromFilenameTest {
	
	@Mock
    Jenkins jenkins;
	
	IdStrategy strategy = new IdStrategy.CaseSensitive();
	
	@Test
	public void testRegularFilename() {
		
		String new_filename = strategy.idFromFilename("file.txt");
		
		assertEquals("file.txt", new_filename);
	}
}
