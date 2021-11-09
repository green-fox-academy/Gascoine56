package com.example.backendapi.models.logs;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createdAt;
    private String endpoint;
    private String data;

    public Log(Date createdAt, String endpoint, String data) {
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", endpoint='" + endpoint + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}