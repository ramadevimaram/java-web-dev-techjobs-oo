package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job myjob,myjob1,myjob2,myjob3,myjob4;
    @Before
    public void createObject() {
         myjob = new Job();
         myjob1 = new Job();
         myjob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         myjob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId() {
        //test that the ID values for the two objects are NOT the same and differ by 1.
        assertEquals(1,myjob1.getId()-myjob.getId());
        //Assert.assertTrue(EqualsBuilder.reflectionEquals(expected,actual));ssertEquals(2,myjob1.getId());
    }
    @Test
    public void testIdValuesTwoObjectsAreNotSame(){
        assertTrue(myjob.getId() < myjob1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        myjob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester",myjob3.getName());
        assertEquals("ACME",myjob3.getEmployer().getValue());
        assertEquals("Desert",myjob3.getLocation().getValue());
        assertEquals("Quality control",myjob3.getPositionType().getValue());
        assertEquals("Persistence",myjob3.getCoreCompetency().getValue());
    }
    //Test the equal method
    @Test
    public void testJobsForEquality(){
        assertFalse(myjob.equals(myjob1));
    }
    @Test
    public void testJobsForEqualityContent(){
        myjob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        myjob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false,myjob2.equals(myjob4));
    }
    // TODO: 1. Write test: When passed a Job object, it should return a string that contains a blank line before and after the job information
    // TODO: 2. Write test: The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.

    // TODO: 3. Write test: If a field is empty, the method should add, “Data not available” after the label.

    // TODO: 4. (Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
    @Test
    public void testToString()
    {
       Job myjob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedVal = "\n"+
                "ID:" + 13 +"\n"+
                "Name:" + "Product tester" +"\n"+
                "Employer:" + "ACME" +"\n"+
                "Location:" + "Desert" +"\n"+
                "PositionType:" + "Quality control" +"\n"+
                "CoreCompetency:" + "Persistence" +
                "\n"; // put the expected value here
        assertEquals( expectedVal,myjob5.toString());
    }

}