package Testing.A04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void eachUseValid() {
    	assertEquals(false, (App.valid(new Person(true, 64, true, true, true), 499)));
    	assertEquals(true, (App.valid(new Person(false, 65, false, true, false), 500)));
    	assertEquals(false, (App.valid(new Person(true, 66, true, false, false), 501)));
    }
    @Test
    public void eachUseLevel0() {
    	assertEquals(2.0,(App.level0(new Person(true, 22, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level0(new Person(true, 23, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level0(new Person(true, 24, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level0(new Person(true, 64, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level0(new Person(true, 65, true, true, true))), 0.0);
    	assertEquals(1.0,(App.level0(new Person(true, 66, true, true, true))), 0.0);
    	
    }
    @Test
    public void eachUseLevel1() {
    	assertEquals(3.5,(App.level1(new Person(true, 22, true, true, true))), 0.0);
    	assertEquals(5.0, (App.level1(new Person(true, 23, true, true, true))),0.0);
    	assertEquals(5.0, (App.level1(new Person(true, 24, true, true, true))),0.0);
    	assertEquals(5.0,(App.level1(new Person(true, 64, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level1(new Person(true, 65, true, true, true))), 0.0);
    	assertEquals(2.5,(App.level1(new Person(true, 66, true, true, true))), 0.0);
    	
    }
    @Test
    public void eachUseLevel2() {
    	assertEquals(5.0,(App.level2(new Person(true, 64, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level2(new Person(true, 65, true, true, true))), 0.0);
    	assertEquals(6.0,(App.level2(new Person(true, 66, true, true, true))), 0.0);
    	
    }
    @Test
    public void eachUseLevel3() {
    	assertEquals(6.0,(App.level3(new Person(true, 22, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level3(new Person(true, 23, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level3(new Person(true, 24, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level3(new Person(true, 64, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level3(new Person(true, 65, true, true, true))), 0.0);
    	assertEquals(7.5,(App.level3(new Person(true, 66, true, true, true))), 0.0);
    	
    }
    @Test
    public void eachUseLevel4() {
    	assertEquals(7.5, (App.level4(new Person(true, 22, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level4(new Person(true, 23, true, true, true))), 0.0);
    	assertEquals(5.0,(App.level4(new Person(true, 24, true, true, true))), 0.0);
    	
    }
    @Test
    public void eachUseRun() {
    	try {
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 99)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 100)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 101)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 199)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 200)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 201)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 299)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 301)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 499)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 500)), 0.0);
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 501)), 0.0);
		} catch (NotAllowedException e) {
			
		}
    	
    }
    @Test
    public void pairwiseRun() {
    	try {
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 99)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 99)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 100)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 100)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 101)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 101)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 199)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 199)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 200)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 200)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 201)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 201)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 299)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 299)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 300)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 300)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 301)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 301)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 499)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 499)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 500)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 500)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 501)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 501)));
		} catch (NotAllowedException e) {
			
		}
    	
    }
    @Test
    public void decisionlevel0() {
    	assertEquals(2.0, (App.level0(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level0(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(1.0, (App.level0(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level0(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void decisionlevel1() {
    	assertEquals(3.5, (App.level1(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level1(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(2.5, (App.level1(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level1(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void decisionlevel2() {
    	assertEquals(6.0, (App.level2(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level2(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void decisionlevel3() {
    	assertEquals(6.0, (App.level3(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level3(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(7.5, (App.level3(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level3(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void decisionlevel4() {
    	assertEquals(7.5, (App.level4(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level4(new Person(false, 24, false, true, false))), 0.0);
    }
    @Test
    public void decisionValid() {
    	assertEquals(true, (App.valid(new Person(false, 66, false, true, false), 499)));
    	assertEquals(false, (App.valid(new Person(true, 64, true, false, true), 501)));
    }
    @Test
    public void decisionRun() {
    	try {
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 99)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 101)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 199)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 201)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 300)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 301)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 500)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 501)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 501)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 499)));
    	} catch (NotAllowedException e) {
			
		}
    	
    }
    @Test
    public void mcdclevel0() {
    	assertEquals(2.0, (App.level0(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level0(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(1.0, (App.level0(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level0(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void mcdclevel1() {
    	assertEquals(3.5, (App.level1(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level1(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(2.5, (App.level1(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level1(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void mcdclevel2() {
    	assertEquals(6.0, (App.level2(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level2(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void mcdclevel3() {
    	assertEquals(6.0, (App.level3(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level3(new Person(false, 24, false, true, false))), 0.0);
    	assertEquals(7.5, (App.level3(new Person(false, 66, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level3(new Person(false, 64, false, true, false))), 0.0);
    }
    @Test
    public void mcdclevel4() {
    	assertEquals(7.5, (App.level4(new Person(false, 22, false, true, false))), 0.0);
    	assertEquals(5.0, (App.level4(new Person(false, 24, false, true, false))), 0.0);
    }
    @Test
    public void mcdcValid() {
    	assertEquals(true, (App.valid(new Person(false, 66, false,true, false), 499)));
    	assertEquals(false, (App.valid(new Person(true, 66, true, false, true), 501)));
    }
    @Test
    public void mcdcRun() {
    	try {
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 99)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 101)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 199)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 201)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 300)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 301)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 500)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 501)));
			assertEquals(5.0, (App.run(new Person(false, 38, false, true, false), 501)), 0.0);
			assertEquals(NotAllowedException.class, (App.run(new Person(true, 38, true, false, true), 499)));
    	} catch (NotAllowedException e) {
			
		}
    }
}
