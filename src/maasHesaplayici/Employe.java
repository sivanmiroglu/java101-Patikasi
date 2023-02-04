package maasHesaplayici;

public class Employe {
    String Name;
    double wage; // maaş
    int workhours; // çalışma saati
    int hireyear; // işe başladığı yıl

    Employe(String Name,double wage,int workhours,int hireyear){
        this.Name=Name;
        this.wage=wage;
        this.workhours=workhours;
        this.hireyear=hireyear;
    }
    double tax(){
        double tax=0;
        if(wage>1000){
            tax =wage*0.03;
        }
        return tax;
    }
    int bonus(){
        int bonus = 0;
        if(workhours>40){
            bonus =(workhours=40)*30;
        }
            return bonus;
    }
    double raisewage(){
        double raise = 0; //artış miktarı
        int yearsOfService = 2021 - hireyear; //yearsOfService = hizmet yılı
        if(yearsOfService < 10) {
            raise = wage * 0.05;
        } else if(yearsOfService >= 10 && yearsOfService < 20) {
            raise = wage * 0.1;
        } else if(yearsOfService >= 20) {
            raise = wage * 0.15;
        }
        return raise;
    }
    public String toString() {
        return "Adı: " + this.Name + "\nMaaşı: " + this.wage + "\nÇalışma Saati: " + this.workhours + "\nBaşlangıç Yılı: " + this.hireyear
                + "\nVergi: " + this.tax() + "\nBonus: " + this.bonus() + "\nMaaş Artışı: " + this.raisewage()
                + "\nVergi ve Bonuslar ile Birlikte Maaş: " + (this.wage - this.tax() + this.bonus())
                + "\nToplam Maaş: " + (this.wage + this.raisewage());
    }
}
