insert into CITY (id, name) values (1, 'São Paulo')
insert into CITY (id, name) values (2, 'Belém')
insert into CITY (id, name) values (3, 'Florianópolis')

insert into AIRCRAFT (id, model, number) values (1, 'Lineage 1000', 'L100')
insert into AIRCRAFT (id, model, number) values (2, 'Legacy 650', 'L650')

insert into PILOT (id, name) values (1, 'Bruce Dickinson')
insert into PILOT (id, name) values (2, 'Santos Dumont')

insert into FLIGHT (id, number, flight_status, departure, arrival, origin_id, destination_id, duration, aircraft_id, pilot_id) VALUES (1, 'FLY311', 'SCHEDULED', '2017-12-25 22:10:00', '2017-12-26 01:20:00', 1, 2, 180, 1, 1)
insert into FLIGHT (id, number, flight_status, departure, arrival, origin_id, destination_id, duration, aircraft_id, pilot_id) VALUES (2, 'FLY411', 'DELAYED', '2017-10-25 09:10:00', '2017-10-26 14:20:00', 2, 1, 195, 2, 2)


