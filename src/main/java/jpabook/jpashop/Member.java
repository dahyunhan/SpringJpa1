package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//lombok
@Getter @Setter
public class Member {
    
    @Id
    //id 자동생성
    @GeneratedValue
    private Long id;
    private String username;
}
