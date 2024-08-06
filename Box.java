class Box {
    double height, width, depth;

    Box() {
        height = width = depth = 0;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(double l) {
        height = width = depth = l;
    }

    Box(Box b) {
        height = b.height;
        width = b.width;
        depth = b.depth;
    }
}

class WeightBox extends Box {
    double weight;

    WeightBox() {
        super(); // Call the default constructor of the superclass
        weight = 0;
    }

    WeightBox(double height, double width, double depth, double weight) {
        super(height, width, depth); // Call the parameterized constructor of the superclass
        this.weight = weight;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        WeightBox wb = new WeightBox();
        System.out.println(wb.height);
    }
}
