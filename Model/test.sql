--felinsert into apteka(ADRES, ID_APTEKA,NAZWA,TELEFON) values ('Kielce ul.Mickiewicza 82',0,'Apteka MM', '934748725');
--Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,APTEKA_ID_APTEKA) values(0,'felo','melo','Marcin',64,'Kowalski','KIEROWNIK', 0);
--Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,APTEKA_ID_APTEKA) values(1,'mol','fol','Krystyna',34,'Nowak','FARMACEUTA',0);
--insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values (0,2000,'4324324',1);
--insert into kierownik(id_kierownik,uzytkownik_id_uzytkownik) values (0,0);
--insert into MAGAZYN ("id_magazyn",APTEKA_ID_APTEKA,ILOSC_WOLNYCH_MIEJSC) values (0,0, 5000);
--insert into produkty("id_produkty",koszt,nazwa,dawka,typ,ilosc,MAGAZYN_ID_MAGAZYN) values(0, 2.50,'apap','65m','ak',75,0);
--insert into kasa("id_kasa",STAN,PIENIADZE,APTEKA_ID_APTEKA) values(0,'OTWARTA', 0, 0);
select * from uzytkownik;
select * from kierownik;
select * from farmaceuta;
select * from klient;
select * from produkty;
select * from zamowienie;
select * from magazyn;
select * from rachunki;
select * from kasa;
