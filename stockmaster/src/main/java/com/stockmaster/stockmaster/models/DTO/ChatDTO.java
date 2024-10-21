package com.stockmaster.stockmaster.models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatDTO {
    private String message;
    private String idUser;
    private String idIncidence;

}
