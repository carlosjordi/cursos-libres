SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cursoslibres`
--
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--
create database cursoslibres;
use cursoslibres;

create database cursoslibres;
use cursoslibres;
CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `nombres` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `edad` int(11) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `passAlumno` varchar(50) NOT NULL,
  `codigoAlumno` varchar(11) NOT NULL,
  `fechaRegistro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `nombres`, `apellidos`, `edad`, `telefono`, `dni`, `correo`, 
`direccion`, `passAlumno`, `codigoAlumno`, `fechaRegistro`) VALUES
(1, 'Brazton', 'el come gigantes', 21, '987897897', '65498778', 'panetonero@contodo.pe', 
'San German', 'hazmecaso', 'E2065498778', '2019-12-20 10:17:09');
INSERT INTO `alumno` (`idAlumno`, `nombres`, `apellidos`, `edad`, `telefono`, `dni`, `correo`, 
`direccion`, `passAlumno`, `codigoAlumno`, `fechaRegistro`) VALUES
(2, 'Hilser', 'Pacheco D Sal', 22, '987810278', '99966633', 'hazmecaso@please.yara', 
'Casa de la suegra', 'hazmecaso', 'P2099966633', '2019-12-20 10:17:09');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL,
  `idProfesor` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `costo` decimal(7,2) NOT NULL,
  `vacantes` int(11) NOT NULL,
  `vacantesActuales` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `turno` int(11) NOT NULL,
  `lugar` varchar(255) NOT NULL,
  `fechaRegistro` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idCurso`, `idProfesor`, `descripcion`, `costo`, `vacantes`, 
`vacantesActuales`, `fechaInicio`, `fechaFin`, `turno`, `lugar`, `fechaRegistro`) VALUES
(1, 3, 'Android', 449.99, 25, 20, '2020-01-20', '2020-03-19', 1, 'La guarida de Hilser', '2019-12-20 12:22:12');
INSERT INTO `curso` (`idCurso`, `idProfesor`, `descripcion`, `costo`, `vacantes`, 
`vacantesActuales`, `fechaInicio`, `fechaFin`, `turno`, `lugar`, `fechaRegistro`) VALUES
(2, 2, 'Servicios Web', 666.99, 25, 20, '2020-01-30', '2020-03-30', 2, 'El sofa oscuro', '2019-12-20 12:22:12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripcion` int(11) NOT NULL,
  `idCurso` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  `fechaInscripcion` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `idProfesor` int(11) NOT NULL,
  `nombres` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `codigoProfesor` varchar(10) NOT NULL,
  `passProfesor` varchar(50) NOT NULL,
  `dni` varchar(13) NOT NULL,
  `especialidad` int(11) NOT NULL,
  `anosExperiencia` int(11) NOT NULL,
  `fechaRegistro` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--
INSERT INTO `profesor` (`idProfesor`, `nombres`, `apellidos`, `codigoProfesor`, `passProfesor`, `dni`, `especialidad`, `anosExperiencia`, `fechaRegistro`) VALUES
(1, 'Hilser el Romantico', 'El palomo', 'BKEP', 'hilser', '98136238', 1, 1, '2019-12-20 10:05:16');
INSERT INTO `profesor` (`idProfesor`, `nombres`, `apellidos`, `codigoProfesor`, `passProfesor`, `dni`, `especialidad`, `anosExperiencia`, `fechaRegistro`) VALUES
(2, 'El roba panetones', 'El palomo', 'BKEP', 'hilser', '90104568', 1, 2, '2019-12-20 10:05:16');
INSERT INTO `profesor` (`idProfesor`, `nombres`, `apellidos`, `codigoProfesor`, `passProfesor`, `dni`, `especialidad`, `anosExperiencia`, `fechaRegistro`) VALUES
(3, 'Bratzon Kike', 'El palomo', 'BKEP', 'hilser', '98104568', 1, 1, '2019-12-20 10:05:16');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idCurso`),
  ADD KEY `idProfesor` (`idProfesor`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripcion`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idCurso` (`idCurso`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`idProfesor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `idCurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripcion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `idProfesor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`);

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
