package org.grp29.ase.service;

import org.grp29.ase.model.User;

/**
 * DAO interface
 */
public interface DataAccess {
    public abstract User getUser(String username, String password);
}