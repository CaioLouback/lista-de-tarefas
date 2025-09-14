package br.com.caio.listadetarefas.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * @Data -> Faz os getters e setters, deixando o código mais limpo
 * @Setter -> Faz somente os setters
 * @Getter -> faz sometne os getters
 * Obs: Importante frisar que ao colocar as notations em cima
 * da classe irá criar a notation para toda a classe, caso seja
 * colocado somente em cima de um atributo, somente aquele atributo
 * terá a notation desejada
 */

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID") // Gerar o ID automaticamente
    private UUID id;// Chave primária, chave única para rep

    //Deixando assim as colunas do BD serão os atributos abaixo
    private String username;
    private String name;
    private String password;

    //Marcar quando foi criado
    @CreationTimestamp
    private LocalDateTime createdAt;


}
