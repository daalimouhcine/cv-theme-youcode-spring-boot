package com.example.cvtheme.controllers;

import com.example.cvtheme.entities.PromoEntity;
import com.example.cvtheme.requests.PromoRequest;
import com.example.cvtheme.responses.PromoResponse;
import com.example.cvtheme.services.PromoService;
import com.example.cvtheme.shared.dto.PromoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/promo")
public class PromoController {
    @Autowired
    PromoService promoService;

    @GetMapping
    private PromoResponse getPromos() {
        List<PromoDto> promoList = promoService.getPromos();
    }

    @PostMapping
    private PromoResponse createPromo(@RequestBody PromoRequest promoRequest) {
        PromoDto promoDto = new PromoDto();
        BeanUtils.copyProperties(promoRequest, promoDto);
        PromoDto createPromo = promoService.createPromo (promoDto);
        PromoResponse promoResponse = new PromoResponse();
        BeanUtils.copyProperties(createPromo, promoResponse);
        return promoResponse;
    }

}
