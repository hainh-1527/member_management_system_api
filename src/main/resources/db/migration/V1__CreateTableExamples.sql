CREATE TABLE IF NOT EXISTS examples
(
    id          BIGINT(19) AUTO_INCREMENT PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    date        DATE,
    status      TINYINT      NOT NULL,
    description TEXT,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE = INNODB;
