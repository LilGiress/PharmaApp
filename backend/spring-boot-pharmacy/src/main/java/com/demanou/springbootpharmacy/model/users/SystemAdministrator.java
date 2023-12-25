package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="system_administrators")
@DiscriminatorValue("SYSTEM_ADMIN")
@AllArgsConstructor
@NoArgsConstructor
public class SystemAdministrator extends User{
}
