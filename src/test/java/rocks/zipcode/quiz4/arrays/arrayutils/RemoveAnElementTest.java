package rocks.zipcode.quiz4.arrays.arrayutils;

import com.sun.deploy.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.arrays.ArrayUtils;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RemoveAnElementTest {

    @Test
    public void removeAnElement() {
        //Given
        int remove = 2;
        String[] arr = {"c", "a", "b", "l", "e"};
        String[] expected = {"c", "a", "l", "e"};
        //When
        arr = ArrayUtils.removeAnElement(arr, remove);
        //Assert
        Assert.assertArrayEquals(expected, arr);
    }
}