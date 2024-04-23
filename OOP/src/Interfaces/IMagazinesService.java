package Interfaces;

import Models.Dvds;
import Models.Magazines;

import java.util.ArrayList;

public interface IMagazinesService {
    public void GetAllMagazines();
    public void AddMagazine(Magazines Magazine);
    public void UpdateMagazine(int id,Magazines Magazine);
    public void DeleteMagazine(int id);
}
