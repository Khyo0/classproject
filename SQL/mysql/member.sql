SELECT `member`.`idx`,
    `member`.`userid`,
    `member`.`password`,
    `member`.`username`,
    `member`.`regdate`
FROM `project`.`member`;
INSERT INTO `project`.`member`
(`idx`, `userid`, `password`, `username`, `regdate`)
VALUES
('1', 'king', '1111', 'king', <{regdate: CURRENT_TIMESTAMP}>);
SELECT * FROM project.member;