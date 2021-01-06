public class AudiFactory extends ArabaFactory {
    @Override
    public Araba arabaUret()
    {
        return new Audi();
    }
}
