/* 
    Crear un programa que, dado un peso de la Tierra, calcule su equivalente en la Luna.
    El programa debe mostrar por pantalla un mensaje similar a este: “Un peso de 30 kilos en la Tierra equivalen a X kilos en la Luna”
*/

public class M1_01 {
    public static void main(String[] args)
    {
        //Si no se pasan argumentos salir.
        if (args.length != 1)
        {
            System.out.println("\nEs necesario introducir al menos 1 parámetro numérico.");
            return;
        }

        // Validar que sea un double/int
        try{
            Double.parseDouble(args[0]);
        } catch (NumberFormatException e)
        {
            System.out.println("\nEl valor introducido no es un número válido.");
            return;
        }
        
        //Constante relación gravedad Luna -> Tierra    
        final double MOON_GRAVITY = 0.17;
        double moonMass = MOON_GRAVITY * Double.valueOf(args[0]);
        System.out.println("\nUn peso de " + args[0] + " kilos en la Tierra equivalen a " +  moonMass + " kilos en la\r\n" + //
                        "Luna");
    }
}
