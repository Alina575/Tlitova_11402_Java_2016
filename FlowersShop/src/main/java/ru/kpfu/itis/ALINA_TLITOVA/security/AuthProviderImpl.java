package ru.kpfu.itis.ALINA_TLITOVA.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.ALINA_TLITOVA.models.User;
import ru.kpfu.itis.ALINA_TLITOVA.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alina Tlitova
 *         11-402
 */


public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();

        User user = userRepository.findByLogin(login);

        if (user == null) {
            throw new UsernameNotFoundException("user wasn't found");
        }

        String password = authentication.getCredentials().toString();

        if (user != null && user.getPassword() != null) {
            if (!encoder.matches(password, user.getPassword())) {
                throw new BadCredentialsException("invalid password");
            }
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (user != null) {
            authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
        }

        UsernamePasswordAuthenticationToken person = null;

        if (user != null) {
            person = new UsernamePasswordAuthenticationToken(user, null, authorities);
        }

        return person;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
