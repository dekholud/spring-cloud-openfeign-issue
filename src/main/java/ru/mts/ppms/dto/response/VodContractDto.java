package ru.mts.ppms.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * DTO объект контракта VoD
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VodContractDto {
    private Long id;
    private String agreementNumberOebs;
    private String annexContractNumber;
    private Long additionalAgreementId;
    private String additionalAgreementNumber;
    private Long crmsId;
    private LocalDate conclusionDate;
    private LocalDate terminationDate;
    private Long statusId;
    @JsonProperty(value = "additionalParams")
    private String additionalInformation;
}
