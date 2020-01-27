package org.carlspring.strongbox.gremlin.adapters;

import java.util.Set;

import org.apache.tinkerpop.gremlin.structure.Element;
import org.carlspring.strongbox.data.domain.DomainObject;
import org.carlspring.strongbox.gremlin.dsl.EntityTraversal;

public interface EntityTraversalAdapter<S extends Element, E extends DomainObject>
{

    Set<String> labels();

    EntityTraversal<S, E> fold();

    UnfoldEntityTraversal<S, S> unfold(E entity);

    EntityTraversal<S, Element> cascade();

}