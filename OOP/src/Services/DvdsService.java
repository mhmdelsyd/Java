package Services;

import Interfaces.IDvdsService;
import Models.Books;
import Models.Data;
import Models.Dvds;

import java.time.Year;
import java.util.ArrayList;

public class DvdsService implements IDvdsService {
    @Override
    public void GetAllDvds() {
        ArrayList<Dvds> dvds = Data.dvds;
        for (Dvds b:dvds){
            System.out.println("Dvd,"+"id:"+b.getId()+",Author:"+b.getauthor()+",title:"+b.getTitle()+",publication year:"+b.getpublicationyear());
        }
    }

    @Override
    public void AddDvd(Dvds dvd) {
        if(dvd.getauthor().equals(null)||dvd.getauthor().equals(""))
            throw new NullPointerException("author can't be empty");
        if(dvd.getTitle().equals(null)||dvd.getTitle().equals(""))
            throw new NullPointerException("title can't be empty");
        if(dvd.getpublicationyear()> Year.now().getValue())
            throw new NullPointerException("publication year can't be after this year");
        dvd.SetId(Data.dvds.size()+1);
        Data.dvds.add(dvd);
    }

    @Override
    public void UpdateDvd(int id, Dvds dvd) {
        boolean DvdExist = false;
        for(Dvds b:Data.dvds){
            if(b.getId()==id){
                DvdExist=true;
                b.Setauthor(dvd.getauthor());
                b.Setpublicationyear(dvd.getpublicationyear());
                b.Settitle(dvd.getTitle());
            }

        }
        if(!DvdExist)
            throw new NullPointerException("Dvd Doesn't exist");
    }

    @Override
    public void DeleteBDvd(int id) {
        boolean DvdExist = false;
        for(Dvds b:Data.dvds){
            if(b.getId()==id){
                DvdExist=true;
                Data.dvds.remove(b);
            }
        }
        if(!DvdExist)
            throw new NullPointerException("dvd Doesn't exist");
    }
}
