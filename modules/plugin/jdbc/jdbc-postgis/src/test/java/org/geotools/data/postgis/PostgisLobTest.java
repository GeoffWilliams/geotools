package org.geotools.data.postgis;

import org.geotools.jdbc.JDBCLobTest;
import org.geotools.jdbc.JDBCLobTestSetup;

/**
 * 
 *
 * @source $URL$
 */
public class PostgisLobTest extends JDBCLobTest {

    @Override
    protected JDBCLobTestSetup createTestSetup() {
        return new PostgisLobTestSetup(new PostGISTestSetup());
    }

}
