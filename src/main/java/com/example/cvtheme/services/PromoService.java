package com.example.cvtheme.services;

import com.example.cvtheme.shared.dto.PromoDto;
import org.springframework.stereotype.Service;

public interface PromoService {
    PromoDto createPromo(PromoDto promoDto);
}
