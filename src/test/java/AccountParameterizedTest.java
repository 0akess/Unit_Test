import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@DisplayName("Проверка метода checkNameToEmboss")
public class AccountParameterizedTest {
    private final String name;
    private final boolean expected;

    public AccountParameterizedTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: \"{0}\"")
    public static Object[][] getResult() {
        return new Object[][] {
                {"два  пробела", false},
                {"правильный вариант", true},
                {" пробел в_начале", false},
                {"тр", false},
                {" пробел", false},
                {"мноооооооогоооооо символооооов", false},
                {"пробел в_конце ", false},
                {"много про белов", false},
        };
    }

    @Test
    public void checkName(){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
