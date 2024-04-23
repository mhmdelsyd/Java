package Services;

import Interfaces.IMagazinesService;
import Models.Books;
import Models.Data;
import Models.Dvds;
import Models.Magazines;

import java.time.Year;
import java.util.ArrayList;

public class MagazinesService implements IMagazinesService {
    @Override
    public void GetAllMagazines() {
        ArrayList<Magazines> magazines = Data.magazines;
        for (Magazines b:magazines){
            System.out.println("Magazine"+",id:"+b.getId()+",Author:"+b.getauthor()+",title:"+b.getTitle()+",publication year:"+b.getpublicationyear());
        }
    }

    @Override
    public void AddMagazine(Magazines Magazine) {
        if(Magazine.getauthor().equals(null)||Magazine.getauthor().equals(""))
            throw new NullPointerException("author can't be empty");
        if(Magazine.getTitle().equals(null)||Magazine.getTitle().equals(""))
            throw new NullPointerException("title can't be empty");
        if(Magazine.getpublicationyear()> Year.now().getValue())
            throw new NullPointerException("publication year can't be after this year");
        Magazine.SetId(Data.dvds.size()+1);
        Data.magazines.add(Magazine);
    }

    @Override
    public void UpdateMagazine(int id, Magazines Magazine) {
        boolean MagazineExist = false;
        for(Magazines b:Data.magazines){
            if(b.getId()==id){
                MagazineExist=true;
                b.Setauthor(Magazine.getauthor());
                b.Setpublicationyear(Magazine.getpublicationyear());
                b.Settitle(Magazine.getTitle());
            }

        }
        if(!MagazineExist)
            throw new NullPointerException("Magazine Doesn't exist");
    }

    @Override
    public void DeleteMagazine(int id) {
        boolean MagazineExist = false;
        for(Magazines b:Data.magazines){
            if(b.getId()==id){
                MagazineExist=true;
                Data.magazines.remove(b);
            }
        }
        if(!MagazineExist)
            throw new NullPointerException("magazine Doesn't exist");
    }
}
