package constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import interfaces.IRenderable;

public class RenderableHolder {
    private static final RenderableHolder instance = new RenderableHolder();

    private List<IRenderable> entities;
    private Comparator<IRenderable> comparator;
    
    static {
        loadResource();
    }

    public RenderableHolder() {
        entities = new ArrayList<IRenderable>();
        comparator = (IRenderable o1, IRenderable o2) -> {
            if (o1.getZ() > o2.getZ())
                return 1;
            return -1;
        };
    }

    public static RenderableHolder getInstance() {
        return instance;
    }

    public static void loadResource() {
        
    }

    public void add(IRenderable entity) {
        System.out.println("add");
        entities.add(entity);
        Collections.sort(entities, comparator);
        
    }

    public void update() {
        for (int i = entities.size() - 1; i >= 0; i--) {
            if (entities.get(i).isDestroy())
                entities.remove(i);
        }
    }

    public List<IRenderable> getEntities() {
        return entities;
    }
}