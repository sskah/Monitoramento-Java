public class Main {
    public static void main(String[] args) {
        double temp = 10;
        try {
            validar(temp);
        }
        catch (LeituraInvalidaException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("X");
        }

    }

    private static void validar(double temp) throws LeituraInvalidaException {
        if(temp < -30 || temp > 30){
            throw new LeituraInvalidaException(5, temp);
        }
    }
}
