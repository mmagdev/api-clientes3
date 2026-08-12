package br.com.cotiinformatica.api_clientes.dtos;

import java.util.UUID;

public record ClienteRequestDto(
        String nome,
        String email,
        String cpf,
        UUID planoId

) {
}
