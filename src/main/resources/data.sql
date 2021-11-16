INSERT INTO RBUILDING(id, outside_temperature) VALUES(-3, 12);
INSERT INTO RBUILDING(id, outside_temperature) VALUES(-4, 15);

INSERT INTO RROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-10, 'Room1', 1, 22.3, 20.0, -3);
INSERT INTO RROOM(id, name, floor, building_id) VALUES(-9, 'Room2', 1, -4);
INSERT INTO RROOM(id, name, floor, building_id) VALUES(-8, 'Room3', 2, -3);

INSERT INTO RHEATER(id, heater_status, name, power, room_id) VALUES(-10, 'ON', 'Heater1', 2000, -10);
INSERT INTO RHEATER(id, heater_status, name, power, room_id) VALUES(-9, 'ON', 'Heater2', null, -10);
INSERT INTO RHEATER(id, heater_status, name, power, room_id) VALUES(-8, 'OFF', 'Heater1', 1000, -8);

INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-10, 'CLOSED', 'Window 1', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-9, 'CLOSED', 'Window 2', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-8, 'OPEN', 'Window 1', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-7, 'CLOSED', 'Window 2', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-6, 'OPEN', 'Window 1', -8);