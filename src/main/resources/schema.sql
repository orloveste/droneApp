INSERT INTO droneappdb.city (cityid, citydescription, cityname, citypostalcode) VALUES (1, 'Baza principala', 'Bucharest', '023631');
INSERT INTO droneappdb.city (cityid, citydescription, cityname, citypostalcode) VALUES (2, 'Centru secundar', 'Cluj', '08000');
INSERT INTO droneappdb.city (cityid, citydescription, cityname, citypostalcode) VALUES (3, 'oras martir', 'Iasi', 'faranumar');
INSERT INTO droneappdb.city (cityid, citydescription, cityname, citypostalcode) VALUES (4, 'oras de legatura', 'Craiova', '2000008');

INSERT INTO droneappdb.region (regionid, cityid, cityname, regionname, regionstreetpostalcode)
VALUES (1, 1, 'Bucharest', 'dristor', 'hai ca ploua'), (2, 1, 'Bucharest', 'Crangasi', 'Ninge si acolo'), (3, 3, 'Iasi', 'Nicolina', 'hai ca am gasit un bug'),
       (4, 3, 'Iasi', 'test rosu si negru', 'asta trebuia sa fie iasi'), (5, 3, 'Iasi', 'Chindii', 'fara numar'),
       (6, 2, 'Cluj', 'Hasdeu', 'al treilea camin pe stanga');
INSERT INTO droneappdb.location (locationid, cityid, cityname, description, details, regionid, regionname)
VALUES
(1, 2, 'Cluj', 'emag TEST EDIT', 'intrarea 4 pentru camioane', 6, 'Hasdeu'), (2, 2, 'Cluj', 'Hasdeu Ley', 'caminele de stat', 6, 'Hasdeu'),
(3, 1, 'Bucharest', 'McDonalds', 'pokemon city', 1, 'dristor'), (4, 3, 'Iasi', 'dupa colt ', 'pe stanga etaj 3', 4, 'test rosu si negru');
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (1, 'str.Luntrei nr.3, bl.', 1, 'Bucharest', 'roadeosu@yahoo.com', 'Jaba the Hut', '07318', 2);
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (2, 'Str. Libertatii', 4, 'Craiova', 'adler@mimi.com', 'Alibaba si cei 7 pitici', '0909713', 1);
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (3, 'str.Luntreor 2', 1, 'Bucharest', 'vevm@yahoo.com', 'Eugeniu Orlov', '+40731890', 1);
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (4, 'Zambilei 3', 3, 'Iasi', 'uyuy@ddad', 'Te cunosc de undeva', '882931', 2);
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (5, 'Retoricii 3', 2, 'Cluj', 'ww@ss', 'Miclosh Bre', '133211', 2);
INSERT INTO droneappdb.client (clientid, address, cityid, clientcity, email, name, phone, regionid) VALUES (6, 'zambile 4', 4, 'Craiova', 'jandelacraiova@com.ro', 'Popescu  Radu', '082308032', 3);
INSERT INTO droneappdb.drone_type (id, description, details) VALUES (1, 'Flight up to 50m', 'smart recharge'), (2, 'nou teren', 'accidentat'),
                                                                    (3, 'Stixi', 'Pasare de noapte'), (2, 'Dixi', 'Praf');
insert into droneappdb.user(username, password, email) value ('stresu', 'stresu', 'denisa@sus'), ('mucu1', 'mucu1', 'denisa@rood'), ('stresuDenisa', 'stresuDenisa', 'stresuDenisa@TaceRauDitat');
