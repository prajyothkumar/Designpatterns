package prototype;

public abstract class PrototypeCapable implements Cloneable {

    @Override
    public abstract PrototypeCapable clone();
}
