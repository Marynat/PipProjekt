--INSERT INTO produkty (id_produkty,nazwa,dawka,typ)
--VALUES (1,'Chloroform','200mg','Pen');
--insert into apteka(ADRES, ID_APTEKA,NAZWA,TELEFON) values ('Kielce ul.Mickiewicza 82',0,'Apteka MM', '934748725');
--Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,APTEKA_ID_APTEKA) values(0,'felo','melo','elo',64,'helo','KIEROWNIK', 0);
--Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,APTEKA_ID_APTEKA) values(1,'mol','fol','lol',34,'hol','FARMACEUTA',0);
--insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values (0,2000,'4324324',1);
--insert into kierownik(id_kierownik,uzytkownik_id_uzytkownik) values (0,0);
--insert into MAGAZYN ("id_magazyn",APTEKA_ID_APTEKA,ILOSC_WOLNYCH_MIEJSC) values (0,0, 5000);
--insert into produkty("id_produkty",nazwa,dawka,typ,ilosc,MAGAZYN_ID_MAGAZYN) values(0,'fsafal','65m','ak',75,0);
select * from uzytkownik;
select * from kierownik;
select * from farmaceuta;
select * from klient;
select * from produkty;
select * from zamowienie;
--in
--Instert into klient(id_klient,uzytkownik_id_uzytkownik) values(1,3)
--DELETE FROM uzytkownik WHERE  id_uzytkownik =1;
--DELETE FROM uzytkownik WHERE  id_uzytkownik =2;
--DELETE FROM uzytkownik WHERE  id_uzytkownik =3;
--DELETE FROM klient WHERE ID_KLIENT = 0;
--Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values(1,'mak','hak','tak',77,'siak','KLIENT');