package echo.task;

public enum TaskType {
    TODO("T"),
    DEADLINE("D"),
    EVENT("E");
    private String symbol;
    TaskType(String symbol) {
        this.symbol = symbol;
    }
    public String getTypeSymbol() {
        return this.symbol;
    }
}
