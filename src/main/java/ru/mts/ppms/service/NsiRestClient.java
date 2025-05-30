package ru.mts.ppms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.mts.ppms.dto.response.VodContractDto;

@FeignClient(url = "${nsi.url}", name = "nsiRestClient")
public interface NsiRestClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "${vod-contract.path}/{crmsId}")
    VodContractDto getVodContract(@PathVariable("crmsId") Long crmsId);
}
