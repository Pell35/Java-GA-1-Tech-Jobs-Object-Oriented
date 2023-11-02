package org.launchcode.techjobs.oo;

import org.junit.Test;

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
        assertTrue(job1.getName() == "Product Tester");
        assertEquals("Product Tester", job1.getName());
        assertTrue(job1.getEmployer().getValue().equals("ACME"));
        assertEquals("ACME", job1.getEmployer().getValue());
        assertTrue(job1.getLocation().getValue().equals("Desert"));
        assertEquals("Desert", job1.getLocation().getValue());
        assertTrue(job1.getPositionType().getValue().equals("Quality Control"));
        assertEquals("Quality Control", job1.getPositionType().getValue());
        assertTrue(job1.getCoreCompetency().getValue().equals("Persistence"));
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(job1.getId() == job2.getId());

    }
}
