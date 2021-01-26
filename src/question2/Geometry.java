package question2;

import java.util.Objects;

public class Geometry {
    private String type;
    private String color;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static int surface(int i, int i1) {
        return i * i1;
    }

    public static int perimeter(int i) {
        return i * 4;
    }

    @Override
    public String toString() {
        return "Type:" + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry geometry = (Geometry) o;
        return type.equals(geometry.type);
    }
}
