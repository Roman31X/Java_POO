package FundamentosPOO;

public class Casa {
    private Colores color;

    public Casa() {
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "color='" + color + '\'' +
                '}';
    }
}
