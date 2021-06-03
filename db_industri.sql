-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 31 Mei 2017 pada 04.30
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_industri`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_karyawan`
--

CREATE TABLE `t_karyawan` (
  `id_karyawan` int(15) NOT NULL,
  `nik` int(20) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jk` varchar(100) NOT NULL,
  `tempat_lahir` varchar(150) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `pendidikan` varchar(100) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `jabatan` varchar(150) NOT NULL,
  `status` varchar(100) NOT NULL,
  `agama` varchar(100) NOT NULL,
  `kontak` varchar(20) NOT NULL,
  `usia` int(20) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_karyawan`
--

INSERT INTO `t_karyawan` (`id_karyawan`, `nik`, `nama`, `jk`, `tempat_lahir`, `tanggal_lahir`, `pendidikan`, `tanggal_masuk`, `jabatan`, `status`, `agama`, `kontak`, `usia`, `alamat`) VALUES
(19, 19, 'Luthfi Imam Maulana', 'Laki-laki', 'Bandung', '2000-04-12', 'SMK', '2017-05-31', 'Direktur', 'Belum Nikah', 'Islam', '088809451410', 17, 'jl kopo no 1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_login`
--

CREATE TABLE `t_login` (
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_login`
--

INSERT INTO `t_login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_penggajian`
--

CREATE TABLE `t_penggajian` (
  `NIK` int(20) NOT NULL,
  `nama_karyawan` varchar(200) NOT NULL,
  `jabatan` varchar(150) NOT NULL,
  `gaji_pokok` int(12) NOT NULL,
  `tunjangan` int(12) NOT NULL,
  `uang_makan` int(12) NOT NULL,
  `bonus` int(12) NOT NULL,
  `potongan` int(12) NOT NULL,
  `gaji_bersih` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_penggajian`
--

INSERT INTO `t_penggajian` (`NIK`, `nama_karyawan`, `jabatan`, `gaji_pokok`, `tunjangan`, `uang_makan`, `bonus`, `potongan`, `gaji_bersih`) VALUES
(1, 'test', 'Security', 2500000, 500000, 500000, 500000, 500000, 3500000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_perlengkapan`
--

CREATE TABLE `t_perlengkapan` (
  `id_perlengkapan` int(20) NOT NULL,
  `nama_perlengkapan` varchar(200) NOT NULL,
  `kategori` varchar(200) NOT NULL,
  `kondisi` varchar(200) NOT NULL,
  `harga` int(12) NOT NULL,
  `jumlah_barang` int(11) NOT NULL,
  `total_harga` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_perlengkapan`
--

INSERT INTO `t_perlengkapan` (`id_perlengkapan`, `nama_perlengkapan`, `kategori`, `kondisi`, `harga`, `jumlah_barang`, `total_harga`) VALUES
(1, 'Suzuki Colt 2000', 'Kendaraan', 'Baik', 105000000, 2, 210000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_produk`
--

CREATE TABLE `t_produk` (
  `id_produk` int(20) NOT NULL,
  `nama_produk` varchar(200) NOT NULL,
  `harga_produk` int(12) NOT NULL,
  `jumlah_produk` int(12) NOT NULL,
  `stok_produk` int(12) NOT NULL,
  `status_produksi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_produk`
--

INSERT INTO `t_produk` (`id_produk`, `nama_produk`, `harga_produk`, `jumlah_produk`, `stok_produk`, `status_produksi`) VALUES
(1, 'kopi hitam', 1000, 48, 50, 'Tersedia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_karyawan`
--
ALTER TABLE `t_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `t_login`
--
ALTER TABLE `t_login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `t_penggajian`
--
ALTER TABLE `t_penggajian`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `t_perlengkapan`
--
ALTER TABLE `t_perlengkapan`
  ADD PRIMARY KEY (`id_perlengkapan`);

--
-- Indexes for table `t_produk`
--
ALTER TABLE `t_produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_perlengkapan`
--
ALTER TABLE `t_perlengkapan`
  MODIFY `id_perlengkapan` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `t_produk`
--
ALTER TABLE `t_produk`
  MODIFY `id_produk` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
