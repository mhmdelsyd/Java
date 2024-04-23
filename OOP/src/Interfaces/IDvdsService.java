package Interfaces;

import Models.Books;
import Models.Dvds;

import java.util.ArrayList;

public interface IDvdsService {
    public void GetAllDvds();
    public void AddDvd(Dvds dvd);
    public void UpdateDvd(int id,Dvds dvd);
    public void DeleteBDvd(int id);
}
