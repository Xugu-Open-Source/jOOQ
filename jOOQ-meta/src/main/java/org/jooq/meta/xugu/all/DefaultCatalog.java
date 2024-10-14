package org.jooq.meta.xugu.all;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import java.util.Arrays;
import java.util.List;

public class DefaultCatalog extends CatalogImpl {
    private static final long serialVersionUID = 2057570806;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final All ALL = All.ALL;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.<Schema>asList(
                All.ALL);
    }
}

