package com.sandcodes.estore.controller;

import com.sandcodes.estore.model.Advertisement;
import com.sandcodes.estore.model.Product;
import com.sandcodes.estore.repository.AdvertisementRepository;
import com.sandcodes.estore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/api/advertisement")
public class AdvertisementController {
    @Autowired
    private AdvertisementRepository advertisementRepository;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Advertisement>> getAllProducts() {
        List<Advertisement> advertisements = advertisementRepository.findAll();
        return new ResponseEntity<>(advertisements, HttpStatus.OK);
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<String> addAdvertisement(@RequestBody Advertisement advertisement) {
        advertisement.setCreatedAt(new Date());
        advertisementRepository.save(advertisement);
        return new ResponseEntity<>("Advertisement added successfully!", HttpStatus.OK);
    }
}
