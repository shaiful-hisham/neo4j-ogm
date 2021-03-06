/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 *  conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package org.neo4j.ogm.domain.linkedlist;

import org.neo4j.ogm.annotation.Relationship;

/**
 * @author Vince Bickers
 */
public class Item {

    @Relationship(type = "NEXT", direction = Relationship.OUTGOING)
    public Item next;
    @Relationship(type = "NEXT", direction = Relationship.INCOMING)
    public Item previous;
    private Long id;
    private String name;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
