package esipe.fr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    // Test score utilisateurs

    @Test
    public void testPoorUserScore() {
        User userTest = new User();
        GameEngine game = new GameEngine(userTest, new NbAleatoireServiceStub(1));

        //Test si le score précedent était meilleur
        userTest.setScore(5);
        game.saveBestScrore(10, userTest);
        assertEquals(userTest.getScore(), 5);
    }
    @Test
    public void testSameUserScore() {
        User userTest = new User();
        GameEngine game = new GameEngine(userTest, new NbAleatoireServiceStub(1));

        //Test si le score précedent était identique
        userTest.setScore(5);
        game.saveBestScrore(5,userTest);
        assertEquals(userTest.getScore(), 5);
    }
    @Test
    public void testBetterUserScore() {
        User userTest = new User();
        GameEngine game = new GameEngine(userTest, new NbAleatoireServiceStub(1));

        //Test si le nouveau score est meilleur
        userTest.setScore(5);
        game.saveBestScrore(3,userTest);
        assertEquals(userTest.getScore(), 3);
    }



    //Test nombre trouvé par le joueur
    @Test
    public void testisCorrect() {
        User userTest = new User();
        GameEngine game = new GameEngine(userTest, new NbAleatoireServiceStub(5));

        assertTrue(game.isCorrect(5));
        assertFalse(game.isCorrect(10));
    }

}
