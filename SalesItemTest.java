import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
        assertEquals(true, salesIte1.addComment("A","A",1));
        assertEquals(false,salesIte1.addComment("A","A",1));
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
        assertEquals(true, salesIte1.addComment("A","A",7));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }
    
    @Test
    public void testMostHelpfulComment()
    {
        SalesItem Zamboni = new SalesItem("test name", 1000);
        Zamboni.addComment("Joshua Black","A",1);
        Zamboni.upvoteComment(1);
        Zamboni.addComment("Jack Black","A",1);
        Zamboni.downvoteComment(2);
        Comment  mostheap = Zamboni.findMostHelpfulComment();
        assertEquals(mostheap, Zamboni.findMostHelpfulComment());
    }
    @Test
    public void sfalse()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals(false, salesIte1.addComment("A","A",-1));
    }
}
