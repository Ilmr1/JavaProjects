DROP DATABASE IF EXISTS currencyDB;
CREATE DATABASE currencyDB;
USE currencyDB;

DROP TABLE IF EXISTS Currencies;
CREATE TABLE Currencies (
    abbreviation VARCHAR(3) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    conversion_rate DECIMAL(10, 4) NOT NULL
);

INSERT INTO Currencies (abbreviation, name, conversion_rate) VALUES
('USD', 'United States Dollar', 1.0000),
('EUR', 'Euro', 0.8800),
('JPY', 'Japanese Yen', 110.4600),
('GBP', 'British Pound', 0.7500),
('AUD', 'Australian Dollar', 1.3600),
('CAD', 'Canadian Dollar', 1.2800),
('CHF', 'Swiss Franc', 0.9200),
('CNY', 'Chinese Yuan', 6.3900);

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'Salasana1!';
GRANT SELECT ON currencyDB.Currencies TO 'appuser'@'localhost';