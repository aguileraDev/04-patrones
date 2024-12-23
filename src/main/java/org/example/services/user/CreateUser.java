package org.example.services.user;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.services.interfaces.ICommand;
import org.example.utils.ConsoleUtil;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateUser implements ICommand<User> {
    private UserRepository userRepository;

    public CreateUser(){
        this.userRepository = UserRepository.getInstance();
    }

    @Override
    public User execute(){
        String firstName = ConsoleUtil.captureString("Ingrese su nombre: ");
        String lastName = ConsoleUtil.captureString("Ingrese su apellido: ");
        String email = ConsoleUtil.captureString("Ingrese su correo electronico: ");
        String nationality = ConsoleUtil.captureString("Ingrese su nacionalidad: ");
        LocalDate birthDate = ConsoleUtil.captureDate("Ingrese su fecha de nacimiento (yyyy-mm-dd): ");
        String phoneNumber = ConsoleUtil.captureString("Ingrese su numero de telefono: ");
        User user = new User(firstName,lastName,email,nationality,phoneNumber,birthDate);
        userRepository.addUser(user);
        return user;
    }
}
