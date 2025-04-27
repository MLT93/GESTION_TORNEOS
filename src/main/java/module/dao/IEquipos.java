package module.dao;

import module.dto.Equipos;
import java.util.List;

public interface IEquipos {
    
    List<Equipos> getAll();
    Equipos getByID(String ID);
    Equipos updateByID(String ID);
    int deleteByID(String ID);
    int insertOne(Equipos obj);
}
