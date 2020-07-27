CREATE TABLE employees(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	level INTEGER
)

CREATE TABLE bonus(
	eid INTEGER PRIMARY KEY REFERENCES employees(id),
	amount INTEGER
	
)

CREATE TRIGGER trigger_1
	BEFORE UPDATE OF level ON employees
	FOR EACH ROW
	BEGIN
		UPDATE bonus
		SET amount = amount + 10
		WHERE bonus.id = employees.id;
	END
	
CREATE TRIGGER trigger_2
	BEFORE UPDATE OF amount ON bonus
	FOR EACH ROW
	BEGIN
		UPDATE employees
		SET level = level + 1
		WHERE bonus.id = employees.id;
	END