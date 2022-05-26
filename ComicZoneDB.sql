-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 26 Bulan Mei 2022 pada 11.27
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ComicZoneDB`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `books`
--

CREATE TABLE `books` (
  `Id_books` varchar(10) NOT NULL,
  `Nama_buku` varchar(255) DEFAULT NULL,
  `Harga` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `books`
--

INSERT INTO `books` (`Id_books`, `Nama_buku`, `Harga`) VALUES
('Book-001', 'Love in chaos', '30000'),
('Book-002', 'Disruption', '90000'),
('Book-003', 'Bintang', '20000'),
('Book-004', 'Sapiens', '15000'),
('Book-005', 'The life changing mangic of tidying up', '13000'),
('Book-006', 'Bumi', '12000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `books_rent`
--

CREATE TABLE `books_rent` (
  `Id_book_rent` int(10) NOT NULL,
  `Id_rent` varchar(10) DEFAULT NULL,
  `Id_books` varchar(10) DEFAULT NULL,
  `tgl_peminjaman` varchar(13) DEFAULT NULL,
  `tgl_pengembalian` varchar(13) DEFAULT NULL,
  `harga` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `books_rent`
--

INSERT INTO `books_rent` (`Id_book_rent`, `Id_rent`, `Id_books`, `tgl_peminjaman`, `tgl_pengembalian`, `harga`) VALUES
(6, 'Sew-003', 'Book-001', '25-05-2022', '26-05-2022', '30000'),
(7, 'Sew-003', 'Book-002', '25-05-2022', '26-05-2022', '90000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `Customer`
--

CREATE TABLE `Customer` (
  `Id_customer` varchar(10) NOT NULL,
  `Name_customer` varchar(20) DEFAULT NULL,
  `Tanggal_lahir` varchar(10) DEFAULT NULL,
  `Telepon` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `Customer`
--

INSERT INTO `Customer` (`Id_customer`, `Name_customer`, `Tanggal_lahir`, `Telepon`) VALUES
('Cus-0001', 'Aldin', '21-09-1990', '08127776633'),
('Cus-0002', 'Berwyn', '21-01-1995', '08566666554'),
('Cus-0003', 'Deshi', '08-02-1997', '085202215664'),
('Cus-0004', 'Evania', '06-06-1996', '081285269462'),
('Cus-0005', 'Hansa', '09-09-1990', '085667894542'),
('Cus-0006', 'Harina', '25-12-1990', '081255446699');

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `Id_karyawan` varchar(10) NOT NULL,
  `Nama_karyawan` varchar(13) DEFAULT NULL,
  `Telepon` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`Id_karyawan`, `Nama_karyawan`, `Telepon`) VALUES
('Kar-001', 'Javas', '08566666554'),
('Kar-002', 'Avast', '085202215664'),
('Kar-003', 'Skyper', '085667894542'),
('Kar-004', 'Nakama', '081255446699'),
('Kar-005', 'Jarvis', '081284587566'),
('Kar-006', 'Jevera', '081247856978');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rent`
--

CREATE TABLE `rent` (
  `Id_rent` varchar(10) NOT NULL,
  `Id_karyawan` varchar(10) DEFAULT NULL,
  `Id_customer` varchar(10) DEFAULT NULL,
  `total_payment` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rent`
--

INSERT INTO `rent` (`Id_rent`, `Id_karyawan`, `Id_customer`, `total_payment`) VALUES
('Sew-003', 'Kar-001', 'Cus-0001', '200000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`Id_books`);

--
-- Indeks untuk tabel `books_rent`
--
ALTER TABLE `books_rent`
  ADD PRIMARY KEY (`Id_book_rent`),
  ADD KEY `Id_books` (`Id_books`),
  ADD KEY `Id_rent` (`Id_rent`);

--
-- Indeks untuk tabel `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`Id_customer`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`Id_karyawan`);

--
-- Indeks untuk tabel `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`Id_rent`),
  ADD KEY `Id_karyawan` (`Id_karyawan`),
  ADD KEY `Id_customer` (`Id_customer`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `books_rent`
--
ALTER TABLE `books_rent`
  MODIFY `Id_book_rent` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `books_rent`
--
ALTER TABLE `books_rent`
  ADD CONSTRAINT `Id_rent` FOREIGN KEY (`Id_rent`) REFERENCES `rent` (`Id_rent`),
  ADD CONSTRAINT `books_rent_ibfk_1` FOREIGN KEY (`Id_books`) REFERENCES `books` (`Id_books`);

--
-- Ketidakleluasaan untuk tabel `rent`
--
ALTER TABLE `rent`
  ADD CONSTRAINT `Id_customer` FOREIGN KEY (`Id_customer`) REFERENCES `Customer` (`Id_customer`),
  ADD CONSTRAINT `Id_karyawan` FOREIGN KEY (`Id_karyawan`) REFERENCES `karyawan` (`Id_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
