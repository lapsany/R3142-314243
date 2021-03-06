import ru.ifmo.se.pokemon.*;
public class Wigglytuff extends Jigglypuff {
    public Wigglytuff(String name, int level) {
        super(name, level);
        setStats(140, 70, 45, 85, 50, 45);
        setType(Type.NORMAL,Type.FAIRY);
        this.addMove(new Facade());
        this.addMove(new Flamethrower());
        this.addMove(new WakeUpSlap());
    }
}