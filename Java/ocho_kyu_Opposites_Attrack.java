/*

Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
        
*/
// NO RESUELTO!
public class ocho_kyu_Opposites_Attrack {

    class OppositesAttract {
        
        public static boolean isLove(final int flower1, final int flower2) {
            // esto hay que probarlo
            int resultado = flower1 / flower2;
            System.out.println(resultado);
            System.out.println(Math.ceil(resultado));
            if (resultado % 2 == 0) { // 6,1 es true!? ,, 0,12 es true?! NO!
                return true;
            }
            return false;
        }

        isLove(825, 287);

    }

}
