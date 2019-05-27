package codingdojo;

public class StoreEvent {
    private long storeProfile;
    private String name;
    private String storeType;

    public StoreEvent(String name, String storeType, long storeProfile) {
        this.storeProfile = storeProfile;
        this.name = name;
        this.storeType = storeType;
    }

    public String getStoreType() {
        return storeType;
    }

    public long getStoreProfile() {
        return storeProfile;
    }


    public String getName() {
        return name;
    }
}
