package maintest;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bank {
    LocalDate tarih;
    ArrayList<Account> AccountListesi = new ArrayList<Account>(10);
    
    public ArrayList<Account> getAccountList(){
        return AccountListesi;
    }
    public void getTarih(){
        System.out.println("İşlem yapıyor olduğunuz tarih: " + tarih);
    }
    public void Withdraw(int ID , int cekilecekmeblag){
        for (int i = 0; i < 10; i++) {
            if(AccountListesi.get(i).id == ID){
                AccountListesi.get(i).withdraw(cekilecekmeblag);
                if (AccountListesi.get(i).balance < cekilecekmeblag){
                    System.out.println("Bakiye yetersizliğinden ötürü işleminizi gerçekleştiremiyoruz.");
                }
                else{
                    System.out.println("Bu hesap numarasına ait bir müşterimiz bulunamamaktadır.");
                }
            }
            
        }
    }
    public void deposit(int ID, int cekilelecekpara){
        for (int k = 0; k < 10; k++) {
            if(AccountListesi.get(k).id == ID){
                AccountListesi.get(k).deposit(cekilelecekpara);
            }
            else{
                System.out.println("Bu hesap numarasına ait bir müşterimiz bulunmamaktadır.");
            }
            
        }
    }
}
