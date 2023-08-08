package com.obat.obatservice.feignclient;

import com.obat.obatservice.model.KategoriDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@FeignClient(name = "kategori", url = "http://crud-kategori-production.up.railway.app/") // iki isi en sesuai nama app microservice nak eureka e
public interface KategoriFeignClient {
    @GetMapping("/all")
    List<KategoriDTO> getAllKategori();

    @GetMapping("/{id}")
    KategoriDTO getKategoriById(@PathVariable Long id);
}
