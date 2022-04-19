public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        boolean isNameToEmboss = name.length() >= 3
                && name.length() <= 19
                && name.split(" ").length == 2
                && !name.startsWith(" ")
                && !name.endsWith(" ");

        return isNameToEmboss;
    }
}