package co.alectronic.palindrome;

import org.junit.Assert;
import org.junit.Test;

import static co.alectronic.palindrome.Main.ispalindrome;
import static co.alectronic.palindrome.Main.ispalindromeRec;

public class MainTest {


    @Test
    public void palindromeNothing(){
        Assert.assertTrue(ispalindromeRec(""));
    }

    @Test
    public void palindromeOneLetter(){
        Assert.assertTrue(ispalindrome("a"));
    }

    @Test
    public void palindromeTwoLetter(){ Assert.assertTrue(ispalindrome("aa")); }

    @Test
    public void palindromeEven(){
        Assert.assertTrue(ispalindrome("neveroddoreven"));
    }

    @Test
    public void palindromeOdd(){
        Assert.assertTrue(ispalindrome("hellolleh"));
    }

    @Test
    public void palindromeNull(){
        Assert.assertFalse(ispalindrome(null));
    }

    @Test
    public void palindromeWrongTwoLetter(){ Assert.assertFalse(ispalindrome("ab")); }

    @Test
    public void palindromeWrongEven(){
        Assert.assertFalse(ispalindrome("abcd"));
    }

    @Test
    public void palindromeWrongOdd(){
        Assert.assertFalse(ispalindrome("abcde"));
    }


//
// Recursive
//


    @Test
    public void palindromeRecNothing(){ Assert.assertTrue(ispalindromeRec("")); }

    @Test
    public void palindromeRecOneLetter(){
        Assert.assertTrue(ispalindromeRec("a"));
    }

    @Test
    public void palindromeRecTwoLetter(){ Assert.assertTrue(ispalindromeRec("aa")); }

    @Test
    public void palindromeRecEven(){
        Assert.assertTrue(ispalindromeRec("neveroddoreven"));
    }

    @Test
    public void palindromeRecOdd(){
        Assert.assertTrue(ispalindromeRec("hellolleh"));
    }

    @Test
    public void palindromeRecNull(){ Assert.assertFalse(ispalindromeRec(null)); }

    @Test
    public void palindromeRecWrongTwoLetter(){ Assert.assertFalse(ispalindromeRec("ab")); }

    @Test
    public void palindromeRecWrongEven(){
        Assert.assertFalse(ispalindromeRec("abcd"));
    }

    @Test
    public void palindromeRecWrongOdd(){
        Assert.assertFalse(ispalindromeRec("abcde"));
    }
}