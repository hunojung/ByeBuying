package com.encore.byebuying.domain.basket.service;

import com.encore.byebuying.domain.basket.dto.BasketAddDTO;
import com.encore.byebuying.domain.basket.dto.BasketDeleteDTO;
import com.encore.byebuying.domain.basket.dto.BasketUpdateDTO;
import com.encore.byebuying.domain.basket.BasketItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public interface BasketService {


//    Page<Order> findByUsername(Pageable pageable, String username);
//    Page<Order> findByUsernameAndBetweenDate(Pageable pageable, String username, String start, String end) throws ParseException;

    Page<BasketItem> findByUserId(Pageable pageable, Long user_id);
    @Transactional
    void updateBasketItem(BasketUpdateDTO basketUpdateDTO);
    @Transactional
    void addBasketItem(BasketAddDTO basketAddDTO);
    @Transactional
    void deleteBasketItem(BasketDeleteDTO basketDeleteDTO);
}
