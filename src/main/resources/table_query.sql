CREATE TABLE IF NOT EXISTS tb_item_info (
item_id BIGINT NOT NULL AUTO_INCREMENT,
item_name VARCHAR(200),
item_amount INT,
PRIMARY KEY(item_id));