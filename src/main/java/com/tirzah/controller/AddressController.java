package com.tirzah.controller;

import com.tirzah.model.Address;
import com.tirzah.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/save")
    private Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }



}
