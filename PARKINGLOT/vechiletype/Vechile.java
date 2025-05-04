package vechiletype;

public class Vechile {
    private String vechileNumber;
    private VechileType vechileType;

    public Vechile(String vechileNumber, VechileType vechileType) {
        this.vechileNumber = vechileNumber;
        this.vechileType = vechileType;
    }

    public String getVechileNumber() {
        return this.vechileNumber;
    }

    public VechileType getVechileType() {
        return this.vechileType;
    }
}
