package labEx4.labEx4_App;

public class StorageFactory {
    public static Storage getStorage(){
        return new StorageImpl();
    }
}
