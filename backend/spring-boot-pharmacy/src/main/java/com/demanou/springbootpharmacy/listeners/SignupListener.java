package com.demanou.springbootpharmacy.listeners;

import com.demanou.springbootpharmacy.events.SignupCompletedEvent;
import org.springframework.context.ApplicationListener;

public class SignupListener implements ApplicationListener<SignupCompletedEvent> {
    @Override
    public void onApplicationEvent(SignupCompletedEvent event) {
      // <>;
    }
}
