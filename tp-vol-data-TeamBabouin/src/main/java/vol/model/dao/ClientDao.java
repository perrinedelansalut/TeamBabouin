/**
 * 
 */
package vol.model.dao;

import java.util.List;

import vol.model.Client;

/**
 * @author ajc
 *
 */
public interface ClientDao extends Dao<Client, Integer> {

	List<Integer> statsTypeClient();
}
