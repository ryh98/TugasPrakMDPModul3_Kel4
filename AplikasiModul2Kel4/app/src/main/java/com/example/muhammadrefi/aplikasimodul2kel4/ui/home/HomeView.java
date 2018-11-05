package com.example.muhammadrefi.aplikasimodul2kel4.ui.home;

import com.example.muhammadrefi.aplikasimodul2kel4.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
