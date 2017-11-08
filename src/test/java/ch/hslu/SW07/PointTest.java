package ch.hslu.SW07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PointTest {

    @Test
    public void testEquals() throws Exception {
        EqualsVerifier.forClass(Point.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).verify();
    }

}