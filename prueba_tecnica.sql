create  database bdprueba;
use bdprueba;

create table asegurados 
(
    tipo_Identificacion INT not null,
    numero_Identificacion INT PRIMARY KEY not null,
    Apellidos VARCHAR(55) not null,
    Nombres VARCHAR(55) not null,
    Sexo INT not null,
    fecha_Nacimiento DATE not null
);
INSERT INTO asegurados (Tipo_identificacion, Numero_identificacion, Apellidos, Nombres, Sexo, Fecha_nacimiento)
VALUES
    ('CC', 79000001, 'APELLIDO1', 'NOMBRE1', 'Masculino', '1945-01-10'),
    ('CC', 79000002, 'APELLIDO2', 'NOMBRE2', 'Masculino', '1950-01-10'),
    ('CC', 79000003, 'APELLIDO3', 'NOMBRE3', 'Masculino', '1955-01-10'),
    ('CE', 51000001, 'APELLIDO4', 'NOMBRE4', 'Femenino', '1960-01-10'),
    ('CE', 51000002, 'APELLIDO5', 'NOMBRE5', 'Femenino', '1965-01-10'),
    ('CE', 51000003, 'APELLIDO6', 'NOMBRE6', 'Femenino', '1970-01-10');

CREATE TABLE amparos 
(
    Codigo INT PRIMARY KEY not null,
    Nombre VARCHAR(55) not null
);
INSERT INTO amparos (Codigo, Nombre)
VALUES
    (1, 'Muerte accidental'),
    (2, 'Desmembración'),
    (3, 'Auxilio funerario'),
    (4, 'Renta vitalicia');

CREATE TABLE primas 
(
    Codigo INT not null,
    Edad_minima INT not null,
    Edad_maxima INT not null,
    Porcentaje_prima FLOAT not null,
    PRIMARY KEY (Codigo, Edad_minima, Edad_maxima)
);
INSERT INTO primas (Codigo, Edad_minima, Edad_maxima, Porcentaje_prima)
VALUES
    (1, 18, 45, 0.02304),
    (1, 46, 75, 0.02012),
    (2, 18, 50, 0.1809),
    (2, 51, 70, 0.16043),
    (3, 18, 60, 0.14123),
    (3, 61, 70, 0.1545),
    (4, 18, 50, 0.12123),
    (4, 51, 70, 0.1345);
    
select * from asegurados;
select * from amparos;
select * from primas;