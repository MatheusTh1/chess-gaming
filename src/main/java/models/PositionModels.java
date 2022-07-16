package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PositionModels {
    private int row;
    private int column;

    @Override
    public String toString() {
        return "Posição: linha= " + row + ", coluna= " + column;
    }
}
