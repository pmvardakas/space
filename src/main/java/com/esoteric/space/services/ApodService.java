package com.esoteric.space.services;

import com.esoteric.space.models.ApodData;
import com.esoteric.space.rest.ApodInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApodService {

    private ApodInterface apodInterface;

    @Autowired
    public ApodService(ApodInterface apodInterface) {
        super();
        this.apodInterface = apodInterface;
    }

    public ApodData getPictureOfTheDay() {
        return apodInterface.getAstronomyPictureOfTheDay();
    }
}
