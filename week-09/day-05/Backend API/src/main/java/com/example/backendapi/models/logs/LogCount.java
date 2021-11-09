package com.example.backendapi.models.logs;


import com.example.backendapi.models.logs.Log;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LogCount {

    private int logCount;
    private List<Log> logs;

    public LogCount(int logCount, List<Log> logs) {
        this.logCount = logCount;
        this.logs = logs;
    }

    @Override
    public String toString() {
        return "LogCount{" +
                "logCount=" + logCount +
                ", logs=" + logs +
                '}';
    }
}