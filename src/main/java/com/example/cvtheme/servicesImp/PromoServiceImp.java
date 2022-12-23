package com.example.cvtheme.servicesImp;

import com.example.cvtheme.entities.PromoEntity;
import com.example.cvtheme.repositories.PromoRepository;
import com.example.cvtheme.services.PromoService;
import com.example.cvtheme.shared.dto.PromoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoServiceImp implements PromoService {
    @Autowired
    PromoRepository promoRepository;

    @Override
    public PromoDto createPromo(PromoDto promo) {
        PromoEntity promoEntity = new PromoEntity();
        BeanUtils.copyProperties(promo, promoEntity);
        PromoEntity newPromo = promoRepository.save(promoEntity);
        PromoDto promoDto = new PromoDto();
        BeanUtils.copyProperties(newPromo, promoDto);
        return promoDto;
    }
}
