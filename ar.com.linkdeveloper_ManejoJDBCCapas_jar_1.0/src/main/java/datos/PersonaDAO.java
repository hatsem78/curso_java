package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author octavio
 */
public interface PersonaDAO {
    
    public List<PersonaDTO> select() throws SQLException;
    
    /**
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    public int insert(PersonaDTO persona) throws SQLException;
    
    /**
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    public int update(PersonaDTO persona) throws SQLException;
    
    /**
     *
     * @param persona
     * @return
     * @throws SQLException
     */    
    public int delete(PersonaDTO persona) throws SQLException;
    
}
