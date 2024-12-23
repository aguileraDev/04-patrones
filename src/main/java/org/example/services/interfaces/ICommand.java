package org.example.services.interfaces;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public interface ICommand<T> {
    T execute();
}
