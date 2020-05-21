package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.service.WishListService;
import com.mycompany.myapp.domain.WishList;
import com.mycompany.myapp.repository.WishListRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link WishList}.
 */
@Service
@Transactional
public class WishListServiceImpl implements WishListService {

    private final Logger log = LoggerFactory.getLogger(WishListServiceImpl.class);

    private final WishListRepository wishListRepository;

    public WishListServiceImpl(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    /**
     * Save a wishList.
     *
     * @param wishList the entity to save.
     * @return the persisted entity.
     */
    @Override
    public WishList save(WishList wishList) {
        log.debug("Request to save WishList : {}", wishList);
        return wishListRepository.save(wishList);
    }

    /**
     * Get all the wishLists.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<WishList> findAll() {
        log.debug("Request to get all WishLists");
        return wishListRepository.findAll();
    }


    /**
     * Get one wishList by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<WishList> findOne(Long id) {
        log.debug("Request to get WishList : {}", id);
        return wishListRepository.findById(id);
    }

    /**
     * Delete the wishList by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete WishList : {}", id);

        wishListRepository.deleteById(id);
    }
}
