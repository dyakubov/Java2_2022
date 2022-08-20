package Task3;

public class Main {
    public static void main(String[] args) {
        Box <Orange> orangeBox1 = new Box<>();
        Box <Apple> appleBox1 = new Box<>();
        Box <Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 5; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox1.add(new Apple());
        }
        System.out.println("Коробка яблоками 1: " + appleBox1.getWeight());
        System.out.println("Коробка с апельсинами 1: " + orangeBox1.getWeight());
        System.out.println("Коробка с апельсинами 2: " + orangeBox2.getWeight());
        System.out.println("Вес коробок одинаковый: " + appleBox1.compare(orangeBox1));

        orangeBox1.replace(orangeBox2);
        
        System.out.println("Коробка с апельсинами 1: " + orangeBox1.getWeight());
        System.out.println("Коробка с апельсинами 2: " + orangeBox2.getWeight());

    }
}
