package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JobTest {

//    private Job job;

//    @Before
//    public void makeJobObjects() {
//        job = new Job();
//        job.nextId(1);
//    }
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }


    @Test
    public void testSettingJobId() {
    Job jobOne;
    jobOne = new Job();
    Job jobTwo = new Job();
    int idOne;
    idOne = jobOne.getId();
    int idTwo;
    idTwo = jobTwo.getId();
    int diff = idOne - idTwo;
    int value = Math.abs(diff);
    assertTrue(value == 1);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        Job job_test;
        job_test = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(job_test instanceof Job);

        assertTrue(job_test.getName() != null);

        assertTrue(job_test.getEmployer() != null);

        assertTrue(job_test.getLocation() != null);

        assertTrue(job_test.getPositionType() != null);

        assertTrue(job_test.getCoreCompetency() != null);



        assertThat("Product Tester", is(job_test.getName()));

        assertThat("ACME", is(job_test.getEmployer().getValue()));

        assertThat("Desert", is(job_test.getLocation().getValue()));

        assertThat("Quality Control", is(job_test.getPositionType().getValue()));

        assertThat("Persistence", is(job_test.getCoreCompetency().getValue()));


    }


    @Test
    public void testJobsForEquality() {
        Job job_test = new Job();
        Job job_testTwo = new Job();
        assertFalse(job_test == job_testTwo);
    }


    @Test
    public void testToString() {

        Job job_testIdOne;
        Job job_testIdTwo;

        job_testIdOne = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job_testIdTwo = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertThat("\n" + "ID: " + job_testIdOne.getId() + "\n" + "Name: " + job_testIdOne.getName() + "\n" + "Employer: " + job_testIdOne.getEmployer() + "\n" + "Location: " + job_testIdOne.getLocation() + "\n" + "Position Type: " + job_testIdOne.getPositionType().getValue() + "\n" + "Core Competency: " + job_testIdOne.getCoreCompetency() + "\n", is(job_testIdOne.toString()));

        assertThat("\n" + "ID: " + job_testIdTwo.getId() + "\n" + "Name: " + "Data not available" + "\n" + "Employer: " + job_testIdTwo.getEmployer() + "\n" + "Location: " + job_testIdTwo.getLocation() + "\n" + "Position Type: " + job_testIdTwo.getPositionType().getValue() + "\n" + "Core Competency: " + job_testIdTwo.getCoreCompetency() + "\n", is(job_testIdTwo.toString()));

    }

}
