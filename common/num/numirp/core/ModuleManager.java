package num.numirp.core;

import java.util.ArrayList;

public class ModuleManager {
    public static final ModuleManager INSTANCE = new ModuleManager();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private Phase phase = Phase.LOAD;

    public void register(Module module) {
        modules.add(module);
    }

    public void preInit() {
        phase = Phase.PREINIT;
        for (Module module : modules) {
            module.preInit();
        }
    }

    public void init() {
        phase = Phase.INIT;
        for (Module module : modules) {
            module.init();
        }
    }

    public void postInit() {
        phase = Phase.POSTINIT;
        for (Module module : modules) {
            module.postInit();
        }
        phase = Phase.FINISHED;
    }

    public Phase getPhase() {
        return phase;
    }

    public enum Phase {
        LOAD, PREINIT, INIT, POSTINIT, FINISHED;
    }
}
