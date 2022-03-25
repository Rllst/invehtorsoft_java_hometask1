import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class ArrayChallengerTest {
    @Test
    public void EmptyArrayTest(){
        Assertions.assertEquals(ArrayChallenger.arrayChallenge(new Integer[]{}),"yes");
    }
    @Test
    public void ArrayWithWrongPairsTest(){
        Assertions.assertEquals(ArrayChallenger.arrayChallenge(new Integer[]{6, 2, 2, 6, 5, 14, 14, 1}),"5,14,14,1");
    }
    @Test
    public void ArrayWithEqualPairTest(){
        Assertions.assertEquals(ArrayChallenger.arrayChallenge(new Integer[]{2,1,1,2,3,3}),"3,3");
    }
    @Test
    public void MatchingArrayTest(){
        Assertions.assertEquals(ArrayChallenger.arrayChallenge(new Integer[]{5,4,6,7,7,6,4,5}),"yes");
    }
}
