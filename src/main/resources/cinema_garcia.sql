-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2023 a las 13:10:39
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinema_garcia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `clients`
--

INSERT INTO `clients` (`id`, `name`, `phone`) VALUES
(1, 'Juan', '123'),
(2, 'laura', '456'),
(3, 'Hugo', '789'),
(4, 'Carlos', '362'),
(5, 'Martin', '31078214'),
(6, 'Juana', '1233523'),
(7, 'Gabriel', '723'),
(8, 'Oscar', '612'),
(9, 'Natalia', '513'),
(10, 'Andrea', '523'),
(11, 'Juan', '93445'),
(12, 'Karla', '912412'),
(13, 'Andres', '34652346'),
(14, 'Lina', '23523');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `functions`
--

CREATE TABLE `functions` (
  `id` int(11) NOT NULL,
  `movie_id` int(11) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `schedule` enum('A','B','C','D','E') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `functions`
--

INSERT INTO `functions` (`id`, `movie_id`, `room_id`, `schedule`) VALUES
(1, 3, 2, 'C'),
(2, 2, 1, 'A'),
(3, 8, 1, 'D'),
(4, 4, 4, 'E'),
(5, 5, 3, 'C'),
(6, 7, 2, 'C'),
(7, 9, 4, 'E'),
(8, 8, 1, 'D');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movies`
--

CREATE TABLE `movies` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `movies`
--

INSERT INTO `movies` (`id`, `name`) VALUES
(2, 'Pelicula_2'),
(3, 'Pelicula3'),
(4, 'Pelicula4'),
(5, 'Pelicula5'),
(6, 'Pelicula6'),
(7, 'Pelicula7'),
(8, 'Pelicula8'),
(9, 'Pelicula9'),
(13, 'Pelicula_13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservations`
--

CREATE TABLE `reservations` (
  `client_id` int(11) DEFAULT NULL,
  `function_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `seat_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `reservations`
--

INSERT INTO `reservations` (`client_id`, `function_id`, `id`, `seat_id`) VALUES
(4, 1, 1, 2),
(1, 3, 2, 8),
(2, 2, 3, 19),
(5, 2, 4, 7),
(4, 4, 5, 31),
(1, 4, 17, 32),
(1, 5, 18, 22),
(10, 6, 19, 12),
(11, 1, 20, 1),
(12, 7, 21, 33),
(13, 5, 22, 20),
(14, 4, 23, 34);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rooms`
--

CREATE TABLE `rooms` (
  `id` int(11) NOT NULL,
  `number` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `rooms`
--

INSERT INTO `rooms` (`id`, `number`) VALUES
(1, 'S1'),
(2, 'S2'),
(3, 'S3'),
(4, 'S4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seats`
--

CREATE TABLE `seats` (
  `available` bit(1) NOT NULL,
  `id` int(11) NOT NULL,
  `room_id` int(11) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `seats`
--

INSERT INTO `seats` (`available`, `id`, `room_id`, `position`) VALUES
(b'1', 1, 1, 'A1'),
(b'1', 2, 1, 'A2'),
(b'0', 3, 1, 'A3'),
(b'0', 4, 1, 'B1'),
(b'0', 5, 1, 'B2'),
(b'0', 6, 1, 'B3'),
(b'1', 7, 1, 'C1'),
(b'1', 8, 1, 'C2'),
(b'0', 9, 1, 'C3'),
(b'0', 10, 2, 'A1'),
(b'0', 11, 2, 'A2'),
(b'1', 12, 2, 'A3'),
(b'0', 13, 2, 'B1'),
(b'0', 14, 2, 'B2'),
(b'0', 15, 2, 'B3'),
(b'0', 16, 2, 'C1'),
(b'0', 17, 2, 'C2'),
(b'0', 18, 2, 'C3'),
(b'1', 19, 3, 'A1'),
(b'0', 20, 3, 'A2'),
(b'0', 21, 3, 'A3'),
(b'1', 22, 3, 'B1'),
(b'0', 23, 3, 'B2'),
(b'0', 24, 3, 'B3'),
(b'0', 25, 3, 'C1'),
(b'0', 26, 3, 'C2'),
(b'0', 27, 3, 'C3'),
(b'0', 28, 4, 'A1'),
(b'0', 29, 4, 'A2'),
(b'0', 30, 4, 'A3'),
(b'1', 31, 4, 'B1'),
(b'1', 32, 4, 'B2'),
(b'0', 33, 4, 'B3'),
(b'0', 34, 4, 'C1'),
(b'0', 35, 4, 'C2'),
(b'0', 36, 4, 'C3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `functions`
--
ALTER TABLE `functions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8wpmefyg820c4f0xn0w8o979g` (`movie_id`),
  ADD KEY `FK2k7fyhn8sa73lqe3bccrx635l` (`room_id`);

--
-- Indices de la tabla `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6lekctbt4u88agg0b7cjsj6lf` (`client_id`),
  ADD KEY `FK5g7qhutwhh06drcsqac7ykqik` (`function_id`),
  ADD KEY `FK57amums6j9fkqwbpw4oceyw9i` (`seat_id`);

--
-- Indices de la tabla `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `seats`
--
ALTER TABLE `seats`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKg993pi7ucgy616icmddq8u335` (`room_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `functions`
--
ALTER TABLE `functions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `movies`
--
ALTER TABLE `movies`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `seats`
--
ALTER TABLE `seats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `functions`
--
ALTER TABLE `functions`
  ADD CONSTRAINT `FK2k7fyhn8sa73lqe3bccrx635l` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`id`),
  ADD CONSTRAINT `FK8wpmefyg820c4f0xn0w8o979g` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`);

--
-- Filtros para la tabla `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `FK57amums6j9fkqwbpw4oceyw9i` FOREIGN KEY (`seat_id`) REFERENCES `seats` (`id`),
  ADD CONSTRAINT `FK5g7qhutwhh06drcsqac7ykqik` FOREIGN KEY (`function_id`) REFERENCES `functions` (`id`),
  ADD CONSTRAINT `FK6lekctbt4u88agg0b7cjsj6lf` FOREIGN KEY (`client_id`) REFERENCES `clients` (`id`);

--
-- Filtros para la tabla `seats`
--
ALTER TABLE `seats`
  ADD CONSTRAINT `FKg993pi7ucgy616icmddq8u335` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
