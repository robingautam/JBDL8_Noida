package org.gfg.JBDL8_SpringSecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationRequest {

    int id;
    String username;
    String password;
    String role;
}
