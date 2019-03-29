package jenkins.model;

import jenkins.model.IdStrategy;

import hudson.util.FormValidation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.io.File;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class idFromFilenameTest {
	
	@Mock
    Jenkins jenkins;
	
	IdStrategy strategy = new IdStrategy.CaseSensitive();
	
	@Test
	public void testRegularFilename() {
		
		String new_filename = strategy.idFromFilename("file.txt");
		
		assertEquals("file.txt", new_filename);
	}
	
	@Test
	public void testIrregularFilename() {
		
		String new_filename = strategy.idFromFilename("file.txt");
		
		assertEquals("file.txt", new_filename);
	}
}
