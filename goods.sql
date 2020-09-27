CREATE TABLE shop.goods (
  id INT ,
  name VARCHAR(55) ,
  weight VARCHAR(45) ,
  amount INT ,
  refundable BIT ,
  category VARCHAR(45) ,
  brand VARCHAR(45) ,
  order_date VARCHAR(45) NOT NULL,
  FOREIGN KEY (id)  REFERENCES brand (id),
  FOREIGN KEY (id)  REFERENCES category (id));