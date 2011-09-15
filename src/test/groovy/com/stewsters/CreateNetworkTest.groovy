package com.stewsters

import org.codehaus.groovy.runtime.InvokerHelper
import org.junit.Test
import static org.junit.Assert.*

class PersonTest {
    @Test public void canConstructAPerson() {
        Person p = new Person(name: 'name')
        assertEquals('name', p.name)
    }

    @Test public void usingCorrectVersionOfGroovy() {
        assertEquals('1.6.7', InvokerHelper.version)
    }
}

