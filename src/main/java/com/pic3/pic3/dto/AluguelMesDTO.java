package com.pic3.pic3.dto;

public class AluguelMesDTO {
    private Integer mes;
    private Long total;

    public AluguelMesDTO(Integer mes, Long total) {
        this.mes = mes;
        this.total = total;
    }

    public Integer getMes() { return mes; }
    public Long getTotal() { return total; }
}
