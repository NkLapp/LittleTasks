package tehtoka;

public class TokaTehtNumerot {
    public int etsiMinHyppy(int[] taulukko) {
        int hyppy = 0;
        int minhyppy=0;

        if(taulukko.length == 0) {
            throw new RuntimeException("Tyhjä taulu: syötä talukkoon arvoja jotta voidaan Min arvo laskea.");
        }

        for(int i=1; i < taulukko.length; i++) {
            hyppy = Math.abs((taulukko[i]) - taulukko[i-1])-1;
            if (hyppy > 0) {
                if (hyppy < minhyppy || minhyppy == 0) {
                    minhyppy = hyppy;
                }
            }

        }
        return minhyppy;
    }

}
