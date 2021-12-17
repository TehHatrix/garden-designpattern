package Garden;

public class SettingsSingleton {

    private SettingsSingleton instance;

    private SettingsSingleton() {

    }

    public SettingsSingleton getInstance() {
        if(instance == null){
            return new SettingsSingleton();
        }
        return instance;
    }
}
