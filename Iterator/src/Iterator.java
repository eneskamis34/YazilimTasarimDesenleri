public abstract class Iterator {
    public abstract void First(); //imleci elemana getir
    public abstract void Next(); //imleci bir sonraki elemana getir
    public abstract boolean IsDone(); //koleksiyonun sonuna geldi
    public abstract int CurrentItem(); // imcelin şimdi gösterdiği değer
}
