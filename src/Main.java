public class Main {
    public static void main(String[] args) {

        MetodaTrapezow M_Trapezow = new MetodaTrapezow(4, 8, 5);
        MetodaProstokatow M_prostokatow = new MetodaProstokatow(4, 8, 5);
        MetodaSimpsona M_Simpsona = new MetodaSimpsona(4, 8, 5);

        M_Trapezow.start();
        M_prostokatow.start();
        M_Simpsona.start();

        while (M_prostokatow.isAlive() && M_Simpsona.isAlive() && M_Trapezow.isAlive()){
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double m_trapezow = M_Trapezow.getCalka();

        double m_simpsona = M_Simpsona.getCalka();

        double m_prostokatow = M_prostokatow.getCalka();

        System.out.println(m_trapezow + m_simpsona + m_prostokatow);

    }
}