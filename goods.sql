CREATE TABLE shop.goods (
  name VARCHAR(55) NOT NULL,
  weight VARCHAR(45) NOT NULL,
  amount INT NOT NULL,
  refundable BIT NOT NULL,
  category VARCHAR(45) NOT NULL,
  brand VARCHAR(45) NOT NULL,
  orderDate DATE NOT NULL,
  PRIMARY KEY (category));