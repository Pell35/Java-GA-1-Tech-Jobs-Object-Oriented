package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.swing.text.Position;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.

public class JobTest {
    @Test
    //TODO: Create your unit tests here
    //Test 1
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        int job1Id = job1.getId();
        int job2Id = job2.getId();
        assertNotEquals(job1Id, job2Id);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertEquals("Product Tester", job1.getName());
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals("ACME", job1.getEmployer().getValue());
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals("Desert", job1.getLocation().getValue());
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", job1.getPositionType().getValue());
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertNotSame(job1, job2);

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job();
        String result = job1.toString();
        assertTrue(result.startsWith(System.lineSeparator()));
        assertTrue(result.endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String result1 = job1.toString();
        assertEquals((System.lineSeparator() + "ID: " + job1.getId() + "\n" + "Name: " + job1.getName() + "\n" + "Employer: " + job1.getEmployer().getValue() + "\n" + "Location: " + job1.getLocation().getValue() + "\n" + "Position Type: " + job1.getPositionType().getValue() + "\n" + "Core Competency: " + job1.getCoreCompetency().getValue() + System.lineSeparator()), result1);

    }
    @Test
    public void testToStringHandlesEmptyField(){
    Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job job2 = new Job();
    Job job3 = new Job("Product Tester", null, null, null, null);
    Job job4 = new Job(null, new Employer("ACME"), null, null, null);
    Job job5 = new Job(null, null, new Location("Desert"), null, null);
    Job job6 = new Job(null, null, null, new PositionType("Quality Control"), null);
    Job job7 = new Job(null, null, null,  null, new CoreCompetency("Persistence"));
    Job job8 = new Job("Product Tester", null,  new Location("Desert"), new PositionType("Quality Control"), null);
    String result1 = job1.toString();
    String result2 = job2.toString();
    String result3 = job3.toString();
    String result4 = job4.toString();
    String result5 = job5.toString();
    String result6 = job6.toString();
    String result7 = job7.toString();
    String result8 = job8.toString();

    assertEquals((System.lineSeparator() + "ID: " + job1.getId() + "\n" + "Name: " + job1.getName() +  "\n" + "Employer: " + job1.getEmployer().getValue() + "\n" + "Location: " + job1.getLocation().getValue() + "\n" + "Position Type: "  + job1.getPositionType().getValue() + "\n" + "Core Competency: " + job1.getCoreCompetency().getValue()  + System.lineSeparator()), result1);
    assertEquals((System.lineSeparator() + "OOPS! This job does not seem to exist." + System.lineSeparator()), result2);
    assertEquals((System.lineSeparator() + "ID: " + job3.getId() + "\n" + "Name: " + job3.getName() +  "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: "  + "Data not available" + "\n" + "Core Competency: " + "Data not available"  + System.lineSeparator()),result3);
    assertEquals((System.lineSeparator() + "ID: " + job4.getId() + "\n" + "Name: " + "Data not available" +  "\n" + "Employer: " + job4.getEmployer().getValue() + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: "  + "Data not available" + "\n" + "Core Competency: " + "Data not available"  + System.lineSeparator()),result4);
    assertEquals((System.lineSeparator() + "ID: " + job5.getId() + "\n" + "Name: " + "Data not available"  +  "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + job5.getLocation().getValue() + "\n" + "Position Type: "  + "Data not available" + "\n" + "Core Competency: " + "Data not available"  + System.lineSeparator()),result5);
    assertEquals((System.lineSeparator() + "ID: " + job6.getId() + "\n" + "Name: " + "Data not available"  +  "\n" + "Employer: " + "Data not available"  + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: "  + job6.getPositionType().getValue() + "\n" + "Core Competency: " + "Data not available"  + System.lineSeparator()),result6);
    assertEquals((System.lineSeparator() + "ID: " + job7.getId() + "\n" + "Name: " + "Data not available"  +  "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + "Data not available"  + "\n" + "Position Type: "  + "Data not available" + "\n" + "Core Competency: " + job7.getCoreCompetency().getValue()  + System.lineSeparator()),result7);
    assertEquals((System.lineSeparator() + "ID: " + job8.getId() + "\n" + "Name: " + job8.getName() +  "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + job8.getLocation().getValue() + "\n" + "Position Type: "  + job8.getPositionType().getValue()+ "\n" + "Core Competency: " + "Data not available" + System.lineSeparator()),result8);

    }
}
