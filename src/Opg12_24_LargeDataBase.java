public class Opg12_24_LargeDataBase {
    //Laver en string med ranks
    String[] ranks = {"assistant", "associate", "full"};

    //Laver en getRank
    public String getRank(){
        return ranks[(int) Math.random()*ranks.length ];
    }

    //Laver en getSalary, der skal bruge en min løn+maks løn.
    private static double getSalary(int min, int max) {
        int range = max - min;
        return Math.random() * range + min;
    }
    //Her bliver min. og maks løn beskrevet efter rank, og derefter smidt op i getSalary, hvor den bliver returnet.
    private static double getSalaryEfterRank(String rank){
        int max = 0;
        int min = 0;
        switch (rank) {
            case "assistant":
                min = 50000;
                max = 80000;
                break;
            case "associate":
                min = 60000;
                max = 110000;
                break;
            case "full":
                min = 75000;
                max = 130000;
                break;
        }
        return getSalary(min, max + 1); //
    }



}



