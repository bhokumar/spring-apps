package org.smartrobo.apps.security.config.encoders;

import org.springframework.security.crypto.password.PasswordEncoder;

public class RobotPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return true;
    }
}
