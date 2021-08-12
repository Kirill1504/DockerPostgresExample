package tra.la.la.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class User {

    /**
     * Уникальный идентификатор пользователя
     */
    @Id
    @GeneratedValue
    private UUID id;

    /**
     * Имя
     */
    @Column
    private String firstName;

    /**
     * Отчество
     */
    @Column
    private String secondName;

    /**
     * Фамилия
     */
    @Column
    private String lastName;

    /**
     * Номер телефона
     */
    @Column
    private String phone;
}
