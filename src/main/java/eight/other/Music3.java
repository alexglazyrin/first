package eight.other;

public class Music3 {
    private static RandomInstrumentsGenerator gen = new RandomInstrumentsGenerator();
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        for(int i=0; i<instruments.length; i++){
            instruments[i] = gen.next();
        }
        for(Instrument instr : instruments)
            instr.play(Note.MIDDLE_C);
        /*Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Hat();
        }; */
        //tuneAll(orchestra);
    }
}
