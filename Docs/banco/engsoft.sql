-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09-Maio-2017 às 01:04
-- Versão do servidor: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `engsoft`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `nome` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cpf` tinytext COLLATE utf8_unicode_ci NOT NULL,
  `cep` tinytext COLLATE utf8_unicode_ci NOT NULL,
  `logradouro` varchar(80) COLLATE utf8_unicode_ci NOT NULL,
  `bairro` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `id` int(3) NOT NULL,
  `numero` int(10) NOT NULL,
  `complemento` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `datanasc` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`nome`, `cpf`, `cep`, `logradouro`, `bairro`, `telefone`, `id`, `numero`, `complemento`, `cidade`, `estado`, `datanasc`) VALUES
('Fulano pra teste', '46200045609', '86300000', 'ABC', 'Centro', '11976548165', 1, 120, ' ', 'Cornélio Procópio', 'Paraná', '2000-02-21'),
('Fulano pra teste', '46200045609', '86300000', 'ABC', 'Centro', '11976548165', 2, 120, ' ', 'Cornélio Procópio', 'Paraná', '2000-02-21');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `nome` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `cnpj` text COLLATE utf8_unicode_ci NOT NULL,
  `cep` text COLLATE utf8_unicode_ci NOT NULL,
  `logradouro` varchar(80) COLLATE utf8_unicode_ci NOT NULL,
  `bairro` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `id` int(3) NOT NULL,
  `numero` int(10) NOT NULL,
  `complemento` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`nome`, `cnpj`, `cep`, `logradouro`, `bairro`, `telefone`, `id`, `numero`, `complemento`, `cidade`, `estado`) VALUES
('Fulano pra teste', '72223484000149', '86300000', 'ABC', 'Centro', '11976548165', 1, 120, ' ', 'Cornélio Procópio', 'Paraná'),
('Fulano pra teste', '72223484000149', '86300000', 'ABC', 'Centro', '11976548165', 2, 120, ' ', 'Cornélio Procópio', 'Paraná');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` int(3) NOT NULL,
  `nome` varchar(25) DEFAULT NULL,
  `fabricante` varchar(25) DEFAULT NULL,
  `preco` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
