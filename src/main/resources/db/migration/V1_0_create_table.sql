CREATE TABLE brand (
    brand_id INTEGER,
    brand_name varchar(100),
    slug varchar(255),
    PRIMARY KEY (brand_id)
); 

CREATE TABLE product (
    id INTEGER,
    product_name varchar(100),
    short_desc varchar(255),
    price INTEGER,
    stock INTEGER,
    sold INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (brand) REFERENCES brand(brand_id)
); 

CREATE TABLE review (
    review_id INTEGER,
    user_name varchar(100),
    short_desc varchar(255),
    rating INTEGER,
    PRIMARY KEY (review_id),
    FOREIGN KEY (product) REFERENCES product(id)
); 