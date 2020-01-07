-- liquibase formatted sql
-- changeset controledegastos:1.0 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`bills` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `name` VARCHAR(255) NOT NULL,
             `user_id` INT NULL,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;
-- changeset controledegastos:1.1 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`monthlyIncome` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `description` VARCHAR(255) NOT NULL,
             `dateIncome` DATETIME NULL,
             `valueIncome` FLOAT(10,7),
             `user_id` INT NULL,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;
-- changeset controledegastos:1.2 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`paymentType` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `type` VARCHAR(255) NOT NULL,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;
-- changeset controledegastos:1.3 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`prospection` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `description` VARCHAR(255) NOT NULL,
             `installments` BIGINT(20) NOT NULL,
             `value` FLOAT(10,7),
             `user_id` INT NULL,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;
-- changeset controledegastos:1.4 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`spentLaunches` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `dateSpent` DATETIME NOT NULL,
             `amountInstallments` BIGINT(20) NOT NULL,
             `valueSpent` FLOAT(10,7),
             `bills_id` INT NULL,
             `paymentType_id` INT NULL,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;
-- changeset controledegastos:1.5 dbms:mysql
CREATE TABLE IF NOT EXISTS `controledegastos`.`user` (
             `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
             `name` VARCHAR(255) NOT NULL,
             `email` VARCHAR(255) NOT NULL,
             `password` VARCHAR(255) NOT NULL,
             `created_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
             PRIMARY KEY (`id`),
             UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
    ENGINE = InnoDB;

