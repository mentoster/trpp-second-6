package ru.mirea.trpp_second_6.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {

    public HealthResponse(String string) {
        status = string;
    }

    /** Статус работы. */
    private String status;

}
