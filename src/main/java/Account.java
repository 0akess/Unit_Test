import io.qameta.allure.Step;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверка строки на возможность напечатать её на карте")
    public boolean checkNameToEmboss() {

        return name.length() >= 3
                && name.length() <= 19
                && name.split(" ").length == 2
                && !name.startsWith(" ")
                && !name.endsWith(" ");
    }
}