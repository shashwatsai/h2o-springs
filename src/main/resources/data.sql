INSERT INTO BOTTLE (BOTTLE_QUANTITY, BOTTLE_BRAND, BOTTLE_PRICE,BOTTLE_IMG) VALUES ('40ltr', 'Bisleri', 110, '/images/bottles/bisleri-40ltr.jpg');
INSERT INTO BOTTLE (BOTTLE_QUANTITY, BOTTLE_BRAND, BOTTLE_PRICE,BOTTLE_IMG) VALUES ('20ltr', 'Kaveri', 70,'/images/bottles/kaveri-20ltr.jpg');


INSERT INTO BUYER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, ADDRESS, COUNTRY, STATE, PHONE_NUMBER) VALUES('Shashwat', 'Tiwari', 'shashwat1791@gmail.com', 'G-23 Shantinagar cantt', 'India', 'UP', '+91-7839321468');
INSERT INTO BUYER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, ADDRESS, COUNTRY, STATE, PHONE_NUMBER) VALUES('Garima', 'Pandey', 'garimap@gmail.com', 'Gorakhpur HouseId: 2', 'India', 'UP', '+91-7839421468');
INSERT INTO BUYER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, ADDRESS, COUNTRY, STATE, PHONE_NUMBER) VALUES('Parineeti', 'Chopra', 'parineeti@bollywood.com', 'Mumbai Flat 32', 'India', 'MH', '+91-7839321397');
INSERT INTO BUYER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, ADDRESS, COUNTRY, STATE, PHONE_NUMBER) VALUES('Katrina', 'Kaif', 'katrina@bhaijaan.com', 'Juhu Beach Sea Facing', 'India', 'MH', '+91-9611832660');

INSERT INTO ORDERS (BOTTLE_ID, BUYER_ID, ORDER_DATE, ORDER_QUANTITY,DELIVERED) VALUES ((SELECT BOTTLE_ID FROM BOTTLE WHERE BOTTLE_BRAND = 'Bisleri'), (SELECT BUYER_ID FROM BUYER WHERE LAST_NAME = 'Tiwari'), '2018-04-01', 2, 0);

