-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Maio-2020 às 15:46
-- Versão do servidor: 10.4.10-MariaDB
-- versão do PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `atecblog1`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `automoveis`
--

CREATE TABLE `automoveis` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `automoveis`
--

INSERT INTO `automoveis` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(3, 'Diogo Guapo', 'MAPCP', '2020-04-15', 'Diploma de Especialização Tecnológica (DET) como \"Especialista em Mecatrónica Automóvel, Planeamento e Controlo de Processos\".', 'Certificações', NULL),
(4, 'Diogo Guapo', 'MAPCP', '2020-04-15', 'O curso tem a duração de aproximadamente 1400 horas, com 3 meses e meio de Formação Prática em Contexto de Trabalho numa Empresa. Poderá ter um plano de formação adicional de 400 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ciber`
--

CREATE TABLE `ciber` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `ciber`
--

INSERT INTO `ciber` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(4, 'Diogo Guapo', 'CIBER', '2020-04-14', 'Diploma de Especialização Tecnológica (DET) como \"Técnico/a Especialista em Cibersegurança\".', 'Certificações', NULL),
(5, 'Diogo Guapo', 'CIBER', '2020-04-14', 'O Curso tem a duração de 1510 horas, com 3 meses de Formação Prática em Contexto de Trabalho numa Empresa. Poderá ter um plano de formação adicional de 250 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(9),
(9);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mecatronica`
--

CREATE TABLE `mecatronica` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `mecatronica`
--

INSERT INTO `mecatronica` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(2, 'Diogo Guapo', 'TM', '2020-04-15', 'Diploma de Especialização Tecnológica (DET) como \"Especialista em Tecnologia Mecatrónica\".', 'Certificações', NULL),
(3, 'Diogo Guapo', 'TM', '2020-04-15', 'O Curso tem a duração de 1560 horas, com 3 meses e meio em Formação Prática em Contexto de Trabalho numa Empresa. Poderá ter um plano de formação adicional de 500 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `post_atec`
--

CREATE TABLE `post_atec` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `post_atec`
--

INSERT INTO `post_atec` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`) VALUES
(1, 'ATEC Palmela', 'Tecnologias e Programação de Sistemas de Informação', '2019-05-24', 'O Curso de Especialização em Tecnologias e Programação de Sistemas de Informação tem por objetivo principal analisar, conceber, planear e desenvolver soluções de Tecnologias e Programação de Sistemas de Informação e/ou soluções de integração de sistemas existentes.\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nConstruir aplicações informáticas de gestão de sistemas de informação.</p>\r\n<p>\r\nConceber e manusear uma base de dados tendo em vista a resolução de problemas de negócio ou outros e de suporte aos respetivos sistemas de informação.</p>\r\n<p>\r\nImplementar sistemas de informação baseados em tecnologias Web, através da utilização de sistemas de computação clássicos e de dispositivos móveis, designadamente telemóveis e PDA.</p>\r\n<p>\r\nConfigurar e gerir aplicações de sistemas de informação nas organizações (ERP, CRM, logística, etc).</p>\r\n<p>\r\nConceber arquiteturas de integração de sistemas.</p>\r\n<p>\r\nSelecionar as vias de solução tecnológica mais adequadas e as ferramentas a que poderão recorrer, em cada situação concreta.</p> ', 'Curso de Técnico/a Especialista em Tecnologias e Programação de Sistemas de Informação'),
(2, 'ATEC Palmela', 'Cibersegurança', '2019-05-24', 'O Curso de Técnico/a Especialista em Cibersegurança permite aos formandos implementar e gerir plataformas e sistemas de cibersegurança em organizações, bem como intervir em 1ª linha em incidentes de cibersegurança.\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nInstalar, configurar e colocar em produção plataformas de cibersegurança ao nível das infraestruturas de comunicações e de segurança perimétrica, de tecnologias de informação (servidores web, aplicacionais e de bases de dados), e de suporte aos ambientes colaborativos.</p>\r\n<p>\r\nMonitorizar eventos no ciberespaço e detetar ameaças à cibersegurança.</p>\r\n<p> \r\nResponder (em 1ª linha) a situações anómalas e incidentes de cibersegurança.</p>\r\n<p> \r\nRecolher e efetuar o tratamento de informação e evidências, utilizando ferramentas especializadas.</p>\r\n<p>\r\nPreparar os inputs necessários como apoio à elaboração de relatórios forense por parte de especialistas certificados seguindo os preceitos e regras de rigor forense.</p>', 'Curso de Técnico/a Especialista em Cibersegurança'),
(3, 'ATEC Palmela', 'Gestão de Redes e Sistemas Informáticos', '2019-05-24', 'Empresas e organizações dos mais variados segmentos, dependem cada vez mais das novas tecnologias, que são um fator de vantagem competitiva em qualquer mercado. Assim, os técnicos especializados, capazes de assegurarem os meios necessários (Hardware e Software) e a fiabilidade das redes de computadores, são cada vez mais requisitados pelas empresas.\r\nSabendo dessa necessidade do mercado a ATEC, através do curso de Gestão de Redes e Sistemas Informáticos, atribui aos formandos conhecimentos nas áreas das Comunicações, Sistemas Operativos, Redes de Computadores, Comunicações de Dados, Administração de Redes e Projeto, e de redes informáticas.\r\n<p>\r\nEste curso, baseado no conceito do \"saber fazer\", onde as vertentes práticas e teóricas se complementam com predominância da primeira, tem como objetivo colmatar as carências profissionais desta área, contribuindo para a motivação e para o desenvolvimento pessoal do formando, bem como para a atribuição de competências e conhecimentos capazes de proporcionar oportunidades de emprego \r\naliciantes.</p>\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nGerir tecnicamente redes de dados.</p>\r\n<p>\r\nAnalisar e selecionar equipamentos, sistemas e soluções tipo \"chave na mão\".</p>\r\n<p>\r\nAnalisar e detetar avarias e anomalias. Identificar e corrigir problemas de segurança.</p>\r\n<p>\r\nAplicar as metodologias de segurança da rede e de dados.</p>\r\n<p>\r\nEfetuar a Manutenção, Ampliação e ligação a Redes distintas ao nível de \"Software\".</p>\r\n<p>\r\nProgramar e analisar sistemas de informação.</p>\r\n<p>\r\nReconhecer a necessidade de melhorias e adequação a evolução tecnológica.</p>\r\n<p>\r\nFazer testes e ensaios.</p>', 'Curso de Técnico/a Especialista em Gestão de Redes e Sistemas Informáticos'),
(4, 'ATEC Palmela', 'Tecnologia Mecatrónica', '2019-05-24', 'O Curso de Especialização em Tecnologia Mecatrónica tem por objetivo desenvolver atividades nas áreas de projeto, planeamento, fabrico e manutenção, integrando tecnologias de mecânica, eletrotecnia, automação e informática, com vista ao desenvolvimento de produtos, sistemas e processos melhorados, conducentes a um aumento da qualidade e produtividade.\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nPlanear e projetar equipamentos e sistemas ou, em casos mais complexos, coadjuvar quadros superiores, de modo a contribuir para a modernização de unidades fabris.</p>\r\n<p>\r\nColaborar com os departamentos de I/D no desenvolvimento de novos produtos.</p>\r\n<p>\r\nApoiar a área do planeamento.</p>\r\n<p>\r\nCooperar com a área de manutenção.</p>\r\n<p>\r\nCooperar com a área da qualidade.</p>', 'Curso de Técnico/a Especialista em Tecnologia Mecatrónica'),
(5, 'ATEC Palmela', 'Automação Robótica e Controlo Industrial', '2019-05-24', 'O Curso de Especialização em Automação, Robótica e Controlo Industrial tem por objetivo principal proporcionar conhecimentos avançados em sistemas automáticos de produção, baseados nas mais modernas tecnologias disponíveis na Indústria. Pretende-se em particular formar técnicos com capacidade para dominar o vasto e interdisciplinar mundo da Automação Industrial, de forma a serem capazes de formular e modelar um processo automático de fabrico, atribuindo-lhes a capacidade de projetar e implementar circuitos de comando baseados em autómatos programáveis.\r\n<p>\r\nA indústria de hoje utiliza cada vez mais sistemas de produção robotizados, baseados nos mais modernos sistemas de automação industrial, com base em sistemas computorizados, que utilizam a robótica como sistema de interface com os operadores humanos, com o objetivo de realizar com máquinas inteligentes e altamente produtivas, as tarefas repetitivas e monótonas. Nessas tarefas as máquinas estão mais bem adaptadas, e permitem libertar a atividade humana para tarefas mais condizentes com a sua condição.</p>\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nConceber o projeto, proceder à instalação, programar e colocar em serviço os equipamentos de Automação, Robótica e Controlo Industrial.</p>\r\n<p>\r\nEfetuar a manutenção e a reparação dos equipamentos das áreas de Automação, Robótica e Controlo Industrial.</p>', 'Curso de Técnico/a Especialista em Automação Robótica e Controlo Industrial'),
(6, 'ATEC Palmela', 'Mecatrónica Automóvel, Planeamento e Controlo de Processos', '2020-06-25', 'O/A Técnico/a Especialista em Mecatrónica Automóvel, Planeamento e Controlo de Processos é o/a profissional que vai proceder ao planeamento e controlo de processos de manutenção e reparação automóvel em oficinas, supervisionando os trabalhos de deteção e reparação de avarias nos sistemas mecânicos, elétricos e eletrónicos de veículos automóveis ligeiros e pesados, tendo em vista a maximização da produtividade da oficina de manutenção e reparação automóvel, no respeito pelas normas de segurança ambiental e de higiene e saúde no trabalho.\r\n<p>\r\nOs CETs na ATEC atribuem equivalências em Cursos do Ensino Superior.</p>\r\n<p>\r\nA ATEC tem protocolos com Universidades e Politécnicos que dão equivalência de créditos aos seus formandos dos Cursos de Especialização Tecnológica que pretendam ingressar no ensino superior no final do seu curso. Para saberes mais informações dirige-te à Instituição de Ensino Superior onde te pretendes inscrever.</p>\r\n<p>\r\nPlanear e gerir o trabalho oficinal.</p>\r\n<p>\r\nSupervisionar os trabalhos de manutenção, deteção e reparação de avarias em veículos automóveis ligeiros e pesados.</p>\r\n<p>\r\nAcompanhar e controlar a qualidade dos trabalhos efetuados na oficina, tendo em vista a otimização dos resultados.</p>', 'Curso de Técnico/a Especialista em Mecatrónica Automóvel, Planeamento e Controlo de Processos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `redes`
--

CREATE TABLE `redes` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `redes`
--

INSERT INTO `redes` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(3, 'Diogo Guapo', 'GRSI', '2020-04-15', 'Diploma de Especialização Tecnológica (DET) como \"Técnico Especialista em Gestão de Redes e Sistemas Informáticos\".', 'Certificações', NULL),
(4, 'Diogo Guapo', 'GRSI', '2020-04-15', 'O Curso tem a duração de 1375 horas, com 3 meses de Formação Prática em Contexto de Trabalho numa Empresa. Poderá ter um plano de formação adicional de 400 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `robotica`
--

CREATE TABLE `robotica` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `robotica`
--

INSERT INTO `robotica` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(4, 'Diogo Guapo', 'ARCI', '2020-04-15', 'Diploma de Especialização Tecnológica (DET) como \"Especialista em Automação, Robótica e Controlo Industrial\".', 'Certificações', NULL),
(5, 'Diogo Guapo', 'ARCI', '2020-04-15', 'O Curso tem a duração de 1560 horas, com 3 meses e meio de Formação Prática em Contexto de Trabalho numa empresa. Poderá ter um plano de formação adicional de 500 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(2, 'ROLE_USER'),
(4, 'ROLE_USER'),
(6, 'ROLE_USER'),
(8, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tpsi`
--

CREATE TABLE `tpsi` (
  `id` bigint(20) NOT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `texto` longtext DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `cursoatec_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tpsi`
--

INSERT INTO `tpsi` (`id`, `autor`, `curso`, `data`, `texto`, `titulo`, `cursoatec_id`) VALUES
(4, 'Diogo Guapo', 'TPSI', '2020-04-14', 'Diploma de Especialização Tecnológica (DET) como \"Especialista em Tecnologias e Programação de Sistemas de Informação\".', 'Certificações', NULL),
(6, 'Diogo Guapo', 'TPSI', '2020-04-14', 'O Curso tem a duração de 10 meses (1375 horas), com 2 meses e meio de Formação Prática em Contexto de Trabalho numa Empresa. Poderá ter um plano de formação adicional de 400 horas.', 'Duração', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`id`, `password`, `username`, `email`, `first_name`, `last_name`) VALUES
(1, '$2a$10$m7cYULLzHMy5/wczKJ1ku.f2/.cTAYLcm0/eCDRODKQrhzg7oXJ3W', NULL, 'diogoguapo@mail.com', 'Diogo', 'Guapo'),
(3, '$2a$10$DeWlFQ5DrwSK6QnfIv5HkOvs..B7WGvtjoFoYtltfC2sMObxz.ItW', NULL, 'henriqueguapo@mail.com', 'Henrique', 'Guapo'),
(5, '$2a$10$Q6G1xPfu7Ys28eyEKCiKZe7wMbA6ihaZaMhjMzfK44SR1Mo/zv3q2', NULL, 'antoniofilho@mail.com', 'António', 'Filho'),
(7, '$2a$10$42JsGuALx5x2it2DzuxgZerHDrjoNTaD6tZmH8EgKiePL3pT7cSDK', NULL, 'deboramutiz@mail.com', 'Débora', 'Mutiz');

-- --------------------------------------------------------

--
-- Estrutura da tabela `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(1, 2),
(3, 4),
(5, 6),
(7, 8);

-- --------------------------------------------------------

--
-- Estrutura da tabela `user_roles`
--

CREATE TABLE `user_roles` (
  `users_id` bigint(20) NOT NULL,
  `roles_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `automoveis`
--
ALTER TABLE `automoveis`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKj5d2sveljdpki9ftgtdfdrfcy` (`cursoatec_id`);

--
-- Índices para tabela `ciber`
--
ALTER TABLE `ciber`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlri2o2e00e0fjxru9c2nc3hdb` (`cursoatec_id`);

--
-- Índices para tabela `mecatronica`
--
ALTER TABLE `mecatronica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjtfqrm0fy41f55tqlao7719fc` (`cursoatec_id`);

--
-- Índices para tabela `post_atec`
--
ALTER TABLE `post_atec`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `redes`
--
ALTER TABLE `redes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6ivi7353st847mrjl7deofssc` (`cursoatec_id`);

--
-- Índices para tabela `robotica`
--
ALTER TABLE `robotica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsthrms3nuyec2l9c3kl84fa93` (`cursoatec_id`);

--
-- Índices para tabela `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tpsi`
--
ALTER TABLE `tpsi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfbjj5mhm02o0joen85pi9nyhn` (`cursoatec_id`);

--
-- Índices para tabela `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- Índices para tabela `users_roles`
--
ALTER TABLE `users_roles`
  ADD KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  ADD KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`);

--
-- Índices para tabela `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`users_id`,`roles_id`),
  ADD KEY `FKj9553ass9uctjrmh0gkqsmv0d` (`roles_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `automoveis`
--
ALTER TABLE `automoveis`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `ciber`
--
ALTER TABLE `ciber`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `mecatronica`
--
ALTER TABLE `mecatronica`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `post_atec`
--
ALTER TABLE `post_atec`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `redes`
--
ALTER TABLE `redes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `robotica`
--
ALTER TABLE `robotica`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `tpsi`
--
ALTER TABLE `tpsi`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `automoveis`
--
ALTER TABLE `automoveis`
  ADD CONSTRAINT `FKj5d2sveljdpki9ftgtdfdrfcy` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `ciber`
--
ALTER TABLE `ciber`
  ADD CONSTRAINT `FKlri2o2e00e0fjxru9c2nc3hdb` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `mecatronica`
--
ALTER TABLE `mecatronica`
  ADD CONSTRAINT `FKjtfqrm0fy41f55tqlao7719fc` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `redes`
--
ALTER TABLE `redes`
  ADD CONSTRAINT `FK6ivi7353st847mrjl7deofssc` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `robotica`
--
ALTER TABLE `robotica`
  ADD CONSTRAINT `FKsthrms3nuyec2l9c3kl84fa93` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `tpsi`
--
ALTER TABLE `tpsi`
  ADD CONSTRAINT `FKfbjj5mhm02o0joen85pi9nyhn` FOREIGN KEY (`cursoatec_id`) REFERENCES `post_atec` (`id`);

--
-- Limitadores para a tabela `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);

--
-- Limitadores para a tabela `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `FK7ecyobaa59vxkxckg6t355l86` FOREIGN KEY (`users_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKj9553ass9uctjrmh0gkqsmv0d` FOREIGN KEY (`roles_id`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
