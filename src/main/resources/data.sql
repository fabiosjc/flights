insert into CITY (id, name) values (1, 'São Paulo')
insert into CITY (id, name) values (2, 'Belém')
insert into CITY (id, name) values (3, 'Florianópolis')

insert into AIRLINE (id, name) values (1, 'Latam')
insert into AIRLINE (id, name) values (2, 'Azul')

insert into AIRCRAFT (id, model, number) values (1, 'Lineage 1000', 'L100')
insert into AIRCRAFT (id, model, number) values (2, 'Legacy 650', 'L650')
insert into AIRCRAFT (id, model, number) values (3, 'Legacy 600', 'LPTZ')

insert into PILOT (id, name) values (1, 'Bruce Dickinson')
insert into PILOT (id, name) values (2, 'Santos Dumont')

insert into FLIGHT (id, airline_id, number, flight_status, departure, arrival, origin_id, destination_id, duration, aircraft_id, pilot_id) VALUES (1, 1, '00752', 'SCHEDULED', '2017-12-25 22:10:00', '2017-12-26 01:20:00', 1, 2, 180, 1, 1)
insert into FLIGHT (id, airline_id, number, flight_status, departure, arrival, origin_id, destination_id, duration, aircraft_id, pilot_id) VALUES (2, 2, '05333', 'DELAYED', '2017-10-25 09:10:00', '2017-10-26 14:20:00', 2, 1, 195, 2, 2)
insert into FLIGHT (id, airline_id, number, flight_status, departure, arrival, origin_id, destination_id, duration, aircraft_id, pilot_id) VALUES (3, 1, '03184', 'LANDED', '2017-08-23 15:30:00', '2017-08-23 17:20:00', 1, 3, 130, 3, 1)



