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
        assertEquals(7,myjob.getId());
        //Assert.assertTrue(EqualsBuilder.reflectionEquals(expected,actual));ssertEquals(2,myjob1.getId());
    }
    @Test
    public void testIdValuesTwoObjectsAreNotSame(){
        assertTrue(myjob.getId() < myjob1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        myjob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(myjob3,myjob2);
    }
    //Test the equal method
    @Test
    public void testJobsForEquality(){
        assertTrue(myjob2.equals(myjob4));
    }
}
