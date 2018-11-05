package com.example.muhammadrefi.aplikasimodul2kel4.ui.detailCar;

import com.example.muhammadrefi.aplikasimodul2kel4.data.model.DataCar;

import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}
