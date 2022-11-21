DROP TABLE IF EXISTS railway_carriage;
DROP TABLE IF EXISTS train_group;
DROP TABLE IF EXISTS train_composition;

CREATE TABLE train_composition
(
	composition_id SERIAL,
	PRIMARY KEY(composition_id)
);

CREATE TABLE railway_group
(
	composition_group_id SERIAL,
    group_id SERIAL,
	PRIMARY KEY(group_id),
	FOREIGN KEY (composition_group_id) REFERENCES train_composition(composition_id) ON DELETE RESTRICT
);
CREATE TABLE railway_carriage
(
	railway_group_carriage SERIAL,
	number_railway varchar(8),
	name_direction varchar(15),
	type_railway varchar(15),
	cargo_weight integer not null,
	spec_types varchar(15),
	PRIMARY KEY(number_railway),
	FOREIGN KEY (railway_group_carriage) REFERENCES railway_group(group_id) ON DELETE RESTRICT
)