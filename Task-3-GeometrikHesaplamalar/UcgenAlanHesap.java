public class ÜçgenHero {
    public static void main(String[] args) {
        // Üçgenin kenarları
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        //Math.sqrts kullanarak alan bulma
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Üçgen Alanı : " + alan);
    }
}
