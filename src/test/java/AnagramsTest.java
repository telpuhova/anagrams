import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class AnagramsTest {
    @Test
    public void anagrams_checkIfTwoWordsAreTheSameLength_false() throws Exception {
        Anagrams anagrams = new Anagrams();
        Boolean expected = false;
        assertEquals(expected, anagrams.anagrams("thing", "blahblahblah"));
    }
    @Test
    public void anagrams_checkIfTwoWordsAreAnagrams_true() throws Exception {
        Anagrams anagrams = new Anagrams();
        Boolean expected = true;
        assertEquals(expected, anagrams.anagrams("met", "etm"));
    }
    @Test
    public void anagrams_returnFalseIfWordsAreNotAnagrams_false() throws Exception {
        Anagrams anagrams = new Anagrams();
        Boolean expected = false;
        assertEquals(expected, anagrams.anagrams("met", "ttt"));
    }
    @Test
    public void multiples_returnStringOnMultipleArgs_met_etm_mte_tem() throws Exception {
        Anagrams anagrams = new Anagrams();
        String expected = "met etm mte tem";
        assertEquals(expected, anagrams.multiple("met carrot etm mte tem"));
    }
    @Test
    public void multiples_returnStringOnMultipleArgsAndDifferentAnogramGroups_met_etm_mte_tem_cat_tac() throws Exception {
        Anagrams anagrams = new Anagrams();
        String expected = "met etm mte tem cat tac";
        assertEquals(expected, anagrams.multiple("met carrot etm mte cat tac tem"));
    }
    @Test
    public void multiples_returnStringOnMultipleArgsAndThreeAnogramGroups_met_etm_mte_tem_cat_tac_abcd_cabd_bdac() throws Exception {
        Anagrams anagrams = new Anagrams();
        String expected = "bdac abcd cabd cat tac top pot tpo tem met etm mte";
        assertEquals(expected, anagrams.multiple("bdac cat top tac tem abcd pot met carrot etm mte tpo cabd"));
    }
}