package Test;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie1ver2Test {
    @Test
    public void stosTest(){
        Stos<String> stos = new Zadanie1ver2<>();
        stos.push("Ktosiek");
        stos.push("Cosiek");
        stos.push("Samosiek");
        stos.pop();

        String popWartość = stos.pop();


        Assertions.assertEquals("Cosiek", popWartość);
    }

}