public class Main {

    public static void main(String[] args) {

        String text = "The History of Russia begins with that of the East Slavs and the Finno-Ugric peoples. " +
            "The traditional beginning of Russian history is the establishment of Kievan Rus', " +
            "the first united Eastern Slavic state, in 882. The state adopted Christianity from the " +
            "Byzantine Empire in 988, beginning the synthesis of Byzantine and Slavic cultures that defined" +
            " Orthodox Slavic culture for the next millennium. Kievan Rus' ultimately disintegrated as a state " +
            "due to the Mongol invasions in 1237–1240 along with the resulting deaths of about half the population " +
            "of Rus'.\n" + "\n" + "After the 13th century, Moscow became a cultural center, and by the 18th century, " +
            "the Tsardom of Russia had grown to become the Russian Empire, stretching from eastern Poland to the " +
            "Pacific Ocean. Peasant revolts were common, and all were fiercely suppressed. " +
            "Russian serfdom was abolished in 1861, but the peasants fared poorly and often " +
            "turned to revolutionary pressures. In the following decades, reform efforts such as the " +
            "Stolypin reforms, the constitution of 1906, and the State Duma attempted to open and " +
            "liberalize the economy and political system, but the tsars refused to relinquish autocratic rule or " +
            "share their power.\n" + "\n" + "The Russian Revolution in 1917 was triggered by a combination of " +
            "economic breakdown, " + "war-weariness, and discontent with the autocratic system of government. " +
            "It initially brought " +
            "to power a coalition of liberals and moderate socialists, but their failed policies led to seizure " +
            "of power by the communist Bolsheviks on 25 October.";

        String[] words = text.split("[\\s,?/.!:()]+");
        for (int i=0; i<words.length; i++)
        {
            System.out.println(words[i]);
        }
        System.out.println("Text length: " + words.length);
    }
}
