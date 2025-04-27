package module.dao;

import module.dto.Equipos;

import java.util.List;

public class EquiposImpl implements IEquipos {
    /**
     * @return 
     */
    @Override
    public List<Equipos> getAll() {
        return List.of();
    }

    /**
     * @param ID 
     * @return
     */
    @Override
    public Equipos getByID(String ID) {
        return null;
    }

    /**
     * @param ID 
     * @return
     */
    @Override
    public Equipos updateByID(String ID) {
        return null;
    }

    /**
     * @param ID 
     * @return
     */
    @Override
    public int deleteByID(String ID) {
        return 0;
    }

    /**
     * @param obj 
     * @return
     */
    @Override
    public int insertOne(Equipos obj) {
        return 0;
    }
}
